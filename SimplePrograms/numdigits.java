package javaprogram;

import java.util.Scanner;

public class numdigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		  System.out.println("Enter the number:");
		  int a = in.nextInt();
		  
			  int r = a%10;
			  int q = a/10;
			  
			  int b=q/10;
			  int c=q%10;
			  System.out.println(r);
			  System.out.println(b);
			  System.out.println(c);
			  int even=0,prime=0,odd=0;
			  if(r%2==0 || b%2==0 || c%2==0)
			  {
				  even++;
				 
			  }
			  if(r%2!=0 && b%2!=0 && c%2!=0 )
			  {
				  odd++;
				  
			  }
			  System.out.println("Even numbers:"+even);
			  System.out.println("odd numbers:"+odd);
			  System.out.println("Prime numbers:"+prime);
			 
			  

		  
	}

}
