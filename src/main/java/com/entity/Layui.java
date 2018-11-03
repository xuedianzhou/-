package com.entity;

import java.util.List;

/**
 * layuui类型封装
 * 
 * @author her
 * 
 */
public class Layui {
	private static final long serialVersionUID = 1L;
	private Integer code;// 解析接口状态 0为有数据
	private String msg;// 解析提示文本
	private Integer count;// 数据长度
	private List data;// 数据

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Layui() {
		super();
	}

	public Layui(Integer code, String msg, Integer count, List<?> data) {
		super();
		this.code = code;
		this.msg = msg;
		this.count = count;
		this.data = data;
	}

	@Override
	public String toString() {
		return "Layui [code=" + code + ", msg=" + msg + ", count=" + count
				+ ", data=" + data + "]";
	}

}
