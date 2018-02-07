package com.org.dto;

import java.io.Serializable;

public class FliptkartDTO implements Serializable {
	
	
	
	private String cname;
	private String cemail;
	private String cadd;
	private String clandmark;
	private String coption;
	private long mobile;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public String getClandmark() {
		return clandmark;
	}
	public void setClandmark(String clandmark) {
		this.clandmark = clandmark;
	}
	public String getCoption() {
		return coption;
	}
	public void setCoption(String coption) {
		this.coption = coption;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

}
