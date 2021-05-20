package javaprograms;
import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		  System.out.println("Enter the number:");
		  int a = in.nextInt();
		  if(a%2==0)
		  {
			  System.out.println("The number is even");
		  }
		  else if(a%2!=0)
		  {
			  System.out.println("The number is odd");
		  } 
		  in.close();

	}

}
