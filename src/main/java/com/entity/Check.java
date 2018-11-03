package com.entity;

import java.util.Date;

public class Check {
	private Integer bid;
	private Date ptime;
	private Integer uid;
	private String aName;
	private Integer hits;
	private double income;
	private String details;
	public Check() {
		super();
	}
	public Check(Integer bid, Date ptime, Integer uid, String aName,
			Integer hits, double income, String details) {
		super();
		this.bid = bid;
		this.ptime = ptime;
		this.uid = uid;
		this.aName = aName;
		this.hits = hits;
		this.income = income;
		this.details = details;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Date getPtime() {
		return ptime;
	}
	public void setPtime(Date ptime) {
		this.ptime = ptime;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public Integer getHits() {
		return hits;
	}
	public void setHits(Integer hits) {
		this.hits = hits;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String toString() {
		return "Check [bid=" + bid + ", ptime=" + ptime + ", uid=" + uid
				+ ", aName=" + aName + ", hits=" + hits + ", income=" + income
				+ ", details=" + details + "]";
	}
	
}
