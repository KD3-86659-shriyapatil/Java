package com.app.fruits;

import java.util.Scanner;

public class Apple extends Fruit {
	
	public Apple() {
		super("Apple");
	}
   public Apple(String name, String color, double weight) {
		super(name, color, weight);
		// TODO Auto-generated constructor stub
	}

@Override
   public void accept(Scanner sc) {
       super.accept(sc);
   }
   
    @Override
    public String toString() {
    	return "Apple [name=" + name + ",color=" + color + ", weight=" + weight + "]";
}


	@Override
	public String taste() {
	return "Sweet n sour";

	}

}
