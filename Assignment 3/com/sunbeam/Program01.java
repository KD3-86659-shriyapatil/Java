package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		Employee e1 = new Employee ("Shraddha","Patil",30000);
		
		Employee e2 = new Employee ("Shriya","Patil",20000);
		
		System.out.println("First Name-" +e1.firstName);
		System.out.println("Last Name-"+e1.lastName);
		System.out.println("Monthly salary-"+e1.salary);
		System.out.println("Incremented salary-"+e1.displaySalary());
		System.out.println("*************************************************");
		System.out.println("First Name-"+e2.firstName);
		System.out.println("Last Name-"+e2.lastName);
		System.out.println("Monthly salary-"+e2.salary);
		System.out.println("Incremented salary-"+e2.displaySalary());
		System.out.println("*************************************************");
	}

}
