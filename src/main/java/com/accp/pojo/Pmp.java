package com.accp.pojo;

import java.util.Date;

public class Pmp {
	private int pmpid;
	private String pmpname;
	private String pmpqpj;
	private String pmpdj;
	private Date pmpkssj;
	private Date pmpjssj;
	private String pmptplj;
	private String pmptpkzm;
	private String pmpms;
	public Pmp(int pmpid, String pmpname, String pmpqpj, String pmpdj, Date pmpkssj, Date pmpjssj, String pmptplj,
			String pmptpkzm, String pmpms) {
		super();
		this.pmpid = pmpid;
		this.pmpname = pmpname;
		this.pmpqpj = pmpqpj;
		this.pmpdj = pmpdj;
		this.pmpkssj = pmpkssj;
		this.pmpjssj = pmpjssj;
		this.pmptplj = pmptplj;
		this.pmptpkzm = pmptpkzm;
		this.pmpms = pmpms;
	}
	public Pmp() {
		super();
	}
	public int getPmpid() {
		return pmpid;
	}
	public void setPmpid(int pmpid) {
		this.pmpid = pmpid;
	}
	public String getPmpname() {
		return pmpname;
	}
	public void setPmpname(String pmpname) {
		this.pmpname = pmpname;
	}
	public String getPmpqpj() {
		return pmpqpj;
	}
	public void setPmpqpj(String pmpqpj) {
		this.pmpqpj = pmpqpj;
	}
	public String getPmpdj() {
		return pmpdj;
	}
	public void setPmpdj(String pmpdj) {
		this.pmpdj = pmpdj;
	}
	public Date getPmpkssj() {
		return pmpkssj;
	}
	public void setPmpkssj(Date pmpkssj) {
		this.pmpkssj = pmpkssj;
	}
	public Date getPmpjssj() {
		return pmpjssj;
	}
	public void setPmpjssj(Date pmpjssj) {
		this.pmpjssj = pmpjssj;
	}
	public String getPmptplj() {
		return pmptplj;
	}
	public void setPmptplj(String pmptplj) {
		this.pmptplj = pmptplj;
	}
	public String getPmptpkzm() {
		return pmptpkzm;
	}
	public void setPmptpkzm(String pmptpkzm) {
		this.pmptpkzm = pmptpkzm;
	}
	public String getPmpms() {
		return pmpms;
	}
	public void setPmpms(String pmpms) {
		this.pmpms = pmpms;
	}
	
}
