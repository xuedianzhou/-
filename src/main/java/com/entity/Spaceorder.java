package com.entity;

import java.util.Date;

public class Spaceorder {
	private Integer oid;

	private Integer sid;

	private Integer state;

	private int aid;
	private int uid;
	private Integer hits;
	private double price;
	private double art;

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getArt() {
		return art;
	}

	public void setArt(double art) {
		this.art = art;
	}

	public Spaceorder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Spaceorder(Integer oid, Integer sid, Integer state, int aid,
			int uid, Integer hits, double price, double art) {
		super();
		this.oid = oid;
		this.sid = sid;
		this.state = state;
		this.aid = aid;
		this.uid = uid;
		this.hits = hits;
		this.price = price;
		this.art = art;
	}

}
