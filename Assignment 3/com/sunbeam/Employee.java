package com.sunbeam;

public class Employee {
     String firstName;
     String lastName;
     double salary;
     
     public Employee () {
     
     }
      
     public  Employee(String firstName,String lastName,double salary) {
    	 this.firstName = firstName;
    	 this.lastName = lastName;
    	 this.salary = salary;
     }
     
     
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double displaySalary() {
		return(12*salary*1.1);
		
	}
} 
    