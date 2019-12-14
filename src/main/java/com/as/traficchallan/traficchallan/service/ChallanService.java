package com.as.traficchallan.traficchallan.service;

import java.util.List;

import com.as.traficchallan.traficchallan.entity.Challan;

public interface ChallanService {
	List<Challan> challans(String vehicleNumber);
	void addChallan(Challan challan);
}
