package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	
	int x;
	int y;
	
   public Point2D() {
		
	}

   public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
   
  public int getX() {
	return x;
}

  public void setX(int x) {
	this.x = x;
}

  public int getY() {
	return y;
}

  public void setY(int y) {
	this.y = y;
}

  public String getDetails() {
	 return"[x"+x+",y"+y+"]";
  }
	
	public boolean isEqual(Point2D o) {
		return this.x==o.x && this.y==o.y ;
}

	public double calculateDistance(Point2D o) {
		return Math.sqrt(Math.pow((this.x-o.x),2)+Math.pow((this.y-o.y),2));
	}

	public void  accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X-");
		x=sc.nextInt();
		
		System.out.println("Enter Y-");
		y=sc.nextInt();
		
		}
	
      public void display() {
		System.out.println("X-"+x);
		System.out.println("Y-"+y);
	}
}
