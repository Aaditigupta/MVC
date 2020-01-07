package com.mindtree.vehicle.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.vehicle.entitydto.UserDto;
import com.mindtree.vehicle.entitydto.VehicleDto;
import com.mindtree.vehicle.service.VehicleService;

@Controller
public class VehicleController {
	@Autowired
	private VehicleService vehicleservice;

	@RequestMapping("/")
	public String menu() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return "menu";
	}

	@RequestMapping("/user")
	public String add() {
		return "user";

	}

	@PostMapping("/adduser")
	public String adduser(UserDto userdto) {

		vehicleservice.useradd(userdto);

		return "menu";

	}

	@RequestMapping("/vehicle")
	public String vehicle(Map<String, Object> model) {
		List<UserDto> users = vehicleservice.getall();
		model.put("users", users);
		return "vehicle";

	}

	@PostMapping("/addvehicle")
	public String addvehicle(VehicleDto vehicledto, @RequestParam String userName) {

		vehicleservice.addvehicle(vehicledto, userName);

		return "menu";
	}

	@GetMapping(value = "/display")
	public String display(Map<String, Object> model) {
		List<UserDto> users = vehicleservice.getalluser();
		System.out.println(users);
		model.put("users", users);

		return "display";
	}

}
