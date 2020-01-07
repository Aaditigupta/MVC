package com.mindtree.vehicle.entitydto;

import java.util.Set;


public class UserDto {
	private int userId;
	private String userName;
	
private Set<VehicleDto> vehicledto;
public UserDto() {
	
}
public UserDto(int userId, String userName, Set<VehicleDto> vehicledto) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.vehicledto = vehicledto;
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
public Set<VehicleDto> getVehicledto() {
	return vehicledto;
}
public void setVehicledto(Set<VehicleDto> vehicledto) {
	this.vehicledto = vehicledto;
}
@Override
public String toString() {
	return "UserDto [userId=" + userId + ", userName=" + userName + ", vehicledto=" + vehicledto + "]";
}

}
