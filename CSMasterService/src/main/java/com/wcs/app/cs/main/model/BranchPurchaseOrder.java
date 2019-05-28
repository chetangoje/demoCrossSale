package com.wcs.app.cs.main.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class BranchPurchaseOrder {
	@Id
	private int purchesOrder;
	private String Status;
	@OneToOne
	private BranchPurchaseOrderRequest branchPurchaseOrderRequest;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<VenderWisePurchaseOrder> listVenderWisePurchaseOrder
	=new ArrayList<VenderWisePurchaseOrder>();
	private String orderdate;
	
	public List<VenderWisePurchaseOrder> getListVenderWisePurchaseOrder() {
		return listVenderWisePurchaseOrder;
	}
	public void setListVenderWisePurchaseOrder(List<VenderWisePurchaseOrder> listVenderWisePurchaseOrder) {
		this.listVenderWisePurchaseOrder = listVenderWisePurchaseOrder;
	}

	
	public int getPurchesOrder() {
		return purchesOrder;
	}
	public void setPurchesOrder(int purchesOrder) {
		this.purchesOrder = purchesOrder;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public BranchPurchaseOrderRequest getBranchPurchaseOrderRequest() {
		return branchPurchaseOrderRequest;
	}
	public void setBranchPurchaseOrderRequest(BranchPurchaseOrderRequest branchPurchaseOrderRequest) {
		this.branchPurchaseOrderRequest = branchPurchaseOrderRequest;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	
}
