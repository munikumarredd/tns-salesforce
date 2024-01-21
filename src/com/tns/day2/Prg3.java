package com.tns.day2;

public class Prg3 {

	public static void main(String[] args) {
		// impicit type casting
	float f=45.9f;
	double d=f;
	int m=123;
	float k=m;
	char ch='M';
	int m2=ch;
	System.out.println(d+"\n"+k+"\n"+m2);
	// explicit type casting
	double d1=45.75857d;
	int m1=(int) d1;
	int m3=77;
	char ch1=(char)m3;
	char ch2='c';
	byte b1=(byte)ch2;
	System.out.println(m1+"\n"+ch1+"\n"+b1);


	}

}
