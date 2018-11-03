package com.service.zwb;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Dao.zwb.SitesDao;
import com.entity.Sites;

@Service
public class SitesSer {

	@Resource
	SitesDao site;

	public int add(Sites s) {
		return site.add(s);
	}
	
	public List<Map<String,Object>> grouping(){
		return site.grouping();
	}
	
	public List<Map<String,Object>> state(int uid){
		return site.state(uid);
	}
	
}
