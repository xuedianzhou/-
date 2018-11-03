package com.controller.zxd;



import io.goeasy.GoEasy;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.zxd.messageService;


@Controller
public class messageCon {
	
	@Resource
	messageService mservice;
	
	@RequestMapping("messashow")
	public void messashow(int uid){
		int list=mservice.messageshow(uid);
		if(list>0){
		GoEasy goEasy = new GoEasy("rest-hangzhou.goeasy.io", "BC-d28d9b29a88a4676875adacee352444a");
		goEasy.publish("x", "有未读消息通知");
		}else{
			System.out.println("都是以读消息");
		}
		
	}

}
