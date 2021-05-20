package javaprograms;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		  System.out.println("Enter the Year:");
		  int a = in.nextInt();
		  if(a % 400==0)
		  {
			  System.out.println("The Year is leap year");
		  }
		  else if(a % 100 == 0)
		  {
			  System.out.println("The Year is not a leap year");  
		  }
		  else if(a % 4 == 0)
		  {
			  System.out.println("The Year is a leap year");    
		  }
		  else {
			  System.out.println("This is not a leap year ");  
		  }
	}

}
