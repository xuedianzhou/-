package com.Dao.zwb;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.entity.Users;

@Mapper
public interface UsersDao {
	@Select("select * from users where uname=#{param1} and rpwd=#{param2} and state=0")
	List<Map<String,Object>> query(String uname,String rpwd);

	
	
	@Insert("insert into users(uname,phone,rpwd,state,ctime,uptime) values(#{uname},#{phone},#{rpwd},0,#{ctime},#{uptime})")
	int add(Users u);
	
	@Select("select u.uid,u.uname,u.phone,u.ctime,u.proof,m.sum,u.userimg from users u, money m  where u.uid=m.uid and u.uid=#{param1}")
	List<Map<String,Object>> center(int uid);
}
