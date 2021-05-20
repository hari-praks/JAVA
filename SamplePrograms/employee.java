package javaprograms;

import java.util.Scanner;

public class employee {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		  System.out.println("Enter the name:");
		  String name = in.nextLine();
		  long phone = in.nextLong();
		  int exp = in.nextInt();
		  if(exp>3) 
		  {
			  System.out.println("Bonus:"+ 500*(exp-3));
			  System.out.println("Mobile:"+ phone);
		  }
		  else
		  {
			  System.out.println("Not eligible for bonus");
		  }

	}

}
