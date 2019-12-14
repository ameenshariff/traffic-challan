package com.as.traficchallan.traficchallan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Challan {
	@Id
	@SequenceGenerator(initialValue = 1050, allocationSize = 1, name = "challan_sequence", sequenceName = "challan_sequence")
	@GeneratedValue(generator = "challan_sequence")
	private int challanId;
	private String vehicleNumber;
	private String challanGeneratedDate;
	private String description;
	private String area;
	private String challanPaidDate;
	
	public Challan() {
		
	}
	
	public Challan(String vehicleNumber, String challanGeneratedDate, String description, String area,
			String challanPaidDate) {
		this.vehicleNumber = vehicleNumber;
		this.challanGeneratedDate = challanGeneratedDate;
		this.description = description;
		this.area = area;
		this.challanPaidDate = challanPaidDate;
	}

	public int getChallanId() {
		return challanId;
	}

	public void setChallanId(int challanId) {
		this.challanId = challanId;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getChallanGeneratedDate() {
		return challanGeneratedDate;
	}

	public void setChallanGeneratedDate(String challanGeneratedDate) {
		this.challanGeneratedDate = challanGeneratedDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getChallanPaidDate() {
		return challanPaidDate;
	}

	public void setChallanPaidDate(String challanPaidDate) {
		this.challanPaidDate = challanPaidDate;
	}

	@Override
	public String toString() {
		return "Challan [challanId=" + challanId + ", vehicleNumber=" + vehicleNumber + ", challanGeneratedDate="
				+ challanGeneratedDate + ", description=" + description + ", area=" + area + ", challanPaidDate="
				+ challanPaidDate + "]";
	}
	

}
