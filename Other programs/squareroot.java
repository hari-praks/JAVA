import java.util.Scanner;
import java.lang.Math;

public class squareroot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		float a = input.nextFloat();
		float total = 0 ;
		total= (float) (1.732/4)*a*a;
		System.out.println("The area of equilateral triangle is : "+ total);
		
	}



}
