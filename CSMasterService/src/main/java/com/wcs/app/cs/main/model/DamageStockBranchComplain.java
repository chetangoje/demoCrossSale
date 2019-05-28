package com.wcs.app.cs.main.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class DamageStockBranchComplain {
	 @Id
	 private String  damageStockBranchComplainid;
	
	 @ManyToOne
	 private BranchInformation branchInformation;
	 @OneToMany(cascade=CascadeType.MERGE)
	 private Map<ProductPriceMapping, DamageStockBranchComplainQuantity> pmap=new HashMap<>();
	 private String dateComplain;
	 
	 private String remarks;
	
	 public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	
	public String getDamageStockBranchComplainid() {
		return damageStockBranchComplainid;
	}
	public void setDamageStockBranchComplainid(String damageStockBranchComplainid) {
		this.damageStockBranchComplainid = damageStockBranchComplainid;
	}
	/*
	 * public String getDamageStockBranchComplainid() { return
	 * DamageStockBranchComplainid; } public void
	 * setDamageStockBranchComplainid(String damageStockBranchComplainid) {
	 * DamageStockBranchComplainid = damageStockBranchComplainid; }
	 */
	public BranchInformation getBranchInformation() {
		return branchInformation;
	}
	public void setBranchInformation(BranchInformation branchInformation) {
		this.branchInformation = branchInformation;
	}
	
	public Map<ProductPriceMapping, DamageStockBranchComplainQuantity> getPmap() {
		return pmap;
	}
	public void setPmap(Map<ProductPriceMapping, DamageStockBranchComplainQuantity> pmap) {
		this.pmap = pmap;
	}
	public String getDateComplain() {
		return dateComplain;
	}
	public void setDateComplain(String dateComplain) {
		this.dateComplain = dateComplain;
	}
	 
 
 
}
