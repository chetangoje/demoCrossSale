package com.wcs.app.cs.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductCategory {
	@Id
	private int productCategoryId;
	
	private String productType;

	private String taxPercentage;
	
	public String getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(String taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public int getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	
}
