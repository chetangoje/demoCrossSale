package com.wcs.app.cs.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.wcs.app.cs.main.model.BranchProductStock;

public interface IBranchProductStockRepositoty extends CrudRepository<BranchProductStock, Integer> {

}
