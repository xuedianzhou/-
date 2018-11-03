package com.entity;

import java.util.Date;

public class Space {
	private Integer sid;
	private Integer sitesid;
	private String wide;
	private String high;
	private Integer state;
	private String uname;
	private Date ptime;
	private String grouping;
	private String sname;
	private String surl;
	private String remark;
	private String hits;
	private Integer states;
	
	public Space() {
		super();
	}
	
	public Space(Integer sid, Integer sitesid, String wide, String high,
			Integer state, String uname, Date ptime, String grouping,
			String sname, String surl, String remark, String hits,
			Integer states) {
		super();
		this.sid = sid;
		this.sitesid = sitesid;
		this.wide = wide;
		this.high = high;
		this.state = state;
		this.uname = uname;
		this.ptime = ptime;
		this.grouping = grouping;
		this.sname = sname;
		this.surl = surl;
		this.remark = remark;
		this.hits = hits;
		this.states = states;

	}

	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Integer getSitesid() {
		return sitesid;
	}
	public void setSitesid(Integer sitesid) {
		this.sitesid = sitesid;
	}
	public String getWide() {
		return wide;
	}
	public void setWide(String wide) {
		this.wide = wide;
	}
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Date getPtime() {
		return ptime;
	}
	public void setPtime(Date ptime) {
		this.ptime = ptime;
	}
	public String getGrouping() {
		return grouping;
	}
	public void setGrouping(String grouping) {
		this.grouping = grouping;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSurl() {
		return surl;
	}
	public void setSurl(String surl) {
		this.surl = surl;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getHits() {
		return hits;
	}
	public void setHits(String hits) {
		this.hits = hits;
	}
	public Integer getStates() {
		return states;
	}
	public void setStates(Integer states) {
		this.states = states;
	}


	@Override
	public String toString() {
		return "Space [sid=" + sid + ", sitesid=" + sitesid + ", wide=" + wide
				+ ", high=" + high + ", state=" + state + ", uname=" + uname
				+ ", ptime=" + ptime + ", grouping=" + grouping + ", sname="
				+ sname + ", surl=" + surl + ", remark=" + remark + ", hits="
				+ hits + ", states=" + states + "]";
	}
	
	
}
