package com.entity;

import java.util.Date;

public class Sites {

	private Integer sitesid;
	private String dns;
	private String sitesurl;
	private String pv;
	private String grouping;
	private String pc;
	private Integer uid;
	private Date ptime;
	private Integer state;
	private String address;
	private Integer sort;
	public Sites() {
		super();
	}
	public Sites(Integer sitesid, String dns, String sitesurl, String pv,
			String grouping, String pc, Integer uid, Date ptime, Integer state,
			String address, Integer sort) {
		super();
		this.sitesid = sitesid;
		this.dns = dns;
		this.sitesurl = sitesurl;
		this.pv = pv;
		this.grouping = grouping;
		this.pc = pc;
		this.uid = uid;
		this.ptime = ptime;
		this.state = state;
		this.address = address;
		this.sort = sort;
	}
	public Integer getSitesid() {
		return sitesid;
	}
	public void setSitesid(Integer sitesid) {
		this.sitesid = sitesid;
	}
	public String getDns() {
		return dns;
	}
	public void setDns(String dns) {
		this.dns = dns;
	}
	public String getSitesurl() {
		return sitesurl;
	}
	public void setSitesurl(String sitesurl) {
		this.sitesurl = sitesurl;
	}
	public String getPv() {
		return pv;
	}
	public void setPv(String pv) {
		this.pv = pv;
	}
	public String getGrouping() {
		return grouping;
	}
	public void setGrouping(String grouping) {
		this.grouping = grouping;
	}
	public String getPc() {
		return pc;
	}
	public void setPc(String pc) {
		this.pc = pc;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Date getPtime() {
		return ptime;
	}
	public void setPtime(Date ptime) {
		this.ptime = ptime;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public String toString() {
		return "Sites [sitesid=" + sitesid + ", dns=" + dns + ", sitesurl="
				+ sitesurl + ", pv=" + pv + ", grouping=" + grouping + ", pc="
				+ pc + ", uid=" + uid + ", ptime=" + ptime + ", state=" + state
				+ ", address=" + address + ", sort=" + sort + "]";
	}
	
}
