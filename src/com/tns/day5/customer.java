package com.tns  .day5;

public class customer {
	private String customername;
	private String customercity;
	private String customerid;
	
	//default constructor
	public customer() {
		System.out.println("default constructor");
	}
	//parametrized

	public customer(String customername, String customercity, String customerid) {
		System.out.println("parameterized constructor");
		this.customername = customername;
		this.customercity = customercity;
		this.customerid = customerid;
	}
	//getters and setters

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomercity() {
		return customercity;
	}

	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	@Override
	public String toString() {
		return "customer [customername=" + customername + ", customercity=" + customercity + ", customerid="
				+ customerid + "]";
	}
	
	
	
	
	

}
