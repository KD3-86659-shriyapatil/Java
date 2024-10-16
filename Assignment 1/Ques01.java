import java.util.Scanner;

public class Ques01 {

	public static void main(String[] args) {
		double n1;
		double n2;
		double avg;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter n1-");
		
		if(sc.hasNextDouble() && !sc.hasNextInt()) 
		{
			n1=sc.nextDouble();
			System.out.println("Enter n2-");
			if(sc.hasNextDouble() && !sc.hasNextInt()) 
			{
				n2=sc.nextDouble();
				avg=(n1+n2)/2;
				System.out.println("Avg-"+avg);
			}
			else
			{
				System.out.println("error");
			}
		}
		else
		{
			System.out.println("error");	
		}
    }
}