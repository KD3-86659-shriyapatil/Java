package com.reverse;

public class ReversedString {

	public static void main(String[] args) {
		String Original = "Hello Shriya";
		StringBuffer Reversed = new StringBuffer(Original);
		String reversedWord = Reversed.reverse().toString();
		
		System.out.println("Original string-"+Original);
		System.out.println("reversed String-"+reversedWord);
		

	}

}
