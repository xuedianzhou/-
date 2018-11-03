package com.service.zxd;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.zxd.messageDao;

@Service
public class messageService {
	
	@Autowired 
	messageDao mdao;
	
	public int messageshow(int uid){
		return mdao.messageshow(uid);
		
	}
	
	public List<Map<String,Object>> messageqbshow(int uid){
		return mdao.messageqbshow(uid);
		
	}

}
