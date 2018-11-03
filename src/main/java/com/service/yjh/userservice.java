package com.service.yjh;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Dao.yjh.userdao;

@Service
public class userservice {

	@Resource
	userdao udao;

	public List<Map<String, Object>> findusers(String name, Integer state) {
		return udao.findusers(name, state);
	}
	
	public int upusertbystate(int state,int uid){
		return udao.upusertbystate(state, uid);
	}
	public List<Map<String, Object>> login(String name, String pwd){
		return udao.login(name, pwd);
	}

}
