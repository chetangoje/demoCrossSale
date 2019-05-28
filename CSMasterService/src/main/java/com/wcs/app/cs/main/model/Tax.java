package com.wcs.app.cs.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Tax {
	@Id
	private int taxId;
	private double cGst;
	private double sGst;
	private double iGst;
	
	public int getTaxId() {
		return taxId;
	}
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	public double getcGst() {
		return cGst;
	}
	public void setcGst(double cGst) {
		this.cGst = cGst;
	}
	public double getsGst() {
		return sGst;
	}
	public void setsGst(double sGst) {
		this.sGst = sGst;
	}
	public double getiGst() {
		return iGst;
	}
	public void setiGst(double iGst) {
		this.iGst = iGst;
	}
}
