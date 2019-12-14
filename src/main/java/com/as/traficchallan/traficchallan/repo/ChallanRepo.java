package com.as.traficchallan.traficchallan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.as.traficchallan.traficchallan.entity.Challan;

@Repository
public interface ChallanRepo extends JpaRepository<Challan, Integer> {
	@Transactional
	List<Challan> findByvehicleNumber(String vehicleNumber);

}
