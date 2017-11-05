package com.lottery.web.form.request;

public class LuckUserLoginReq {

	private String userName;
	
	//md5加密后的字符串
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
