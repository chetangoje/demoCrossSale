package com.wcs.app.cs.main.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class VenderWisePurchaseOrder {
	@Id
	private int venderPurchaseno;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Map<ProductInformation, VenderPurchaseQuantity> pmap
		=new HashMap<ProductInformation, VenderPurchaseQuantity>();
    
	@ManyToOne
	private VenderInformation venderInformation;

	public int getVenderPurchaseno() {
		return venderPurchaseno;
	}

	public void setVenderPurchaseno(int venderPurchaseno) {
		this.venderPurchaseno = venderPurchaseno;
	}



	public Map<ProductInformation, VenderPurchaseQuantity> getPmap() {
		return pmap;
	}

	public void setPmap(Map<ProductInformation, VenderPurchaseQuantity> pmap) {
		this.pmap = pmap;
	}

	public VenderInformation getVenderInformation() {
		return venderInformation;
	}

	public void setVenderInformation(VenderInformation venderInformation) {
		this.venderInformation = venderInformation;
	}
	
	
    
}
