package com.entity;

import java.util.Date;

public class Order {
	private Integer orderid;
	private Integer aid;
	private Date ctime;
	private Date ftime;
	private Integer state;
	private Date uptime;
	private String remark;
	private Integer hits;
	private Integer sitesid;
	public Order() {
		super();
	}
	public Order(Integer orderid, Integer aid, Date ctime, Date ftime,
			Integer state, Date uptime, String remark, Integer hits,
			Integer sitesid) {
		super();
		this.orderid = orderid;
		this.aid = aid;
		this.ctime = ctime;
		this.ftime = ftime;
		this.state = state;
		this.uptime = uptime;
		this.remark = remark;
		this.hits = hits;
		this.sitesid = sitesid;
	}
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	public Date getFtime() {
		return ftime;
	}
	public void setFtime(Date ftime) {
		this.ftime = ftime;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Date getUptime() {
		return uptime;
	}
	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getHits() {
		return hits;
	}
	public void setHits(Integer hits) {
		this.hits = hits;
	}
	public Integer getSitesid() {
		return sitesid;
	}
	public void setSitesid(Integer sitesid) {
		this.sitesid = sitesid;
	}
	public String toString() {
		return "Order [orderid=" + orderid + ", aid=" + aid + ", ctime="
				+ ctime + ", ftime=" + ftime + ", state=" + state + ", uptime="
				+ uptime + ", remark=" + remark + ", hits=" + hits
				+ ", sitesid=" + sitesid + "]";
	}
	
}
