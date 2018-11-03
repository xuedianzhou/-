package com.entity;

import java.util.Date;

public class Record {
	private Integer dealid;
	private Integer uid;
	private Integer type;
	private double dsum;
	private Date ptime;
	private String remark;
	public Record() {
		super();
	}
	public Record(Integer dealid, Integer uid, Integer type, double dsum,
			Date ptime, String remark) {
		super();
		this.dealid = dealid;
		this.uid = uid;
		this.type = type;
		this.dsum = dsum;
		this.ptime = ptime;
		this.remark = remark;
	}
	public Integer getDealid() {
		return dealid;
	}
	public void setDealid(Integer dealid) {
		this.dealid = dealid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public double getDsum() {
		return dsum;
	}
	public void setDsum(double dsum) {
		this.dsum = dsum;
	}
	public Date getPtime() {
		return ptime;
	}
	public void setPtime(Date ptime) {
		this.ptime = ptime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String toString() {
		return "Record [dealid=" + dealid + ", uid=" + uid + ", type=" + type
				+ ", dsum=" + dsum + ", ptime=" + ptime + ", remark=" + remark
				+ "]";
	}
	
}
