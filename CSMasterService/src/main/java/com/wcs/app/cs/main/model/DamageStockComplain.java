package com.wcs.app.cs.main.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class DamageStockComplain {
	@Id
	private String complainNo;

	@OneToOne
	private Invoice invoice;
	
	@OneToMany
	private Map<ProductPriceMapping,DamageStockComplainProductWiseQuantity> pmap
			=new HashMap<ProductPriceMapping, DamageStockComplainProductWiseQuantity>();
	//customer or branchrequest for damage
	private String complainType;
	
	private String complainDate;

	public String getComplainDate() {
		return complainDate;
	}

	public void setComplainDate(String complainDate) {
		this.complainDate = complainDate;
	}

	public String getComplainType() {
		return complainType;
	}

	public void setComplainType(String complainType) {
		this.complainType = complainType;
	}

	public String getComplainNo() {
		return complainNo;
	}

	public void setComplainNo(String complainNo) {
		this.complainNo = complainNo;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Map<ProductPriceMapping, DamageStockComplainProductWiseQuantity> getPmap() {
		return pmap;
	}

	public void setPmap(Map<ProductPriceMapping, DamageStockComplainProductWiseQuantity> pmap) {
		this.pmap = pmap;
	}

}
