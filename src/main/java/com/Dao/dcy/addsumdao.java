package com.Dao.dcy;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.AddSum;


@Mapper
public interface addsumdao {
	@Select("select * from addsum")
	public List<AddSum> queryAll();
}
