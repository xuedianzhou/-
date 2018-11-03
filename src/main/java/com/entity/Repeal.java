package com.entity;

import java.util.Date;

public class Repeal {
	private Integer reid;
	private String recause;
	private double resum;
	private Date reptime;
	private Integer oid;
	private Integer uid;
	private Integer state;
	public Repeal() {
		super();
	}
	public Repeal(Integer reid, String recause, double resum, Date reptime,
			Integer uid, Integer state) {
		super();
		this.reid = reid;
		this.recause = recause;
		this.resum = resum;
		this.reptime = reptime;
		this.uid = uid;
		this.state = state;
	}
	
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public Repeal(Integer reid, String recause, double resum, Date reptime,
			Integer oid, Integer uid, Integer state) {
		super();
		this.reid = reid;
		this.recause = recause;
		this.resum = resum;
		this.reptime = reptime;
		this.oid = oid;
		this.uid = uid;
		this.state = state;
	}
	public Integer getReid() {
		return reid;
	}
	public void setReid(Integer reid) {
		this.reid = reid;
	}
	public String getRecause() {
		return recause;
	}
	public void setRecause(String recause) {
		this.recause = recause;
	}
	public double getResum() {
		return resum;
	}
	public void setResum(double resum) {
		this.resum = resum;
	}
	public Date getReptime() {
		return reptime;
	}
	public void setReptime(Date reptime) {
		this.reptime = reptime;
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
		return "Repeal [reid=" + reid + ", recause=" + recause + ", resum="
				+ resum + ", reptime=" + reptime + ", uid=" + uid + ", state="
				+ state + "]";
	}
	
}
