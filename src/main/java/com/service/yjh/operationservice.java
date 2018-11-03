package com.service.yjh;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.stereotype.Service;

import com.Dao.yjh.operationDao;

@Service
public class operationservice {

	@Resource 
	operationDao  odao;

	public List<Map<String, Object>> findadvet(String name,Integer uid){
		return odao.findadvet(name,uid);
	}
	public List<Map<String, Object>> findspae(String name){
		return odao.findspae(name);
	}
	public List<Map<String, Object>> findmoney(String name){
		return odao.findmoney(name);
	}
	public List<Map<String, Object>> findfeedback(){
		return odao.findfeedback();
	}
	public int addmsg(String matter,String type,int uid,int state,int oid){
		return odao.addmsg(matter, type, uid, state,oid);
	}
	public 	Integer findbyid(int oid){
		return odao.findbyid(oid);
	}
}
