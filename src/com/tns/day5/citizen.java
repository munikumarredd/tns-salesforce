package com.tns.day5;

public class citizen {
	private String name;
	private String aadharno;
	private String address;
	private long phno;
	public citizen() {
		System.out.println("citizen");
	
	}
	public citizen(String name, String aadharno, String address, long phno) {
		super();
		this.name = name;
		this.aadharno = aadharno;
		this.address = address;
		this.phno = phno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharno() {
		return aadharno;
	}
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	public String getAdress() {
		return address;
	}
	public void setAdress(String adress) {
		this.address = adress;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "citizen [name=" + name + ", aadharno=" + aadharno + ", address=" + address + ", phno=" + phno + "]";
	}
	     
	

}
