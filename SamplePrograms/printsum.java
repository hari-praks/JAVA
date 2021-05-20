package javaprograms;

import java.util.Scanner;

public class printsum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		  System.out.println("Enter the number:");
		  int a = in.nextInt();
		  int total=0;
		  int var2=0;
		  for(int i=1;i<=a;i++)
		  {
			 total=i;
			 var2=total+var2;
			
		  }
		  System.out.println("Sum of numbers is:"+var2);
	}

}
