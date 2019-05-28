package com.wcs.app.cs.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DamageStockBranchComplainQuantity {
	@Id
	private int id;
	
	private int damageStockQuantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDamageStockQuantity() {
		return damageStockQuantity;
	}

	public void setDamageStockQuantity(int damageStockQuantity) {
		this.damageStockQuantity = damageStockQuantity;
	}


	
	
}
