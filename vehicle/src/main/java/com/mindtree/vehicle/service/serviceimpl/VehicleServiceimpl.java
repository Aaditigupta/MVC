package com.mindtree.vehicle.service.serviceimpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.vehicle.entity.User;
import com.mindtree.vehicle.entity.Vehicle;
import com.mindtree.vehicle.entitydto.UserDto;
import com.mindtree.vehicle.entitydto.VehicleDto;
import com.mindtree.vehicle.repository.UserRepository;
import com.mindtree.vehicle.repository.VehicleRepository;
import com.mindtree.vehicle.service.VehicleService;

@Service
public class VehicleServiceimpl implements VehicleService{
	@Autowired
	private VehicleRepository vehiclerepository;
	@Autowired
	private UserRepository userrepository;
	ModelMapper modelmapper= new ModelMapper();
	@Override
	public void useradd(UserDto userdto) {
		User user= modelmapper.map(userdto,User.class);
		userrepository.save(user);
		
	}
	@Override
	public List<UserDto> getall() {
		List<User> users= userrepository.findAll();
		List<UserDto> userdtos = new ArrayList<UserDto>();
		for(User userone:users) {
			UserDto  userdto= modelmapper.map(userone,UserDto.class);
			userdtos.add(userdto);
			
		}
		return userdtos;
	}
	@Override
	public List<UserDto> getalluser() {
	 List<UserDto> userdto= new ArrayList<UserDto>();
	 List<User> users= userrepository.findAll();
	 for(User userone:users) {
		 UserDto user= modelmapper.map(userone,UserDto.class);
			
			  Set<Vehicle> vehicles= userone.getVehicle(); Set<VehicleDto> vehiclelist =
			  new HashSet<VehicleDto>(); for(Vehicle vehicleone:vehicles) { VehicleDto
			  vehicledto = modelmapper.map(vehicleone,VehicleDto.class);
			  vehiclelist.add(vehicledto);
			  
			  } user.setVehicledto(vehiclelist);
			 
		 userdto.add(user);
	 }
	 System.out.println(userdto);
		return userdto;
	}
	@Override
	public void addvehicle(VehicleDto vehicledto, String userName) {
		System.out.println(userName);
	Vehicle vehicle= modelmapper.map(vehicledto,Vehicle.class);
	User user=userrepository.findByUserName(userName).get();
	String vehiclecode=vehicle.getVehicleName().substring(0,1)+vehicle.getVehicleState().substring(0,2)+vehicle.getVehicleCountry().substring(0, 1);
	vehicle.setVehicleCode(vehiclecode);
	user.getVehicle().add(vehicle);
	userrepository.save(user);
		
	}

}
