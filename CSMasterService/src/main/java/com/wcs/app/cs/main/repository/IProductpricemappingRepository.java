package com.wcs.app.cs.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.wcs.app.cs.main.model.ProductInformation;
import com.wcs.app.cs.main.model.ProductPriceMapping;

public interface IProductpricemappingRepository extends CrudRepository<ProductPriceMapping,Integer> {

	

	public ProductPriceMapping findAllByPricemappingid(int pricemappingid);
	public ProductPriceMapping findByProductInformation(ProductInformation pdi);
}
