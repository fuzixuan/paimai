package com.accp.pojo;

public class User {
	private int userid;
	private String username;
	private String usermm;
	private String usersfz;
	private String userdh;
	private String userdz;
	private String useryzbh;
	private int usersf;
	private String userwt;
	private String userda;
	public User(int userid, String username, String usermm, String usersfz, String userdh, String userdz,
			String useryzbh, int usersf, String userwt, String userda) {
		super();
		this.userid = userid;
		this.username = username;
		this.usermm = usermm;
		this.usersfz = usersfz;
		this.userdh = userdh;
		this.userdz = userdz;
		this.useryzbh = useryzbh;
		this.usersf = usersf;
		this.userwt = userwt;
		this.userda = userda;
	}
	public User() {
		super();
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsermm() {
		return usermm;
	}
	public void setUsermm(String usermm) {
		this.usermm = usermm;
	}
	public String getUsersfz() {
		return usersfz;
	}
	public void setUsersfz(String usersfz) {
		this.usersfz = usersfz;
	}
	public String getUserdh() {
		return userdh;
	}
	public void setUserdh(String userdh) {
		this.userdh = userdh;
	}
	public String getUserdz() {
		return userdz;
	}
	public void setUserdz(String userdz) {
		this.userdz = userdz;
	}
	public String getUseryzbh() {
		return useryzbh;
	}
	public void setUseryzbh(String useryzbh) {
		this.useryzbh = useryzbh;
	}
	public int getUsersf() {
		return usersf;
	}
	public void setUsersf(int usersf) {
		this.usersf = usersf;
	}
	public String getUserwt() {
		return userwt;
	}
	public void setUserwt(String userwt) {
		this.userwt = userwt;
	}
	public String getUserda() {
		return userda;
	}
	public void setUserda(String userda) {
		this.userda = userda;
	}
	
}
