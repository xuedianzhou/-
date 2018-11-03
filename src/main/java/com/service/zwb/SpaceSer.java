package com.service.zwb;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Dao.zwb.SpaceDao;
import com.entity.Space;
@Service
public class SpaceSer {

	@Resource
	SpaceDao space;
	
	public int add(Space s) {
		return space.add(s);
	}

}
