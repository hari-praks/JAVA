package exceptionHandling;

import java.util.Scanner;

public class ProfessorsException {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Enter marks of 5 students");
			int marks[] =new int[5];
			for(int i=0;i<5;i++)
			{
				marks[i]=in.nextInt();
				if(marks[i]<0)
				{
					throw new negative("Numbers should be greater than 0");
				}
				if(marks[i]>100)
				{
					throw new positive("Numbers should not exceed more than 100");
				}
			}
		}
		catch(negative n)
		{
			System.out.println(n.getMessage());
		}
		catch(positive p)
		{
			System.out.println(p.getMessage());
		}
		
	}
}
class userdefined extends Exception
{
	public userdefined(String S)
	{
		super(S);
	}
}
class negative extends userdefined
{
	public negative(String n) {
		super(n);
	}
}
class positive extends userdefined
{
	public positive(String m) {
		super(m);
	}
}
