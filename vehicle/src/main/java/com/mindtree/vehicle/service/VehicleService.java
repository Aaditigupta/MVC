package com.mindtree.vehicle.service;

import java.util.List;

import com.mindtree.vehicle.entitydto.UserDto;
import com.mindtree.vehicle.entitydto.VehicleDto;

public interface VehicleService {

	void useradd(UserDto userdto);

	List<UserDto> getall();

	List<UserDto> getalluser();

	void addvehicle(VehicleDto vehicledto, String customerName);

}
