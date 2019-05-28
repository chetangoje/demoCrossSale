package com.wcs.app.cs.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InvoiceProductWiseQuantity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int qid;
	private int invoiceproductwisequantity;
	
	@Override
	public String toString() {
		return "InvoiceProductWiseQuantity [qid=" + qid + ", invoiceproductwisequantity=" + invoiceproductwisequantity
				+ "]";
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public int getInvoiceproductwisequantity() {
		return invoiceproductwisequantity;
	}
	public void setInvoiceproductwisequantity(int invoiceproductwisequantity) {
		this.invoiceproductwisequantity = invoiceproductwisequantity;
	}
	
}
