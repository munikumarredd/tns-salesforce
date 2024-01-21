package com.tns.day3;

import java.util.Scanner;

public class employeedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee emp=new employee();
		String name,dept;
		int id,age;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name=");
		name=sc.next();
		System.out.println("enter dept=");
		dept=sc.next();
		System.out.println("enter id=");
		id=sc.nextInt();
		System.out.println("enter age=");
		age=sc.nextInt();
		emp.setName(name);
		emp.setDept(dept);
		emp.setId(id);
		emp.setAge(age);
		System.out.println(emp);
		

	}

}
