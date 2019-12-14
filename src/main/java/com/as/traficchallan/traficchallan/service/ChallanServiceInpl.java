package com.as.traficchallan.traficchallan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.as.traficchallan.traficchallan.entity.Challan;
import com.as.traficchallan.traficchallan.exception.ChallansNotFoundException;
import com.as.traficchallan.traficchallan.repo.ChallanRepo;

@Service
public class ChallanServiceInpl implements ChallanService {

	@Autowired
	private ChallanRepo challanRepo;

	@Override
	public List<Challan> challans(String vehicleNumber) {

		List<Challan> ch = challanRepo.findByvehicleNumber(vehicleNumber);
		if (ch.isEmpty())
			throw new ChallansNotFoundException("No Vehicle is found with Number = " + vehicleNumber);
		else
			return ch;
	}

	@Override
	public void addChallan(Challan challan) {
		challanRepo.save(challan);
		
	}

}
