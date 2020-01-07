package com.mindtree.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vehicleId;
	private String vehicleCode;
	private String vehicleName;
	private String vehicleState;
	private String vehicleCountry;
	public Vehicle() {
		
	}
	public Vehicle(int vehicleId, String vehicleCode, String vehicleName, String vehicleState, String vehicleCountry) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleCode = vehicleCode;
		this.vehicleName = vehicleName;
		this.vehicleState = vehicleState;
		this.vehicleCountry = vehicleCountry;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleCode() {
		return vehicleCode;
	}
	public void setVehicleCode(String vehicleCode) {
		this.vehicleCode = vehicleCode;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleState() {
		return vehicleState;
	}
	public void setVehicleState(String vehicleState) {
		this.vehicleState = vehicleState;
	}
	public String getVehicleCountry() {
		return vehicleCountry;
	}
	public void setVehicleCountry(String vehicleCountry) {
		this.vehicleCountry = vehicleCountry;
	}
	

}
