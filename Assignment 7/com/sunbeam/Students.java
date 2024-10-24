package com.sunbeam;

import java.util.Comparator;

public class Students implements Comparable<Students> {
	 int roll;
     String name;
	 String city;
	 double marks;
	
	public Students() {
		
	}
	
	
	public Students(int roll, String name, String city, double marks) {
		
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Students [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Students s) {
		return this.roll - s.roll ;
	}
}
