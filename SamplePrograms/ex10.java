package javaprograms;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		  System.out.println("Enter the number:");
		  int a = in.nextInt();
		  int rev = 0;
	        while(a >22 ) {
	            int b = a % 10;
	            rev = rev * 10 +b;
	            a /= 10;
	        }
	        int total=rev+a;
	        if(total%2!=0)
	        {
		        System.out.println("Odd sum");
	        }
	        else
	        {
		        System.out.println("Not a odd sum");
	        }

	}

}
