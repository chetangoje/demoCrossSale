package com.wcs.app.cs.main.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class BranchProductStock {

	@Id
	private int branchProductStock;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Map<ProductPriceMapping,BranchProductStockWiseQuantity> pmap
			=new HashMap<ProductPriceMapping, BranchProductStockWiseQuantity>();
	
	private String date;
	@OneToOne(cascade=CascadeType.ALL)
	private BranchInformation branchInformation;

	public BranchInformation getBranchInformation() {
		return branchInformation;
	}
	public void setBranchInformation(BranchInformation branchInformation) {
		this.branchInformation = branchInformation;
	}
	public int getBranchProductStock() {
		return branchProductStock;
	}
	public void setBranchProductStock(int branchProductStock) {
		this.branchProductStock = branchProductStock;
	}
	public Map<ProductPriceMapping, BranchProductStockWiseQuantity> getPmap() {
		return pmap;
	}
	public void setPmap(Map<ProductPriceMapping, BranchProductStockWiseQuantity> pmap) {
		this.pmap = pmap;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
