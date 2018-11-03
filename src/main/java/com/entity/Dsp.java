package com.entity;

import java.util.Date;

public class Dsp {

	private Integer auid;
	private String firmName;
	private String firmAddress;
	private String firmSites;
	private Integer uid;
	private Date ctime;
	private Date uptime;
	public Dsp() {
		super();
	}
	public Dsp(Integer auid, String firmName, String firmAddress,
			String firmSites, Integer uid, Date ctime, Date uptime) {
		super();
		this.auid = auid;
		this.firmName = firmName;
		this.firmAddress = firmAddress;
		this.firmSites = firmSites;
		this.uid = uid;
		this.ctime = ctime;
		this.uptime = uptime;
	}
	public Integer getAuid() {
		return auid;
	}
	public void setAuid(Integer auid) {
		this.auid = auid;
	}
	public String getFirmName() {
		return firmName;
	}
	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}
	public String getFirmAddress() {
		return firmAddress;
	}
	public void setFirmAddress(String firmAddress) {
		this.firmAddress = firmAddress;
	}
	public String getFirmSites() {
		return firmSites;
	}
	public void setFirmSites(String firmSites) {
		this.firmSites = firmSites;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
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
	public String toString() {
		return "Dsp [auid=" + auid + ", firmName=" + firmName
				+ ", firmAddress=" + firmAddress + ", firmSites=" + firmSites
				+ ", uid=" + uid + ", ctime=" + ctime + ", uptime=" + uptime
				+ "]";
	}
	
}
