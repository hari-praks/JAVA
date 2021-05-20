package javaprogram;
import java.util.InputMismatchException;
import java.util.Scanner;
public class HowToHandleException {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter 2 numbers");
		try
		{
			int num1=in.nextInt();
			int num2=in.nextInt();
			if(num1==13)
			{
				throw new no13exception("I dont like 13");
			}
			if(num1==15)
			{
				throw new no15exception("I dont like 15");
			}
			if(num2==0)
			{
				throw new ArithmeticException("Zero is not allowed!");
			}
			System.out.println("the division of 2 no's "+ num1/num2);
		}
		/*catch(no13exception m)
		{
			System.out.println(m.getMessage());
		}
		
		catch(no15exception m)
		{
			System.out.println(m.getMessage());
		}
		*/
		//Base class can contain catch block it reduces LOC
		
		catch(no15exception m)
		{
			System.out.println(m.getMessage());
		}//CHILD CLASS BEFORE BASE CLASS IS ALLOWED AND WHICHEVER THERE FIRST EXECUTES FIRST
		catch(myexception a)
		{
			System.out.println(a.getMessage());
			if(a instanceof no13exception)
			{
				System.out.println("Please don't enter 13 again");
			}
			if(a instanceof no15exception)
			{
				System.out.println("Please don't enter 15 again");
			}
		}
		/*catch(no15exception m)
		{
			System.out.println(m.getMessage());
		}WE CAN'T ADD CHILD CLASS AFTER BASE CLASS IS DEFINED */
		//This checks for both 13 and 15 acc to the input given
		//U can use exception also since myexception is a base class for Exception class
		catch(ArithmeticException e)//try should be followed by try
		{
			System.out.println(e.getMessage());
			e.printStackTrace();//gives the detail description of the error
		}
		catch(InputMismatchException b)
		{
			System.out.println("Enter correct data");
		}

	}

}
//User defined Exception
class myexception extends Exception
{
	public myexception(String S)
	{
		super(S);
	}
}
class no13exception extends myexception
{
	public no13exception(String n) {
		super(n);
	}
}
class no15exception extends myexception
{
	public no15exception(String m) {
		super(m);
	}
}



