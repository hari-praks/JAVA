package javaprogram;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SalarayandDependent {
	public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter empid: ");
			String empid=in.nextLine();
			if(empid.startsWith("1"))
			{
				System.out.println("Welcome Professor");
				professors p =  new professors();
				p.getprof();
			}
			if(empid.startsWith("2"))
			{
				System.out.println("Welcome Associate Professor");
				professors p1 =  new professors();
				p1.getassociateprof();
			}
			if(empid.startsWith("3"))
			{
				System.out.println("Welcome Assistant Professor");
				professors p2 =  new professors();
				p2.getassistantprof();
			}
			if(empid.startsWith("4"))
			{
				System.out.println("Welcome TRA");
				professors p3 =  new professors();
				p3.dispTRA();
			}
	}

}
class dependent
{
	String name;
	String phone;
	String dob;
	dependent(String n,String p,String d)
	{
		name=n;
		phone=p;
		dob=d;
	}
	public void display()
	{
		System.out.println(name+" "+phone+" "+dob);
	}
	
}
class professors
{
	double salary;
	dependent profdep;
	
	public void getprof()
	{
		profdep=new dependent("Hari","7639625365","01-01-2002");
		salary=150000;
		double cal=salary+0.3*salary;
		System.out.println("Salary of professors is : "+cal);
		profdep.display();
	}
	
	public void getassociateprof()
	{
		profdep=new dependent("Prakash","7639999365","10-03-1962");
		salary=120000;
		double cal=salary+0.2*salary;
		System.out.println("Salary of Associate professors is : "+cal);
		profdep.display();
	}
	public void getassistantprof()
	{
		profdep=new dependent("Prahal","9025691594","11-11-2010");
		salary=100000;
		double cal=salary+0.1*salary;
		System.out.println("Salary of Assistant professors is : "+cal);
		profdep.display();
	}
	public void dispTRA()
	{
		profdep=new dependent("Joshua","9942964080","23-03-1950");
		salary=20000;
		System.out.println("TRA's Salary: "+salary);
		profdep.display();
	}
}

