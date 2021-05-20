package javaprograms;

import java.util.Scanner;

public class radius {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		  System.out.println("Enter the radius:");
		  double a = in.nextDouble();
		  double total=3.14 * a * a;
		  System.out.println(total);

	}

}
