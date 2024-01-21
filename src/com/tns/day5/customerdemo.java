package com.tns.day5;
import java.util.Scanner;

public class customerdemo {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		String name,id,city;
		System.out.println("enter name");
		name = sc.nextLine();
		System.out.println("enter id");
		id = sc.nextLine();
		System.out.println("enter city");
		city = sc.nextLine();
		
		System.out.println();
		//default
		customer c1=new customer();
		c1.setCustomername(name);
		c1.setCustomerid(id);
		c1.setCustomercity(city);
		
		//parameterized
		customer c2 = new customer(name,id,city);
		System.out.println("enter name");
		name =sc.nextLine();
		System.out.println("enter id");
		id =sc.nextLine();
		System.out.println("enter city");
        city = sc.nextLine();
        
        c2.setCustomername(name);
        c2.setCustomerid(id);
        c2.setCustomercity(city);
        
        sc.close();
        System.out.println(c2);
		

	}

}
