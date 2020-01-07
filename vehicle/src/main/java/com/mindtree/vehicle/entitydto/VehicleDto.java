package com.mindtree.vehicle.entitydto;

public class VehicleDto {
	private int vehicleId;
	private String vehicleCode;
	private String vehicleName;
	private String vehicleState;
	private String vehicleCountry;
	public VehicleDto() {
		
	}
	public VehicleDto(int vehicleId, String vehicleCode, String vehicleName, String vehicleState,
			String vehicleCountry) {
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
