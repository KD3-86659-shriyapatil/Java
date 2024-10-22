package com.reverse;

public class palindrome {

	public static void main(String[] args) {
		String Original = "racecar";
		StringBuffer Reversed = new StringBuffer(Original);
		String reversedWord = Reversed.reverse().toString();
		
		System.out.println("Original string-"+Original);
		System.out.println("reversed String-"+reversedWord);
		
		if (Original.equals(reversedWord)) {
			System.out.println(Original + " " +" is Palindrome");
		}else {
			System.out.println("not available");
		}

	}

}
