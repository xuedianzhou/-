package com.Dao.dcy;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface usersdao {
	@Select("select uid from users where uname=#{param1} and rpwd=#{param2} and state=0")
	public String login(String uname,String rpwd);
}
