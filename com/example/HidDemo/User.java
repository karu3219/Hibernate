package com.example.HidDemo;

import javax.persistence.*;

@Entity
@Table(name="User_Details")
public class User
{
	@Id
	private int userId;

//	@Column(name="user_name")
	private Name name;
@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", address=" + address + "]";
	}
public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	//	@Transient
	private String address;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
