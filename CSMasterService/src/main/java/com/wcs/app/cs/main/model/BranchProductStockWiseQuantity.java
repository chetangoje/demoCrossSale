package com.wcs.app.cs.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BranchProductStockWiseQuantity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int qid;
	private int branchTotalStockQuantity;
	private int damageStockQuantity;
	private int receivingStockQuantity;
	
	
	public int getReceivingStockQuantity() {
		return receivingStockQuantity;
	}
	public void setReceivingStockQuantity(int receivingStockQuantity) {
		this.receivingStockQuantity = receivingStockQuantity;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public int getBranchTotalStockQuantity() {
		return branchTotalStockQuantity;
	}
	public void setBranchTotalStockQuantity(int branchTotalStockQuantity) {
		this.branchTotalStockQuantity = branchTotalStockQuantity;
	}
	public int getDamageStockQuantity() {
		return damageStockQuantity;
	}
	public void setDamageStockQuantity(int damageStockQuantity) {
		this.damageStockQuantity = damageStockQuantity;
	}

}
