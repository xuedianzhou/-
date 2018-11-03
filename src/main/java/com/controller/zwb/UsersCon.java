package com.controller.zwb;


import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;





import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;











import com.entity.Users;
import com.service.dcy.usersservice;
import com.service.zwb.UsersSer;
import com.service.zxd.checkService;
import com.util.SmsVerification;

@Controller
// @RequestMapping(value="/users")
public class UsersCon {

	@Resource
	UsersSer user;
	@Resource
	usersservice us;
	@Resource
	SmsVerification sms;
	
	@Resource
	checkService cservice;
	
	
	//登陆
	@RequestMapping("frontlogin")
	public String login(String uname,String rpwd,HttpServletRequest request,HttpServletResponse response) {
		List<Map<String, Object>> list = user.query(uname, rpwd);
		System.out.println();
		
		 String uids=us.login(uname, rpwd);
		int uid=Integer.parseInt(uids);
		if(list.size()>0){
		 HttpSession session=request.getSession();	
	     session.setAttribute("uname", uname);
	     session.setAttribute("list",list);
	     session.setAttribute("uid", uid);
		return "front/layui.jsp";
		
		}else{
		return "error.jsp";
		}
	}
	
	//注册 zwb
	@RequestMapping("/add")
	public String add(Users u){
		System.out.println("添加");
		
		u.setCtime(new Date());
		u.setUptime(new Date());
		user.add(u);
		return "front/login.jsp";
	}
	
	//手机号验证 zwb
	@RequestMapping("/code")
	@ResponseBody
	public int getCode(String phone){
		System.out.println("phone"+phone);
		int code = sms.getVerificationCode(phone);
		System.out.println(code);
		return code;
	}
	//个人中心 zxd
	@RequestMapping("center")
	public String center(int uid,Model m){
	   		List<Map<String,Object>> list=user.center(uid);
	   		List<Map<String,Object>> checkshow=cservice.checkshow(uid);
			System.out.println(checkshow);
			m.addAttribute("checkshow",checkshow);
	   		m.addAttribute("list",list);
		if(list.size()>0){
			return "front/center.jsp";
		}else{
			return "error.jsp";
		}
		
		
	}
	
	
}
