package com.controller.zwb;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;



import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.entity.Space;
import com.service.zwb.SpaceSer;

@Controller
public class SpaceCon {

	@Resource
	SpaceSer space;
	
	//广告位申请 zwb
	@RequestMapping("/add_space")
	public String updateuser(@RequestParam MultipartFile imgs,Space s,HttpServletRequest request) throws IllegalStateException, IOException{
		String name = UUID.randomUUID().toString().replaceAll("-", "");
		
		String ext = FilenameUtils.getExtension(imgs.getOriginalFilename());
		
		String url = request.getSession().getServletContext().getRealPath("/img/zxd");
		
	
		File saveFile=new File(url+"/"+name + "." + ext);
		imgs.transferTo(saveFile);
		
		s.setSurl("img/zxd/"+name + "." + ext);
		
		System.out.println(saveFile);
		
		
	
		 int rs=space.add(s);
		 System.out.println(rs);
		return "front/layui.jsp";
		 
		
	}
	
	@InitBinder
	public void init(WebDataBinder binder) {
	binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
}
