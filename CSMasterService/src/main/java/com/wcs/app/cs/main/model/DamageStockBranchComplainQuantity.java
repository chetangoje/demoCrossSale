package com.wcs.app.cs.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DamageStockBranchComplainQuantity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private int damageStockBranch;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDamageStockBranch() {
		return damageStockBranch;
	}

	public void setDamageStockBranch(int damageStockBranch) {
		this.damageStockBranch = damageStockBranch;
	}
	
	
}
