package com.service.dcy;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Dao.dcy.advertdao;
import com.entity.Advert;
import com.entity.Advertorder;
import com.entity.Record;
import com.entity.Spaceorder;
import com.entity.muban;

@Service
public class advertservice {
	@Autowired
	advertdao ad;
	public List<Map<Object, String>> query(int uid){
		return ad.query(uid);
	}
	public List<Map<Object, String>> product(){
		return ad.product();
	}
	public List<muban> querym(int mid,int aid,int uid){
		return ad.querym(mid,aid,uid);
	}
	public List<muban> queryname(int uid){
		return ad.queryname(uid);
	}
	public int insadvert(Advert a){
		return ad.insert(a);
		
	}
	public int seladi(int uid,Date a){
		return ad.selaid(uid, a);
	}
	@Transactional
	public int insert(Record r,Advertorder ao,int sum,int uid){
		int i=0;
		if(ad.insertrecord(r)>0&&ad.insertorder(ao)>0&&ad.upsum(sum, uid)>0){
			i=1;
		}else{
			i=0;
		}
		return i;
	}
	public int selsum(int uid){
		return ad.selsum(uid);
		
	}
	public int selmid(int aid){
		return ad.selmid(aid);
	}
	public List<Map<Object, String>> product1(int aid){
		return ad.product1(aid);
		
	}
	public Integer addspaceorder(Spaceorder so) {
		return ad.addspaceorder(so);
	}
	public String findphone(int uid){
		return ad.findphone(uid);
	}
	public int findurl(int id){
		return ad.findurl(id);
	}
}
