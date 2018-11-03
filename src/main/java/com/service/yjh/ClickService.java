package com.service.yjh;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Dao.yjh.ClickDao;

@Service
public class ClickService {

	@Resource
	ClickDao cdo;

	public int updateadvethits(int aid) {
		return cdo.updateadvethits(aid);
	}

	public int updatespacethits(int aid) {
		return cdo.updatespacethits(aid);
	}

	public int addclick(String ip, String address, int orderid) {
		return cdo.addclick(ip, address, orderid);
	}

	public Integer findipbyadr(String ip) {
		return cdo.findipbyadr(ip);
	}

	public String findurl(int uid) {
		return cdo.findurl(uid);
	}

	public int findoid(int aid) {
		return cdo.findoid(aid);
	}

	public String findmurl(int aid) {
		return cdo.findmurl(aid);
	}
}
