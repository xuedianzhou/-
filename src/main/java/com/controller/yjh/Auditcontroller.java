package com.controller.yjh;


import io.goeasy.GoEasy;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.scripting.xmltags.VarDeclSqlNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Layui;
import com.service.yjh.auditservice;
import com.service.yjh.operationservice;

@RequestMapping("/check")
@RestController
public class Auditcontroller {

	@Resource
	auditservice ase;
	@Resource
	operationservice ose;

	//调用消息推送接口
	GoEasy goEasy = new GoEasy("rest-hangzhou.goeasy.io", "BC-d28d9b29a88a4676875adacee352444a");
	/**
	 * 查询数据
	 * 
	 * @return
	 */
	@RequestMapping("checkdsp")
	@ResponseBody
	public Layui findcheckbydsp() {
		List<Map<String, Object>> list = ase.checkdsp();
		System.out.println(list);
		Layui lay = new Layui();
		lay.setCode(0);
		lay.setData(list);
		lay.setCount(list.size());
		return lay;
	}

	/**
	 * 修改模板表审核状态，添加到广告审核表，在添加审核记录
	 * 
	 * @param mid
	 * @param aid
	 * @param state
	 * @param test
	 * @return
	 */
	@RequestMapping("addcheckdsp")
	@ResponseBody
	public String addcheckdsp(Integer mid, Integer aid, Integer state,
			String test, int uid) {
		String remake = null;
		if (ase.addbydsp(mid, aid, state, test) > 0
				&& ase.upstatebyadvet(state, mid) > 0
				&& ase.addcheclrm(aid, "广告模板审核", state, aid) > 0) {
			if (state == 5) {// 判断状态是否审核成功
				remake = "您的模板审核成功了,开始使用吧";
			} else {
				remake = "您的模板审核失败,原因:" + test;
			}
				//发送给谁；发送的内容
			System.out.println("user"+uid);
			goEasy.publish("user"+uid, "有未读消息");
			int a = ose.addmsg(remake, "广告模板审核", uid, 0,0);// 添加消息通知			
			return "ok";
		} else
			return "no";
	}

	/**
	 * 网站数据
	 * 
	 * @return
	 */
	@RequestMapping("checksites")
	@ResponseBody
	public Layui checksites() {
		List<Map<String, Object>> list = ase.checksites();
		System.out.println(list);
		Layui l = new Layui();
		l.setCode(0);
		l.setCount(list.size());
		l.setData(list);
		return l;
	}

	/**
	 * 修改网站表审核状态，添加到网站审核表，在添加审核记录
	 * 
	 * @param sid
	 * @param aid
	 * @param state
	 * @param test
	 * @return
	 */
	@RequestMapping("addchecksites")
	@ResponseBody
	public String addchecksites(Integer sid, Integer aid, Integer state,
			String test, int uid) {
		String remake = null;
		if (ase.addbysites(sid, aid, state, test) > 0
				&& ase.upstatebysites(state, sid) > 0
				&& ase.addcheclrm(aid, "网站审核", state, aid) > 0) {
			if (state == 5) {// 判断状态是否审核成功
				remake = "您的网站信息审核成功了,开始使用吧";
			} else {
				remake = "您的网站信息审核失败,原因:" + test;
			}
			int a = ose.addmsg(remake, "广告模板审核", uid, 0,0);// 添加消息通知
				
			goEasy.publish("user"+uid, "有未读消息");
			System.out.println(a);
			return "ok";
		} else
			return "no";
	}

	@RequestMapping("checkspace")
	@ResponseBody
	public Layui checkspace() {
		List<Map<String, Object>> list = ase.checkbad();
		Layui l = new Layui();
		l.setCount(list.size());
		l.setData(list);
		l.setCode(0);
		return l;
	}

	/*
	 * 添加广告位审核，修改广告位审核状态，添加审核记录表
	 */
	@RequestMapping("addspce")
	@ResponseBody
	public String addspace(int sid, int aid, int state, String test, int uid) {
		String remake = null;
		if (ase.addbyspace(sid, aid, state, test) > 0
				&& ase.updatestatebyspace(state, sid) > 0
				&& ase.addcheclrm(aid, "广告位审核", state, aid) > 0) {
			if (state == 5) {// 判断状态是否审核成功
				remake = "您的广告位审核成功了,开始使用吧";
			} else {
				remake = "您的广告位审核失败,原因:" + test;
			}
			int a = ose.addmsg(remake, "广告模板审核", uid, 0,0);// 添加消息通知
			
				//发送给谁；发送的内容
			goEasy.publish("user"+uid, "有未读消息");
			System.out.println(a);
			return "ok";
		} else {
			return "no";
		}
	}

	
}
