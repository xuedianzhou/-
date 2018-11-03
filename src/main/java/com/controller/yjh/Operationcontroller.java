package com.controller.yjh;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Layui;
import com.service.yjh.operationservice;

@RequestMapping("option")
@RestController
/**
 * 网站主，广告主，交易记录
 * @author her
 *
 */
public class Operationcontroller {
	@Resource
	operationservice ose;

	@RequestMapping("ad")
	@ResponseBody
	public Layui findadvet(String name) {
		List<Map<String, Object>> l;
		if (null != name) {

			l = ose.findadvet(name,null);
		} else
			l = ose.findadvet(null,null);
		Layui lay = new Layui();
		lay.setCode(0);
		lay.setCount(l.size());
		lay.setData(l);
		return lay;
	}

	@RequestMapping("space")
	@ResponseBody
	public Layui findspace(String name) {
		List<Map<String, Object>> l;
		if (null != name) {

			l = ose.findspae(name);
		} else
			l = ose.findspae(null);
		Layui lay = new Layui();
		lay.setCode(0);
		lay.setCount(l.size());
		lay.setData(l); 
		return lay;
	}

	@RequestMapping("money")
	@ResponseBody
	public Layui findmoney(String name) {
		List<Map<String, Object>> l;
		if (null != name) {

			l = ose.findmoney(name);
		} else
			l = ose.findmoney(name);
		Layui lay = new Layui();
		lay.setCode(0);
		lay.setCount(l.size());
		lay.setData(l);
		return lay;
	}

	/**
	 * 查看订单反馈
	 * 
	 * @return
	 */
	@RequestMapping("feed")
	@ResponseBody
	public Layui findfeedback() {
		List<Map<String, Object>> l = ose.findfeedback();
		Layui lay = new Layui();
		lay.setCode(0);
		lay.setCount(l.size());
		lay.setData(l);
		return lay;
	}

	/**
	 * 订单回执
	 */
	@RequestMapping("addmsg")
	@ResponseBody
	public String addmsg(String matter, String type, int uid) {
		if (ose.addmsg(matter, type, uid, 0,0) > 0) {
			return "ok";
		} else
			return "no";

	}
}
