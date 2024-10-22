package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	public static int menu(Scanner sc) {
		System.out.println("0.EXIT");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display name of all fruits");
		System.out.println("5.Display name,color,weight,taste of all fresh fruits");
		System.out.println("6.Display taste of all stale fruits");
		System.out.println("7.Mark fruit as stale");
		System.out.println("8.Mark all sour fruits stale");
		System.out.println("Enter your choice-");
		return sc.nextInt();
	}
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of Fruit basket-");
		int n = sc.nextInt();
		Fruit[] arr = new Fruit [n];
		int index=0;
		int choice;
		while((choice=menu(sc))!= 0) {
			switch (choice) {
			case 1:
				System.out.println("*****************************");
				if(index<n) {
			     arr[index] = new Mango();
			     arr[index].accept(sc);
			     arr[index].display();
			     index++ ;
			    System.out.println("*****************************");
				}
			     break;
			case 2:
				System.out.println("*****************************");
				if (index<n) {
				arr[index] = new Orange();
				arr[index].accept(sc);
				arr[index].display();
			    index++ ;
			    System.out.println("*****************************");
				}
			    break;
			case 3:
				System.out.println("*****************************");
				if (index<n) {
				arr[index] = new Apple();
				arr[index].accept(sc);
				arr[index].display();
                index++ ;
                System.out.println("*****************************");
				}
				break;
			case 4:
				System.out.println("*****************************");
                   for(Fruit e:arr) {
                  if (e.getName()!=null) {
               	  e.getName();
                   System.out.println("Name-"+e.getName());
                   System.out.println("*****************************");
                  }
                   }
					break;
			case 5:
				System.out.println("*****************************");
				for(Fruit e:arr) {
					if (e.getName()!=null)  {
						e.display();
				System.out.println("Name-"+e.toString());
				System.out.println("taste-"+e.taste());
				 System.out.println("*****************************");
				}
				}
				break;
			case 6:
				System.out.println("*****************************");
				for(Fruit e:arr) {
					if(e.getisFresh()==false) {
						System.out.println("Name-"+e.getName());
						System.out.println("Taste-"+e.taste());
						
			 System.out.println("*****************************");
					}
				}
		      break;
				
				
			case 7:
				System.out.println("*****************************");
            System.out.println("Enter index of stale fruit");
            index = sc.nextInt();
            if(index<arr.length || index>0) {
            	arr[index].setFresh(false);
            }
            System.out.println("*****************************");
             
				break;
				
			case 8:
				System.out.println("*****************************");
				for(Fruit e:arr) {
					if(e.taste()=="Sour") {
						e.setFresh(false);
				System.out.println("Name-"+e.getName());
				 System.out.println("*****************************");
					}
				}
				break;
				   
				}
			}
		
		}
	
		
	}


