package com.wcs.app.cs.main.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class DamageStockBranchComplain {
	 @Id
	 private String  DamageStockBranchComplainid;
	
	 @ManyToOne
	 private BranchInformation branchInformation;
	 @OneToMany
	 private Map<ProductPriceMapping, DamageStockBranchComplainQuantity> mappd=new HashMap<>();
	 private String dateComplain;
	
	 public String getDamageStockBranchComplainid() {
		return DamageStockBranchComplainid;
	}
	public void setDamageStockBranchComplainid(String damageStockBranchComplainid) {
		DamageStockBranchComplainid = damageStockBranchComplainid;
	}
	public BranchInformation getBranchInformation() {
		return branchInformation;
	}
	public void setBranchInformation(BranchInformation branchInformation) {
		this.branchInformation = branchInformation;
	}
	public Map<ProductPriceMapping, DamageStockBranchComplainQuantity> getMappd() {
		return mappd;
	}
	public void setMappd(Map<ProductPriceMapping, DamageStockBranchComplainQuantity> mappd) {
		this.mappd = mappd;
	}
	public String getDateComplain() {
		return dateComplain;
	}
	public void setDateComplain(String dateComplain) {
		this.dateComplain = dateComplain;
	}
	 
 
 
}
