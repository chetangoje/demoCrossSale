package com.wcs.app.cs.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BranchPurchaseOrderProductWiseQuantity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int qid;
	private int purchesOrderproductwisequantity;
	
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public int getPurchesOrderproductwisequantity() {
		return purchesOrderproductwisequantity;
	}
	public void setPurchesOrderproductwisequantity(int purchesOrderproductwisequantity) {
		this.purchesOrderproductwisequantity = purchesOrderproductwisequantity;
	}

}
