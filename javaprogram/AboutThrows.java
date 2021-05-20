package javaprogram;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AboutThrows {
	public static void main(String[] args) {
		try
		{
			dividebyzero d = new dividebyzero();
			d.dividenum();	
		}
		catch(ArithmeticException e)
		{
			System.out.println("this is caught here");
		}
		catch(InputMismatchException i)
		{
			System.out.println("Input mismatch is handled here");
		}
		finally
		{
			System.out.println("Finally i am executed");
		}
	}
}
class dividebyzero
{
	private int a,b;
	//constructor can throw an error
	public dividebyzero() throws InputMismatchException
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 no's from dividebyzero: ");
		a=in.nextInt();
		b=in.nextInt();
	}
	//throw is used for throwing exception
	//throws is used in methods
	public void dividenum() throws ArithmeticException {
		System.out.println(a/b);
	}

}
