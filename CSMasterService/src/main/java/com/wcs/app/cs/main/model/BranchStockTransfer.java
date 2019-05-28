package com.wcs.app.cs.main.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class BranchStockTransfer {

	@Id
	private String branchStockTransferId;
	
	@OneToOne
	private BranchInformation fromBranch;
	
	@OneToOne
	private BranchInformation toBranch;
	
	private String transferDate;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Map<ProductPriceMapping,BranchProductTransferQuantity> pmap
			=new HashMap<ProductPriceMapping, BranchProductTransferQuantity>();
	


	public Map<ProductPriceMapping, BranchProductTransferQuantity> getPmap() {
		return pmap;
	}

	public void setPmap(Map<ProductPriceMapping, BranchProductTransferQuantity> pmap) {
		this.pmap = pmap;
	}

	public String getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(String transferDate) {
		this.transferDate = transferDate;
	}

	
	public String getBranchStockTransferId() {
		return branchStockTransferId;
	}

	public void setBranchStockTransferId(String branchStockTransferId) {
		this.branchStockTransferId = branchStockTransferId;
	}

	public BranchInformation getFromBranch() {
		return fromBranch;
	}

	public void setFromBranch(BranchInformation fromBranch) {
		this.fromBranch = fromBranch;
	}

	public BranchInformation getToBranch() {
		return toBranch;
	}

	public void setToBranch(BranchInformation toBranch) {
		this.toBranch = toBranch;
	}
	
	
}
