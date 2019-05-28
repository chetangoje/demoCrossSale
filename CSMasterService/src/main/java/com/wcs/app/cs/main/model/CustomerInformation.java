package com.wcs.app.cs.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String customerId;
	private String customerName;
	private String customerType;
	private String customerMobileNo;
	private String customerMailId;
	private String customerPanCardNo;
	private String customerAadhaarNo;
	
		public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getCustomerMobileNo() {
		return customerMobileNo;
	}
	public void setCustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}
	public String getCustomerMailId() {
		return customerMailId;
	}
	public void setCustomerMailId(String customerMailId) {
		this.customerMailId = customerMailId;
	}
	public String getCustomerPanCardNo() {
		return customerPanCardNo;
	}
	public void setCustomerPanCardNo(String customerPanCardNo) {
		this.customerPanCardNo = customerPanCardNo;
	}
	public String getCustomerAadhaarNo() {
		return customerAadhaarNo;
	}
	public void setCustomerAadhaarNo(String customerAadhaarNo) {
		this.customerAadhaarNo = customerAadhaarNo;
	}

	
}
