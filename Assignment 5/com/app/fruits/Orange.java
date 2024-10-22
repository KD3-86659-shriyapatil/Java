package com.app.fruits;

import java.util.Scanner;

public class Orange extends Fruit {
    
	public Orange() {
		super("Orange");
	}
	
	public Orange(String name, String color, double weight) {
		super(name, color, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
	}

	@Override
	public String toString() {
		return "Orange [name=" + name + ",color=" + color + ", weight=" + weight + "]";
	}

	@Override
	public String taste() {
		return "Sour";

	}

}
