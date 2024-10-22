package Tester;

import java.util.Scanner;

import com.sunbeam.ExceptionLineToLong;

public class CheckStringLenght {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String-");
		String userput = sc.nextLine();
		
		try {
			CheckStringLenght(userput);
			System.out.println("Check the lenght of string-"+userput.length());
			}catch(ExceptionLineToLong e) {
			e.printStackTrace();	
			}
		finally {
				Scanner scanner = new Scanner(System.in);
				scanner.close();
			}
		
		

	}

	private static void CheckStringLenght(String userput) throws ExceptionLineToLong
	{
		if(userput.length()>80) {
			
			throw new ExceptionLineToLong("The strings is too long");
		
		}
		
	}

	

}
