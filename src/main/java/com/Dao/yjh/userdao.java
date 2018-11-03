package com.Dao.yjh;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

/**
 * 用户操作
 * 
 * @author her
 * 
 */
@Mapper
public interface userdao {
	// 查看用户
	@SelectProvider(type = sql.class, method = "findu")
	List<Map<String, Object>> findusers(String name, Integer state);

	// 查看广告主
	@Select("select * from dsp")
	List<Map<String, Object>> finddsp();

	// 查看网站主
	@Select("select * from sites")
	List<Map<String, Object>> findsites();

	// 用户禁用
	@Update("update users set state=#{param1} where uid=#{param2} ")
	int upusertbystate(int state, int uid);

	// 管理员登录

	@Select("select * from adminuser where name=#{param1} and pwd=#{param2}")
	List<Map<String, Object>> login(String name, String pwd);

	/**
	 * sql
	 * 
	 * @author her
	 * 
	 */
	class sql {
		public String findu(String name, Integer state) {
			String sql = "select * from users where 1=1 ";
			if (null != name) {
				sql = sql + " and uname='" + name + "'";
			}
			if (null != state) {
				sql = sql + " and  state = " + state;
			}
			return sql;
		}
	}
}
