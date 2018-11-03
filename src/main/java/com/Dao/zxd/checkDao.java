package com.Dao.zxd;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface checkDao {
	
	@Select("select * from checks where uid=#{uid}")
	List<Map<String,Object>> checkshow(int uid);

}
