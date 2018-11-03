package com.Dao.yjh;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;

/**
 * 业务信息
 * 
 * @author her
 * 
 */
@Mapper
public interface operationDao {
	@SelectProvider(type = sql.class, method = "advet")
	List<Map<String, Object>> findadvet(String name, Integer state);// 查看广告信息

	@SelectProvider(type = sql.class, method = "findrecord")
	List<Map<String, Object>> findmoney(String name); // 交易信息

	@SelectProvider(type = sql.class, method = "spaceorder")
	List<Map<String, Object>> findspae(String name); // 查看网站信息

	@Select("select * from feedback,users where feedback.uid=users.uid")
	List<Map<String, Object>> findfeedback();// 订单反馈

	@Insert("insert into message (matter,type,uid,state,orderid) values(#{param1},#{param2},#{param3},#{param4},#{param5})")
	int addmsg(String matter, String type, int uid, int state,int oid);// 添加到消息通知表
		@Select("select wordid from message where orderid=#{param1} and type='订单续费提醒'")
		Integer findbyid(int oid);//查看订单是否通知
	class sql {
		public String advet(String name, Integer state) {
			String sql = "select orderid,uname,advert.aid aid,advert.uid uid,ptime,hits,unit,aform,advertorder.sum,advertorder.ctime ctime,advertorder.state state from advert,muban,users,advertorder where muban.mid=advert.mid and users.uid=muban.uid and advertorder.aid=advert.aid  ";
			if (null != name) {
				sql += "and users.uname=#{param1}";
			}
			if (null != state) {
				sql += "and advertorder.state=#{param2}";
			}
			return sql;
		}

		public String spaceorder(String name) {
			String sql = "select sitesurl,users.uname uname,sname,oid,spaceorder.ptime ptime,spaceorder.state state,spaceorder.hits hits from space,spaceorder,sites,users where sites.uid=users.uid and space.sitesid=sites.sitesid and space.sid=spaceorder.sid";
			if (null != name) {
				sql += "and users.uname=#{param1}";
			}
			return sql;
		}

		public String findrecord(String name) {
			String sql = "select uname,proof,dsum,type,ptime,remark from record,users where users.uid=record.uid";
			if (null != name) {
				sql += "and uname=#{param1}";
			}
			return sql;
		}
	}
}
