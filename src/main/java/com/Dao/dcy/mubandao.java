package com.Dao.dcy;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.muban;

@Mapper
public interface mubandao {
	
	@Select("select * from muban where uid=#{param1}")
	public List<muban> query(int uid);
	
	@Insert("insert into muban(mname,mimg,murl,uid,uudit) values(#{mname},#{mimg},#{murl},#{uid},#{uudit})")
	public int insert(muban mb);
	
	@Delete("delete from muban where mid=#{mid}")
	public int del(int mid);
}
