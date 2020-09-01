package com.cg.onlinetestmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="tb_user1")
@DynamicInsert(true)
@DynamicUpdate(true)
public class User {
	
	
	
	@Id
	@Column(name="user_id",length=20)
	private String userId;
	
	@Column(name="user_name",length=20)
	private String userName;
	
	@Column(name="user_pass",length=20)
	private String userPassword;
	
	@Column(name="user_collegeName")
	 private String userCollegeName;

	public User(String userId, String userName, String userPassword, String userCollegeName) {
		
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userCollegeName = userCollegeName;
	}

	public User() {
		// TODO Auto-generated constructor stub
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
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userCollegeName=" + userCollegeName + "]";
	}
	
	
	

	

}
