package com.service.dcy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.dcy.usersdao;


@Service
public class usersservice {
	@Autowired
	usersdao ud;
	public String login(String uname,String rpwd){
		return ud.login(uname, rpwd);
		
	}
}
