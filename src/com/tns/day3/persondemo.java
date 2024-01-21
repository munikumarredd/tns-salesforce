 package com.tns.day3;

import java.util.Scanner;

public class persondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person obj= new person();
		String name,gender;
		int income,tax,age;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name=");
		name=sc.next();
		System.out.println("enter gender=");
		gender=sc.next();
		System.out.println("enter income=");
		income=sc.nextInt();
		System.out.println("enter age=");
		age=sc.nextInt();
		System.out.println("enter tax=");
		tax=sc.nextInt();
		obj.setName(name);
		obj.setGender(gender);
		obj.setIncome(income);
		obj.setAge(age);
		obj.setTax(tax);
		System.out.println(obj);
		taxcalculation tax = new taxcalculation();
		tax.

	}

}
