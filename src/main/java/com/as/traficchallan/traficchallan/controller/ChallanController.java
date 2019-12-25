package com.as.traficchallan.traficchallan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.as.traficchallan.traficchallan.entity.Challan;
import com.as.traficchallan.traficchallan.service.ChallanService;

@RestController
@CrossOrigin()
public class ChallanController {
	@Autowired
	private ChallanService challanService;
	
	@GetMapping("/challans/{vehicleNumber}")
	public List<Challan> challans(@PathVariable String vehicleNumber) {
		return challanService.challans(vehicleNumber.toUpperCase());
	}
	
	@PostMapping("/newChallan")
	public ResponseEntity<String> addNewChallan(@RequestBody Challan challan){
		challanService.addChallan(challan);
		return new ResponseEntity<String>("Challan added", HttpStatus.CREATED);
	}
}