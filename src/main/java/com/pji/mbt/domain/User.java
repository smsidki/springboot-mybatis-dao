package com.pji.mbt.domain;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 5641303736500902816L;

	private Integer userid;

	private String username;

	private String password;

	private String email;

	public Integer getUserid() {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
