package com.controller.yjh;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.entity.Layui;
import com.service.yjh.userservice;

@RequestMapping
@RestController
@SessionAttributes("name")
public class Usercontroller {

	@Resource
	public userservice use;

	/**
	 * 查看所有用户
	 * 
	 * @return
	 */
	@RequestMapping("find")
	@ResponseBody
	public Layui find(String name) {

		List<Map<String, Object>> l = null;
		if (null != name && ! name.equals("")) {// 姓名查询

			l = use.findusers(name, 0);
		} else {// 查看所有用户
			l = use.findusers(null, 0);
		}
		Layui lay = new Layui();
		lay.setCode(0);
		lay.setCount(l.size());
		lay.setData(l);
		return lay;
	}
	/**
	 * 查看被禁用户
	 * @return
	 */
	@RequestMapping("findstop")
	@ResponseBody
	public Layui findstop(){
		List<Map<String, Object>> l = use.findusers(null, 1);
		Layui lay = new Layui();
		lay.setCode(0);
		lay.setCount(l.size());
		lay.setData(l);
		return lay;
	}

	/**
	 * 冻结账户
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("upstate")
	@ResponseBody
	public boolean upusersbystate(int id,int state) {
		if (use.upusertbystate(state, id) > 0) {
			return true;
		} else
			return false;
	}
	
	@RequestMapping("login")
	@ResponseBody
	public String login(String name,String pwd,Model model){
		List l=use.login(name, pwd);
		System.out.println(l);
		if(null!=l && l.size()>0){
			model.addAttribute("name",name);
			return "ok";
		}else{
			
			return "no";
		}
		
		
	}
}
