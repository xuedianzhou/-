package com.controller.dcy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.AddSum;
import com.service.dcy.addsumservice;

@RestController
public class addsumcontroller {

	@Autowired
	addsumservice as;
	
	@RequestMapping("queryAll")
	public String queryAll(){
		System.out.println("adsfasd");
		System.out.println(as.queryall());
		return null;
		
	}
	
}
