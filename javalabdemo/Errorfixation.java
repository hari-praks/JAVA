package javalabdemo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Errorfixation {

	public static void main(String[] args) throws Exception{
		
		emp e[]=new emp[2];
		for(int i=0;i<2;i++)
		{
			e[i]=new emp();
			e[i].get();
		}
		
		
	
	}
}
class emp
{
	String empid,name,department,designation;
	int age,YOE,salary;
	public void get()
	{
		try
		{
			System.out.println("Enter details ");
			Scanner in = new Scanner(System.in);
			empid=in.nextLine();
			name=in.nextLine();
			department=in.nextLine();
			designation = in.nextLine();
			age=in.nextInt();
			YOE=in.nextInt();
			salary=in.nextInt();
			if(YOE>20 || YOE<5)
			{
				throw new YOException("Experience does not Match");
			}
			if(salary>500000 || salary<5000)
			{
				throw new salexception("Salary does not fall within the range");
			}
			if(age>60 || age<25)
			{
				throw new ageException("Age not in the range");
			}
		}
		catch(YOException a)
		{
			System.out.println(a.getMessage());
		}
		catch(salexception s)
		{
			System.out.println(s.getMessage());
		}
		catch(ageException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}
class MYexception extends Exception
{
	public MYexception(String S)
	{
		super(S);
	}
}
class YOException extends MYexception
{
	public YOException(String n) {
		super(n);
	}
}
class salexception extends MYexception
{
	public salexception(String m) {
		super(m);
	}
}
class ageException extends MYexception
{
	public ageException(String n)
	{
		super(n);
	}
}

