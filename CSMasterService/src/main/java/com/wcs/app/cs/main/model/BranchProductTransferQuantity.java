package com.wcs.app.cs.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BranchProductTransferQuantity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int qid;
	private int branchProductTransferQuantityQuantity;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public int getBranchProductTransferQuantityQuantity() {
		return branchProductTransferQuantityQuantity;
	}
	public void setBranchProductTransferQuantityQuantity(int branchProductTransferQuantityQuantity) {
		this.branchProductTransferQuantityQuantity = branchProductTransferQuantityQuantity;
	}
	
	
}
