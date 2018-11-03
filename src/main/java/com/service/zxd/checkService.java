package com.service.zxd;



import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Dao.zxd.checkDao;

@Service
public class checkService {
	
	@Resource
	checkDao cDao;
	
	public List<Map<String,Object>> checkshow(int uid){
		return cDao.checkshow(uid);
		
	}

}
