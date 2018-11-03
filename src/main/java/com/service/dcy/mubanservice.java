package com.service.dcy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.dcy.mubandao;
import com.entity.muban;

@Service
public class mubanservice {
	@Autowired
	mubandao md;
	
	public List<muban> query(int uid){
		return md.query(uid);
	}
	
	public int insert(muban mb){
		return md.insert(mb);
	}
	
	public int del(int mid){
		return md.del(mid);
	}
}
