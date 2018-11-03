package com.Dao.zwb;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Space;

@Mapper
public interface SpaceDao {

	//
	@Insert("insert into space(sitesid,wide,high,uname,ptime,`grouping`,sname,surl,remark,hits) values"
			+ "(#{sitesid},#{wide},#{high},#{uname},now(),#{grouping},#{sname},#{surl},#{remark},#{hits})")
	public int add(Space s);
}
