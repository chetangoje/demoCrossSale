package com.wcs.app.cs.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wcs.app.cs.main.model.BranchInformation;
import com.wcs.app.cs.main.model.District;
import com.wcs.app.cs.main.model.State;

public interface IBranchInformationRepository extends CrudRepository<BranchInformation,String> {

	public List<District> findByState(State state);
	public List<BranchInformation> findAllByOrderByBranchCodeDesc();
	
	@Query("from BranchInformation b where b.branchName=?1 And b.branchName=?2") 
	public BranchInformation findByBranchName(String username, String password);
	
	
}


