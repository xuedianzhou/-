package com.Dao.zwb;

import java.util.List;
import java.util.Map;






import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.entity.Money;

@Mapper
public interface MoneyDao {
	
	@Insert("insert into money(uid,accountsum,frostsum,sum,uptime) values(#{uid},#{accountsum},#{frostsum},#{sum},now())")
	public int add(Money m);

	@Select("select count(accountsum) accountsum,count(frostsum) frostsum,count(sum) sum from money where uid=#{uid}")
	public List<Map<String, Object>> query(Integer uid);
	
    @Update("update money set sum=sum+#{param1} where uid=#{param2}")
	public int zcfcz(double sum,int uid);


}
