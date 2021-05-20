package javaprograms;
import java.util.Scanner;
public class ex7 {

	public static void main(String[] args) {
		
		System.out.println("Press 1 to exit and 2 to proceed");
		Scanner in = new Scanner(System.in);
		  System.out.println("Enter: ");
		  int a = in.nextInt();
		  switch(a)
		  {
		  case 1:
			  System.out.println("you are out");
			  break;
			 
			  
		  case 2:
			  System.out.println("Enter the numbers");
			  int num1 = in.nextInt();
			  int num2 = in.nextInt();
			  int Sum = num1+num2;
			  System.out.println("Sum:"+Sum);
			  
		  }

	}

}
