package com.service.zwb;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Dao.zwb.MoneyDao;
import com.entity.Money;

@Service
public class MoneySer {

	@Resource
	MoneyDao money;

	public int add(Money m) {
		return money.add(m);
	}

	public List<Map<String, Object>> query(Integer uid) {
		return money.query(uid);
	}
	
	public int zcfcz(double sum,int uid){
		return money.zcfcz(sum, uid);
		
	}
}
