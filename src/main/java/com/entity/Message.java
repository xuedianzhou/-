package com.entity;

import java.util.Date;

public class Message {
	private Integer wordid;
	private String matter;
	private Integer type;
	private Date ptime;
	private Integer uid;
	private Integer state;
	public Message() {
		super();
	}
	public Message(Integer wordid, String matter, Integer type, Date ptime,
			Integer uid, Integer state) {
		super();
		this.wordid = wordid;
		this.matter = matter;
		this.type = type;
		this.ptime = ptime;
		this.uid = uid;
		this.state = state;
	}
	public Integer getWordid() {
		return wordid;
	}
	public void setWordid(Integer wordid) {
		this.wordid = wordid;
	}
	public String getMatter() {
		return matter;
	}
	public void setMatter(String matter) {
		this.matter = matter;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
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
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String toString() {
		return "Message [wordid=" + wordid + ", matter=" + matter + ", type="
				+ type + ", ptime=" + ptime + ", uid=" + uid + ", state="
				+ state + "]";
	}
	
}
