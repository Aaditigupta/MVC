package com.mindtree.vehicle.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int userId;
	private String userName;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
private Set<Vehicle> vehicle;
	public User() {
		
	}
	public User(int userId, String userName, Set<Vehicle> vehicle) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.vehicle = vehicle;
	}
    
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Set<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Set<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", vehicle=" + vehicle + "]";
	}
	
}
