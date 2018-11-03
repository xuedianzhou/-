package com.entity;

import java.util.Date;

public class Users {
	private Integer uid;
	private String uname;
	private String phone;
	private String rpwd;
	private Integer state;
	private Date ctime;
	private Date uptime;
	private String proof;
	public Users() {
		super();
	}
	public Users(Integer uid, String uname, String phone, String rpwd,
			Integer state, Date ctime, Date uptime, String proof) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.phone = phone;
		this.rpwd = rpwd;
		this.state = state;
		this.ctime = ctime;
		this.uptime = uptime;
		this.proof = proof;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRpwd() {
		return rpwd;
	}
	public void setRpwd(String rpwd) {
		this.rpwd = rpwd;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	public Date getUptime() {
		return uptime;
	}
	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}
	public String getProof() {
		return proof;
	}
	public void setProof(String proof) {
		this.proof = proof;
	}
	public String toString() {
		return "Users [uid=" + uid + ", uname=" + uname + ", phone=" + phone
				+ ", rpwd=" + rpwd + ", state=" + state + ", ctime=" + ctime
				+ ", uptime=" + uptime + ", proof=" + proof + "]";
	}
	
}
