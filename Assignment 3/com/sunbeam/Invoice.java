package com.sunbeam;

import java.util.Scanner;

public class Invoice {
	String partNumber;
	String partDescription;
	int quantity;
	double price;
	
	public Invoice(String partNumber,String partDescription,int quantity,double price) {
		this.partNumber=partNumber;
		this.partDescription=partDescription;
		this.quantity=quantity;
		this.price=price ;
		}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
   void accept() {
	   Scanner sc =new Scanner (System.in);
	   System.out.println("Enter Part Number-");
	   partNumber= sc.next();
	   
	   System.out.println("Enter Part Description-");
	   partDescription = sc.next();
	   
	   System.out.println("Enter quantity-");
	   quantity=sc.nextInt();
	   
	   System.out.println("Enter Price-");
	   price =sc.nextDouble();
	   
   }
   void display() {
	   System.out.println("Part Number-"+partNumber);
	   System.out.println("Part Description-"+partDescription);
	   if(quantity>0) {
		   System.out.println("Quantity-"+quantity);
	   }else {
		   System.out.println("Quantity-"+0);
	   }
	   if(price>0) {
		   System.out.println("Price-"+price);
	   }else {
		   System.out.println("Price-"+0);
	   }
	   System.out.println("Total Price-"+quantity*price);
   }
}
