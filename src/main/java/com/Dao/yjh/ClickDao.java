package com.Dao.yjh;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ClickDao {
	// 添加到点击量表测试是否作弊
	@Insert("insert into clicknumber(ip,address,orderid) values(#{param1},#{param2},#{param3})")
	int addclick(String ip, String address, int orderid);

	/**
	 * 查询出最近一次的点击时间，在求出时间差 如果新用户则当前时间加1分钟，求出的时间差是-1 则可以相加
	 * 
	 * @param ip
	 * @return
	 */
	@Select("select TIMESTAMPDIFF(MINUTE,(SELECT ifnull(max(ctime),DATE_ADD(now(), INTERVAL 1 minute)) time FROM clicknumber where ip=#{param1} order by cid desc),now())")
	Integer findipbyadr(String ip);

	// 广告主点击量+1
	@Update("update advetorder set hits=hits+1 where aid=#{param1} ")
	int updateadvethits(int aid);

	// 网站主点击量+1
	@Update("update spaceorder set hits=hits+1 where aid=#{param1} ")
	int updatespacethits(int aid);

	// 根据用户查询网站地址
	@Select("select sitesurl from sites where uid=#{param1} ")
	String findurl(int uid);

	// 查询订单
	@Select("select orderid from advetorder where aid=#{param1}")
	int findoid(int aid);

	// 跳转路径
	@Select("select murl from muban,advert where muban.mid=advert.mid and aid=#{param1}")
	String findmurl(int aid);
}
