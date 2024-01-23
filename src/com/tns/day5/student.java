package com.tns.day5;

public class student extends citizen{
	private int rollno;
	private String collegename;
	public student() {
		super();
	}
	public student(String name, String aadharno, String address, long phno,int rollno,String collegename) {
		super(name, aadharno, address, phno);
		this.rollno = rollno;
		this.collegename = collegename;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", collegename=" + collegename + ", getRollno()=" + getRollno()
				+ ", getCollegename()=" + getCollegename() + ", getName()=" + getName() + ", getAadharno()="
				+ getAadharno() + ", getAdress()=" + getAdress() + ", getPhno()=" + getPhno() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
