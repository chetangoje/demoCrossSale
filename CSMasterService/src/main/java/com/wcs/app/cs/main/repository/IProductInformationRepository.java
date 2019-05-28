package com.wcs.app.cs.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.wcs.app.cs.main.model.ProductInformation;

public interface IProductInformationRepository extends CrudRepository<ProductInformation,String> {

	public ProductInformation findByProductCode(String code);

}
