package com.Dao.zwb;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.Sites;

@Mapper
public interface SitesDao {
	//广告认证 zwb
	@Insert("insert into sites(dns,sitesurl,pv,`grouping`,pc,uid,ptime,state,address,sort)"
			+ " values(#{dns},#{sitesurl},#{pv},#{grouping},#{pc},#{uid},now(),0,#{address},#{sort})")
	public int add(Sites s);
	
	//查询grouping zxd
	@Select("select grouping from sites")
	public List<Map<String,Object>> grouping();
    
	//判断网站认证 zxd
	@Select("select state from sites where uid=#{param1}")
	public List<Map<String,Object>> state(int uid);


}
