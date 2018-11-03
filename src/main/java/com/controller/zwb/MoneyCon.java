package com.controller.zwb;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Money;
import com.service.zwb.MoneySer;

@Controller
public class MoneyCon {

	@Resource
	MoneySer money;
	
	@RequestMapping("/add_money")
	public String add(Money m){
		System.out.println("money-----");
		money.add(m);
		return "front/success.jsp";
	}
}
