package com.wcs.app.cs.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DamageStockComplainProductWiseQuantity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int qid;
	private int complainProductwiseQuantity;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public int getComplainProductwiseQuantity() {
		return complainProductwiseQuantity;
	}
	public void setComplainProductwiseQuantity(int complainProductwiseQuantity) {
		this.complainProductwiseQuantity = complainProductwiseQuantity;
	}
	
}
