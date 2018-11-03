package com.controller.yjh;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.goeasy.GoEasy;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.yjh.ClickService;

@RequestMapping("/click")
@Controller
public class ClickController {

	@Resource
	ClickService cse;

	/**
	 * 获取IP
	 * 
	 * @param request
	 * @return IP地址
	 */
	public static String getClientIP(HttpServletRequest httpservletrequest) {
		if (httpservletrequest == null)
			return null;
		String s = httpservletrequest.getHeader("X-Forwarded-For");
		if (s == null || s.length() == 0 || "unknown".equalsIgnoreCase(s))
			s = httpservletrequest.getHeader("Proxy-Client-IP");
		if (s == null || s.length() == 0 || "unknown".equalsIgnoreCase(s))
			s = httpservletrequest.getHeader("WL-Proxy-Client-IP");
		if (s == null || s.length() == 0 || "unknown".equalsIgnoreCase(s))
			s = httpservletrequest.getHeader("HTTP_CLIENT_IP");
		if (s == null || s.length() == 0 || "unknown".equalsIgnoreCase(s))
			s = httpservletrequest.getHeader("HTTP_X_FORWARDED_FOR");
		if (s == null || s.length() == 0 || "unknown".equalsIgnoreCase(s))
			s = httpservletrequest.getRemoteAddr();
		if ("127.0.0.1".equals(s) || "0:0:0:0:0:0:0:1".equals(s))
			try {
				s = InetAddress.getLocalHost().getHostAddress();
			} catch (UnknownHostException unknownhostexception) {
			}
		return s;
	}

	/**
	 * 获取点击的ip地址是否一小时之内重复点击 如果没有则添加到点击记录表
	 * 
	 * @param ip
	 * @throws IOException 
	 */
	@RequestMapping("findip")
	@ResponseBody
	public void findip(HttpServletRequest httpservletrequest, int aid, int uid,
			HttpServletResponse response) throws IOException {
		String ip = getClientIP(httpservletrequest);
		Integer min = cse.findipbyadr(ip);// 查询该ip距离上次点击的时间差（分钟）
		System.out.println(min);
		String url="";
		if (min < 30 && min == -1) { // 如果大于三十分钟则表示该用户再次点击时间大于半小时，如果等于-1表示该用户是第一次点击
			if (cse.updateadvethits(aid) > 0 && cse.updatespacethits(aid) > 0	//添加点击量
					&& cse.addclick(ip, cse.findurl(uid), cse.findoid(aid)) > 0) {
				url = cse.findmurl(aid);		//获取需要跳转的广告主页面
					System.out.println("执行成功");
					// TODO Auto-generated catch block
			}
		}
		response.sendRedirect("https://www.baidu.com/");//跳转到另一个页面
	}
}
