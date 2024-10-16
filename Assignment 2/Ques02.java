import java.util.Scanner;

public class Ques02 {

	public static void main(String[] args) {
		
        int choice;
        int bill=0;
        int price;
        
   Scanner sc = new Scanner(System.in);
   
    
   do {
	   
	   System.out.println("1.Dosa,2.Samosa,3.Idli,4.Vadapav,5.Pavbhaji,6.Genarate Bill");
	   System.out.println("Enter choice");
	   choice = sc.nextInt();
	   switch(choice) {
	   case 1:
		   System.out.println("Dosa");
		    price=40;
		   bill=bill+price;
		   break;
	   case 2:
		   System.out.println("Samosa");
		    price=20;
		    bill=bill+price;
		   break;
	   case 3:
		   System.out.println("Idli");
		   price=35;
		   bill=bill+price;
		   break;
	   case 4:
		   System.out.println("Vadapav");
		   price=40;
		   bill=bill+price;
	   case 5:
		   System.out.println("Pavbhaji");
		   price=40;
		   bill=bill+price;
		   break;
	   case 6:
		   System.out.println("Genarate bill-" +bill);
		   break;
	   
	  default:
		  choice = 6;
		  System.out.println("Thank you");
		  
		  }
	   
   }while(choice != 6 );
}
}