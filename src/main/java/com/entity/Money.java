package com.entity;

import java.util.Date;

public class Money {
	private Integer sumid;
	private Integer uid;
	private double accountsum;
	private double frostsum;
	private double sum;
	private Date uptime;
	public Money() {
		super();
	}
	public Money(Integer sumid, Integer uid, double accountsum,
			double frostsum, double sum, Date uptime) {
		super();
		this.sumid = sumid;
		this.uid = uid;
		this.accountsum = accountsum;
		this.frostsum = frostsum;
		this.sum = sum;
		this.uptime = uptime;
	}
	public Integer getSumid() {
		return sumid;
	}
	public void setSumid(Integer sumid) {
		this.sumid = sumid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public double getAccountsum() {
		return accountsum;
	}
	public void setAccountsum(double accountsum) {
		this.accountsum = accountsum;
	}
	public double getFrostsum() {
		return frostsum;
	}
	public void setFrostsum(double frostsum) {
		this.frostsum = frostsum;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public Date getUptime() {
		return uptime;
	}
	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}
	public String toString() {
		return "Money [sumid=" + sumid + ", uid=" + uid + ", accountsum="
				+ accountsum + ", frostsum=" + frostsum + ", sum=" + sum
				+ ", uptime=" + uptime + "]";
	}
	
	
}
