package com.controller.dcy;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Advert;
import com.entity.Advertorder;
import com.entity.Record;
import com.entity.Spaceorder;
import com.entity.muban;
import com.service.dcy.advertservice;
import com.service.dcy.mubanservice;
import com.util.SmsVerification;

@Controller
@RequestMapping("advert")
public class advertcontroller {
	@Autowired
	advertservice as;

	@RequestMapping("query")
	public String query(Model mo, HttpSession session) {
		int uid = (int) session.getAttribute("uid");
		List<Map<Object, String>> list = as.query(uid);
		mo.addAttribute("advert", list);
		return "jsp/showadvert.jsp";
	}

	@RequestMapping("product")
	public String product(Model mo) {
		List<Map<Object, String>> list = as.product();
		mo.addAttribute("advert", list);
		return "jsp/product.jsp";
	}

	@RequestMapping("qm")
	@ResponseBody
	public List<muban> querym(String cid, HttpSession session) {
		int uid = (int) session.getAttribute("uid");
		int aid = Integer.parseInt(cid);
		int mid = as.selmid(aid);
		List<muban> list = as.querym(mid, aid, uid);
		System.out.println(list);
		return list;
	}

	@RequestMapping("qname")
	public String queryname(Model mo, HttpSession session) {
		int uid = (int) session.getAttribute("uid");
		List<muban> list = as.queryname(uid);
		mo.addAttribute("qname", list);
		return "jsp/addadvert.jsp";

	}

	@RequestMapping("insert")
	public String inserta(Model mo, HttpSession session, String remark,
			String close, Integer mid, String aform, Double unit, Integer sum) {
		int uid = (int) session.getAttribute("uid");
		Date a = new Date();
		int d = 0;// 传值判断：1发布成功2,余额不足
		if (as.selsum(uid) >= sum) {
			Advert ad = new Advert();
			ad.setAform(aform);
			ad.setClose("点击量");
			ad.setCtime(a);
			ad.setMid(mid);
			ad.setPtime(a);
			ad.setRemark(remark);
			ad.setSum(sum);
			ad.setUid(uid);
			ad.setUnit(unit);
			ad.setUptime(null);
			// 添加advert表
			as.insadvert(ad);
			int aid = as.seladi(uid, a);
			Record r = new Record();
			r.setUid(uid);
			// 1,冻结金额
			r.setType(1);
			r.setDsum(sum);
			r.setPtime(a);
			r.setRemark("订单预算金额");
			Advertorder ao = new Advertorder();
			ao.setAid(aid);
			ao.setCtime(a);
			ao.setFtime(null);
			// 订单状态0正在执行，1已结束
			ao.setState(0);
			ao.setUptime(a);
			ao.setRemark(remark);
			ao.setHits(0);
			ao.setSum(sum);
			as.insert(r, ao, sum, uid);
			d = 1;
		} else {
			d = 2;
		}
		mo.addAttribute("ass", d);
		return "jsp/addadvert.jsp";

	}

	@RequestMapping("selaid")
	public String selaid(int aid, Model mo) {
		System.out.println(aid);
		List<Map<Object, String>> list = as.product1(aid);
		mo.addAttribute("list", list);
		return "jsp/spaceorder.jsp";
	}

	/**
	 * 添加网站主订单，订单成功发送短信通知广告主
	 * 
	 * @param uid
	 * @param aid
	 * @param price
	 * @param session
	 * @return
	 */
	@SuppressWarnings("static-access")
	@RequestMapping("addspaceorder")
	@ResponseBody
	public String addspaceorder(int uid, int aid, double price,
			HttpSession session) {
		System.out.println(1);
		SmsVerification svf = new SmsVerification();
		int id = (int) session.getAttribute("uid");// 获取
		int sid = as.findurl(id);//获取网站id
		Spaceorder so= new Spaceorder();
		so.setSid(sid); 
		so.setState(1);
		so.setAid(aid);
		so.setUid(uid);
		so.setHits(0);
		so.setPrice(price);
		so.setArt(0);
		if (as.addspaceorder(so) > 0) {
			return "ok";
		}
		return "no";
	}
}
