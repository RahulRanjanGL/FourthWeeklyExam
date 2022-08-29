package com.java.eurekaclient.model;

public class Customer {
	
	private int custId;
	private String custName;
	private String phoneNo;
	private String address;
	
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", phoneNo=" + phoneNo + ", address=" + address
				+ "]";
	}

}
