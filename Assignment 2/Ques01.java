import java.util.Scanner;

 public class Ques01 {

	public static void main(String[] args) {
 	   Scanner sc = new Scanner (System.in);
 	    
        System.out.println( "Enter number");
        int n1 = sc.nextInt();
      
        System.out.println("Given Number :" +n1);
        
        //binary 
        String binary = Integer.toBinaryString(n1);
        //octal
        String octal = Integer.toOctalString(n1);
        //hexadecimal
        String hexadecimal = Integer.toHexString(n1);
        
        System.out.println("Binary equivalent :"+binary);
        System.out.println("Octalequivalent :"+octal); 
        System.out.println("Hexadecimal equivalent :"+hexadecimal); 
	}

}
