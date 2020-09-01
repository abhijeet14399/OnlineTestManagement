package com.cg.onlinetestmanagement.dto;
public class UserDto {
	private String userId;

	private String userName;

	private String userPassword;
	private String userCollegeName;
	public UserDto(String userId, String userName, String userPassword, String userCollegeName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userCollegeName = userCollegeName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserCollegeName() {
		return userCollegeName;
	}
	public void setUserCollegeName(String userCollegeName) {
		this.userCollegeName = userCollegeName;
	}
	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userCollegeName=" + userCollegeName + "]";
	}

	
}
