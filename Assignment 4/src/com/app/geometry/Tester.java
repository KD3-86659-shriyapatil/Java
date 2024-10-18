package com.app.geometry;

import java.util.Scanner;

public class Tester {
	
        public static void main(String[] args) {
		
		    Point2D p1 = new Point2D();
	        p1.getDetails();
            p1.accept();
         
           Point2D p2 = new Point2D();
           p2.getDetails();
           p2.accept();
      
         
         if(p1.isEqual(p2)) {
        	 System.out.println("same point");
         }else {
        	 System.out.println(p1.calculateDistance(p2));
         }
         
         
       

	}

}
