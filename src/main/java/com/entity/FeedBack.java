package com.entity;

import java.util.Date;

public class FeedBack {
	private Integer cid;
	private String matter;
	private Integer uid;
	private Integer orderid;
	private Date ptime;
	public FeedBack() {
		super();
	}
	public FeedBack(Integer cid, String matter, Integer uid, Integer orderid,
			Date ptime) {
		super();
		this.cid = cid;
		this.matter = matter;
		this.uid = uid;
		this.orderid = orderid;
		this.ptime = ptime;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getMatter() {
		return matter;
	}
	public void setMatter(String matter) {
		this.matter = matter;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public Date getPtime() {
		return ptime;
	}
	public void setPtime(Date ptime) {
		this.ptime = ptime;
	}
	public String toString() {
		return "FeedBack [cid=" + cid + ", matter=" + matter + ", uid=" + uid
				+ ", orderid=" + orderid + ", ptime=" + ptime + "]";
	}
	
}
