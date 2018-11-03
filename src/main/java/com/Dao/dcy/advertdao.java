package com.Dao.dcy;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.entity.Advert;
import com.entity.Advertorder;
import com.entity.Record;
import com.entity.Spaceorder;
import com.entity.muban;

@Mapper
public interface advertdao {
	@Select("SELECT muban.mid, muban.mname,muban.mimg,muban.murl,advert.close,advert.unit,advert.sum,advert.aform,advert.ctime FROM muban,advert WHERE muban.mid =advert.mid and advert.uid=#{param1}")
	public List<Map<Object, String>> query(int uid);
	@Select("SELECT muban.mid, muban.mname,muban.mimg,muban.murl,advert.aid,advert.close,advert.unit,advert.sum,advert.aform,advert.remark,advert.ctime FROM muban,advert WHERE muban.mid =advert.mid")
	public List<Map<Object, String>> product();
	@Insert("insert into advert(mid,uid,close,ptime,unit,remark,ctime,uptime,sum,aform) values(#{mid},#{uid},#{close},#{ptime},#{unit},#{remark},#{ctime},#{uptime},#{sum},#{aform})")
	public int insert(Advert a);
	//查询图片和url:生成js文件
	@Select("SELECT advert.aid as mid,#{param3} as uid,muban.mimg,muban.murl FROM advert ,muban where muban.mid=#{param1} and advert.aid=#{param2}")
	public List<muban> querym(int mid,int aid,int uid);
	//查询模板名称：广告发布
	@Select("select mid,mname from muban where uid=#{param1} and uudit=1")
	public List<muban> queryname(int uid);
	//扣款：金额表
	@Update("update money set accountsum=accountsum-#{param1},frostsum=frostsum+#{param1} where uid=#{param2}")
	public int upsum(int sum,int uid);
	//添加交易记录：交易记录表
	@Insert("insert into record(uid,type,dsum,ptime,remark) values(#{uid},#{type},#{dsum},#{ptime},#{remark})")
	public int insertrecord(Record r);
	//添加到订单表
	@Insert("insert into advertorder(orderid,aid,ctime,ftime,state,uptime,remark,hits,uid,sum) values(#{orderid},#{aid},#{ctime},#{ftime},#{state},#{uptime},#{remark},#{hits},#{uid},#{sum})")
	public int insertorder(Advertorder ao);
	//查询广告aid，添加到订单表外键
	@Select("select aid from advert where uid=#{param1} and ctime=#{param2}")
	public int selaid(int uid,Date a);
	//查看账户余额：判断
	@Select("select accountsum from money where uid=#{param1}")
	public int selsum(int uid);
	//查询模板id:js
	@Select("select mid from advert where aid=#{param1}")
	public int  selmid(int aid);
	//
	@Select("SELECT muban.mid, muban.mname,muban.mimg,muban.murl,advert.aid,advert.close,advert.unit,advert.sum,advert.aform,advert.uid, advert.remark,advert.ctime FROM muban,advert WHERE muban.mid =advert.mid and advert.aid=#{param1}")
	public List<Map<Object, String>> product1(int aid);
	//添加网站主订单
	@Insert("insert into spaceorder(sid,state,aid,uid,hits,price,art) values(#{sid},#{state},#{aid},#{uid},#{hits},#{price},#{art})")
	Integer addspaceorder(Spaceorder so);
	//查询用户手机号
	@Select("select phone from users where uid=#{param1}")
		String findphone(int uid);	
	@Select("select sitesid from sites,users where sites.uid=users.uid and users.uid=#{param1}")
	int findurl(int id);
}
