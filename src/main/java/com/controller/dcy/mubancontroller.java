package com.controller.dcy;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.muban;
import com.service.dcy.mubanservice;

@Controller
@RequestMapping("muban")
public class mubancontroller {
	@Autowired
	mubanservice ms;
	@RequestMapping("query")
	public String query(Model mo,HttpSession session){
		int uid= (int) session.getAttribute("uid");
		List<muban> list=ms.query(uid);
		mo.addAttribute("selmuban", list);
		return "jsp/showmuban.jsp";
	}
	@RequestMapping("del")
	public String insert(int mid){
		ms.del(mid);
		return "muban/query";
		
	}
}
