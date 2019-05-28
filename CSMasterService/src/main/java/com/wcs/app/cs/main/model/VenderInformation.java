package com.wcs.app.cs.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class VenderInformation {
	@Id
	private String vendorId;
	private String vendorName;
	
	private String state;

	private String district;
	private String vendorAddress;
	private long vendorContactNumber;
	private String vendorEmail;

	private String vendorStatus;
	private int vendorPincode;
	
	
	public String getVendorStatus() {
		return vendorStatus;
	}
	public void setVendorStatus(String vendorStatus) {
		this.vendorStatus = vendorStatus;
	}
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	public long getVendorContactNumber() {
		return vendorContactNumber;
	}
	public void setVendorContactNumber(long vendorContactNumber) {
		this.vendorContactNumber = vendorContactNumber;
	}
	public String getVendorEmail() {
		return vendorEmail;
	}
	public void setVendorEmail(String vendorEmail) {
		this.vendorEmail = vendorEmail;
	}
	
	public int getVendorPincode() {
		return vendorPincode;
	}
	public void setVendorPincode(int vendorPincode) {
		this.vendorPincode = vendorPincode;
	}
	
}
