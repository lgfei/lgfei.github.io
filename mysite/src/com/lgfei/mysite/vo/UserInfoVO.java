package com.lgfei.mysite.vo;

import java.util.Date;

/**
 * 用户信息VO
 * @author GitHub4Lgfei
 * @date 2015-5-19
 */
public class UserInfoVO extends BaseVO{
	
	//private static final long serialVersionUID = 3995440098163342294L;
	
	private Long userId;
	private String userAccount;
	private String userName;
	private String password;
	private String email;
	private String phone;
	private String addr;
	private Date birthday;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
