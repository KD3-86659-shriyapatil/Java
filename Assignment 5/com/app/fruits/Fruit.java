package com.app.fruits;

import java.util.Scanner;

public abstract class Fruit {
	String name;
	String color;
	double weight;
	boolean isFresh = true;
	
	public Fruit() {
		
	}
    
	public Fruit(String name) {
		this.name=name;
	}
	public Fruit(String name, String color, double weight) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
    public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
    public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public boolean getisFresh() {
		return isFresh;
	}

	public  void accept(Scanner sc) {
//		System.out.println("Enter Name =");
//		name=sc.next();
		System.out.println("Enter Color =");
		color=sc.next();
		System.out.println("Enter weight =");
		weight=sc.nextDouble();
//		System.out.println("Enter isFresh=");
//		isFresh=sc.nextBoolean();
	}
	public void display() {
		System.out.println("Name-"+name);
		System.out.println("Color-"+color);
		System.out.println("Weight-"+weight);
		System.out.println("IsFresh-"+isFresh);
	
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ",color=" + color + ", weight=" + weight + "]";
	}
	
//	public boolean isFresh() {
//		return isFresh;
//		
//		
//	}
	public abstract String taste();

	
	

}
