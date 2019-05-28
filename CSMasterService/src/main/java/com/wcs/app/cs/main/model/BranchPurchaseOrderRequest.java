package com.wcs.app.cs.main.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class BranchPurchaseOrderRequest {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long purchaseOrderRequestId;
	
	@ManyToOne
	private BranchInformation branchInformation;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Map<ProductPriceMapping,BranchPurchaseOrderProductWiseQuantity> pmap
			=new HashMap<ProductPriceMapping, BranchPurchaseOrderProductWiseQuantity>();

	private String date;
	private String status;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public long getPurchaseOrderRequestId() {
		return purchaseOrderRequestId;
	}

	public void setPurchaseOrderRequestId(long purchaseOrderRequestId) {
		this.purchaseOrderRequestId = purchaseOrderRequestId;
	}

	public BranchInformation getBranchInformation() {
		return branchInformation;
	}

	public void setBranchInformation(BranchInformation branchInformation) {
		this.branchInformation = branchInformation;
	}

	public Map<ProductPriceMapping, BranchPurchaseOrderProductWiseQuantity> getPmap() {
		return pmap;
	}

	public void setPmap(Map<ProductPriceMapping, BranchPurchaseOrderProductWiseQuantity> pmap) {
		this.pmap = pmap;
	}


}
