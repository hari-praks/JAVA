package exceptionHandling;

import java.util.InputMismatchException;

public class CreatingErrors {

	public static void main(String[] args) {
		try
		{
			calculator obj = new calculator("Caseo",10,20);
			obj.add();
			obj.divide();
			obj.display_namelength();
			int arr[] = {1,2,3,4,5};
			System.out.println(arr[6]);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException i)
		{
			System.out.println(i.getMessage());
		}
		catch(NullPointerException n)
		{
			System.out.println(n.getMessage());
			System.out.println("Example for null pointer Exception");
		}
		catch (ArrayIndexOutOfBoundsException A) {
			System.out.println(A.getMessage());
			System.out.println("Example for ArrayIndexOutOfBoundsException ");
		}
	}
}
class calculator
{
	String name;
	int num1;
	int num2;
public calculator(String name, int num1, int num2) {
	this.name = name;
	this.num1 = num1;
	this.num2 = num2;
}
public void add() throws InputMismatchException{
	System.out.println(num1+num2);

}
public void divide() throws ArithmeticException{
	System.out.println(num1/num2);
	
}
public void display_namelength()throws NullPointerException{
	System.out.println(name.length());
	}
}

