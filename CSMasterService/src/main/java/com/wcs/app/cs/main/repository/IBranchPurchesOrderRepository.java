package com.wcs.app.cs.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.wcs.app.cs.main.model.BranchPurchaseOrderRequest;

public interface IBranchPurchesOrderRepository extends CrudRepository<BranchPurchaseOrderRequest, Long>{
	
	
	@Query(value="Select d from  BranchPurchaseOrderRequest  d WHERE  d.date BETWEEN ?1 AND ?2")
	public List<BranchPurchaseOrderRequest> findAllByDate( String date1,String date2);

}
	