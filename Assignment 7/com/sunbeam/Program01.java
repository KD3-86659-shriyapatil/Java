package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class StudCityComparator implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		return o1.city.compareTo(o2.city);
	}

	
	}
class StudMarksComparatorDesc implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		return Double.compare(o2.marks , o1.marks);
	}
	}
class StudNameComparatorAsc implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		return o1.name.compareTo(o2.name);
	}
	

}

public class Program01 {
	public static int menu(Scanner sc) {
		System.out.println("0.Exit");
		System.out.println("1.display all Students");
		System.out.println("2.display all Students sorted on their city");
		System.out.println("3.display all Students sorted on their on marks");
		System.out.println("4.display all Students sorted on their name");
		System.out.println("5.display all Students sorted on the rollno");
		System.out.println("Enter choice -");
		return sc.nextInt();
	}
	public static void displayAllStudents(Students[]arr) {
		System.out.println("**************************");
        for(Students s:arr) {
//        	System.out.println(s.toString());
        	System.out.println(s);
        }
        
		System.out.println("**************************");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Students[] arr = new Students[5];
        Comparator<Students> comparator ;
        arr[0]=new Students(1,"Shriya","Kolhapur",70);
        arr[1]=new Students(4,"Shraddha","Sangli",40);
        arr[2]=new Students(2,"Shreyash","Pune",60);
        arr[3]=new Students(5,"Deependra","Mumbai",80);
        arr[4]=new Students(3,"Pradnya","Nagar",90);
        

        int choice ;
        while((choice=menu(sc))!=0) {
        	switch(choice) {
        	case 1:
        		System.out.println("********************");
        		displayAllStudents(arr);
        		System.out.println("********************");
        		break;
        	case 2:
        		System.out.println("********************");
        		comparator = new StudCityComparator();
        		Arrays.sort(arr,comparator);
        		displayAllStudents(arr);
        		System.out.println("********************");
        		break;
        	case 3:
        		System.out.println("********************");
        		comparator = new StudMarksComparatorDesc();
        		Arrays.sort(arr,comparator);
        		displayAllStudents(arr);
        		System.out.println("********************");
        		break;
        	case 4:
        		System.out.println("********************");
        		comparator = new StudNameComparatorAsc();
        		Arrays.sort(arr,comparator);
        		displayAllStudents(arr);
        		System.out.println("********************");
        		break;
        	case 5:
        		System.out.println("********************");
        		Arrays.sort(arr);
        		displayAllStudents(arr);
        		System.out.println("********************");
        		break;
        	default :
        		System.out.println("Wrong choice..");
        		
        		
        	}
        }

	}

}



