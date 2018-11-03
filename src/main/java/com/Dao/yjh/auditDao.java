package com.Dao.yjh;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 审核管理 广告模板，广告位，网站，订单
 * 
 * @author her
 * 
 */
@Mapper
public interface auditDao {

	/**
	 * 审核流程：查看待审核广告，修改状态，添加到审核表
	 * 
	 * @return
	 */
	@Select("SELECT mid,mname,mimg,murl,uname,uudit,muban.uid id FROM muban,users where muban.uid=users.uid and uudit=0")
	List<Map<String, Object>> checkdsp();

	@Update("update muban set uudit=#{param1} where mid=#{param2} ")
	int upstatebyadvet(int state, int aid);

	@Insert("insert into dspcheck(did,aid,state,test) values(#{param1},#{param2},#{param3},#{param4})")
	int addbydsp(int did, int aid, int state, String test);

	@Select("select sitesid,dns,sitesurl,pv,pc,uname,sites.state s,sites.uid id,address from sites,users where sites.uid=users.uid and sites.state=0")
	List<Map<String, Object>> checksites();

	@Update("update sites set state=#{param1} where sitesid=#{param2}")
	int upstatebysites(int state, int sitesid);

	@Insert("insert into sitescheck(sid,aid,state,test)values(#{param1},#{param2},#{param3},#{param4}) ")
	int addbysites(int sid, int aid, int state, String test);

	@Select("SELECT sid,wide,high,sitesurl,hits,remark,space.state s,states,uid FROM space,sites where space.sitesid=sites.sitesid and states=0")
	List<Map<String, Object>> checkbad();//

	@Update("update space set states=#{param1} where sid=#{param2}")
	int updatestatebyspace(int state, int sid);

	@Insert("insert into badcheck (sid,aid,state,test) values(#{param1},#{param2},#{param3},#{param4})")
	int addbyspace(int sid, int aid, int state, String test);

	// 添加审核记录
	@Insert("insert into checkrecord (aid,rname,state,id) values (#{param1},#{param2},#{param3},#{param4})")
	int addcheclrm(int aid, String rname, int state, int id);
}
