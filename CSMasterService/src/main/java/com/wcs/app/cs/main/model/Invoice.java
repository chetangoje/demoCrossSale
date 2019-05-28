package com.wcs.app.cs.main.model;


import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Invoice {
	@Id
	private String invoiceNo;

	private float totalAmount;
	
	private String invoiceGenerationDate;
	
	@ManyToOne
	private BranchInformation branchInformation;
	
	@ManyToOne
	private RelationshipExecutiveInformation executiveInformation;
	
	@ManyToOne
	private CustomerInformation customerInformation;

	@OneToMany
	private Map<ProductPriceMapping, InvoiceProductWiseQuantity> productQuantity
		=new HashMap<ProductPriceMapping, InvoiceProductWiseQuantity>();

	@Override
	public String toString() {
		return "Invoice [invoiceNo=" + invoiceNo + ", totalAmount=" + totalAmount + ", invoiceGenerationDate="
				+ invoiceGenerationDate + ", branchInformation=" + branchInformation + ", executiveInformation="
				+ executiveInformation + ", customerInformation=" + customerInformation + ", productQuantity="
				+ productQuantity + "]";
	}

	public String getInvoiceGenerationDate() {
		return invoiceGenerationDate;
	}

	public void setInvoiceGenerationDate(String invoiceGenerationDate) {
		this.invoiceGenerationDate = invoiceGenerationDate;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BranchInformation getBranchInformation() {
		return branchInformation;
	}

	public void setBranchInformation(BranchInformation branchInformation) {
		this.branchInformation = branchInformation;
	}

	public RelationshipExecutiveInformation getExecutiveInformation() {
		return executiveInformation;
	}

	public void setExecutiveInformation(RelationshipExecutiveInformation executiveInformation) {
		this.executiveInformation = executiveInformation;
	}

	public CustomerInformation getCustomerInformation() {
		return customerInformation;
	}

	public void setCustomerInformation(CustomerInformation customerInformation) {
		this.customerInformation = customerInformation;
	}

	public Map<ProductPriceMapping, InvoiceProductWiseQuantity> getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Map<ProductPriceMapping, InvoiceProductWiseQuantity> productQuantity) {
		this.productQuantity = productQuantity;
	}


	
	

}
