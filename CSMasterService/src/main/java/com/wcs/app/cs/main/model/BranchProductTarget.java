package com.wcs.app.cs.main.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
public class BranchProductTarget {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productTargetId;
	
	private String targetDate;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Map<ProductPriceMapping,BranchProductTargetQuantity> pmap
			=new HashMap<ProductPriceMapping, BranchProductTargetQuantity>();
	@OneToOne
	private BranchInformation branchInformation;
	
	
	public BranchInformation getBranchInformation() {
		return branchInformation;
	}

	public void setBranchInformation(BranchInformation branchInformation) {
		this.branchInformation = branchInformation;
	}

	public int getProductTargetId() {
		return productTargetId;
	}

	public void setProductTargetId(int productTargetId) {
		this.productTargetId = productTargetId;
	}

	public String getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(String targetDate) {
		this.targetDate = targetDate;
	}

	public Map<ProductPriceMapping, BranchProductTargetQuantity> getPmap() {
		return pmap;
	}

	public void setPmap(Map<ProductPriceMapping, BranchProductTargetQuantity> pmap) {
		this.pmap = pmap;
	}
	
}
