package com.wcs.app.cs.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.wcs.app.cs.main.model.BranchStockTransfer;

public interface IProductTransferRepository extends CrudRepository<BranchStockTransfer, String> {

}
