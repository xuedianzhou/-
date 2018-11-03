package com.Dao.zxd;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface messageDao {
	
	@Select("select * from message where uid=#{uid} and state=0")
	public int messageshow(int uid);

	@Select("select * from message where uid=#{uid}")
	public List<Map<String,Object>> messageqbshow(int uid);
	
	
	
}
