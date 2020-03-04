package com.accp.pojo;

import java.util.Date;

public class Jl {
	private int jlid;
	private	int userid;
	private	int pmp;
	private	Date jpsj;
	private	String jpjg;
	public Jl(int jlid, int userid, int pmp, Date jpsj, String jpjg) {
		super();
		this.jlid = jlid;
		this.userid = userid;
		this.pmp = pmp;
		this.jpsj = jpsj;
		this.jpjg = jpjg;
	}
	public Jl() {
		super();
	}
	public int getJlid() {
		return jlid;
	}
	public void setJlid(int jlid) {
		this.jlid = jlid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getPmp() {
		return pmp;
	}
	public void setPmp(int pmp) {
		this.pmp = pmp;
	}
	public Date getJpsj() {
		return jpsj;
	}
	public void setJpsj(Date jpsj) {
		this.jpsj = jpsj;
	}
	public String getJpjg() {
		return jpjg;
	}
	public void setJpjg(String jpjg) {
		this.jpjg = jpjg;
	}
	
}
