package com.wcs.app.cs.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BranchProductTargetQuantity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int qid;
	private int initialTargetQuantity;
	//change this fild after sell to customer
	private int changeTargetQuantity;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public int getInitialTargetQuantity() {
		return initialTargetQuantity;
	}
	public void setInitialTargetQuantity(int initialTargetQuantity) {
		this.initialTargetQuantity = initialTargetQuantity;
	}
	public int getChangeTargetQuantity() {
		return changeTargetQuantity;
	}
	public void setChangeTargetQuantity(int changeTargetQuantity) {
		this.changeTargetQuantity = changeTargetQuantity;
	}
}
