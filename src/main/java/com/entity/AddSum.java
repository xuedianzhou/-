package com.entity;

import java.util.Date;

public class AddSum {
	private Integer addid;
	private Integer addsum;
	private Date addptime;
	private Integer uid;
	private Integer aid;
	public AddSum() {
		super();
	}
	public AddSum(Integer addid, Integer addsum, Date addptime, Integer uid,
			Integer aid) {
		super();
		this.addid = addid;
		this.addsum = addsum;
		this.addptime = addptime;
		this.uid = uid;
		this.aid = aid;
	}
	public Integer getAddid() {
		return addid;
	}
	public void setAddid(Integer addid) {
		this.addid = addid;
	}
	public Integer getAddsum() {
		return addsum;
	}
	public void setAddsum(Integer addsum) {
		this.addsum = addsum;
	}
	public Date getAddptime() {
		return addptime;
	}
	public void setAddptime(Date addptime) {
		this.addptime = addptime;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String toString() {
		return "AddSum [addid=" + addid + ", addsum=" + addsum + ", addptime="
				+ addptime + ", uid=" + uid + ", aid=" + aid + "]";
	}
	
}
