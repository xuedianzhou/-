package com.controller.zwb;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Sites;
import com.service.zwb.SitesSer;
import com.sun.org.apache.xpath.internal.operations.Mod;

@Controller

public class SitesCon {

	@Resource
	SitesSer site;
	
	//网站主认证 zwb
	@RequestMapping("a")
	public String add(Sites s){
		int add = site.add(s);
	    if(add>0){
		return "front/layui.jsp";
	    }else{
	    return "error.jsp";
	    }
	}
	
	//查询网站分组 zxd
	@RequestMapping("grouping")
	public String grouping(Model mo){
		List<Map<String,Object>> list=site.grouping();
		mo.addAttribute("list",list);
		return "front/space.jsp";
	}
	
	//判断是否认证网站 zxd
	@RequestMapping("state")
	@ResponseBody
	public String state(int uid){
		System.out.println(uid);
		List<Map<String,Object>> list=site.state(uid);
		System.out.println(list);
		if(list.size()>0){
			
			return "1";
		}else{
			return "0";
		}
		
		
	}
	
	@InitBinder
	public void init(WebDataBinder binder) {
	binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
	
}
