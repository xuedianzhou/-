package com.service.dcy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.dcy.addsumdao;
import com.entity.AddSum;

@Service
public class addsumservice {
	@Autowired
	addsumdao ad;
	public List<AddSum> queryall(){
		return ad.queryAll();
		
	}
}
