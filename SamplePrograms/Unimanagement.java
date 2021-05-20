package javaprograms;
import java.util.Scanner;
public class Unimanagement {

	public static void main(String[] args) {
		faculty obj[] = new faculty[3];
		student obj2[]=new student[3];
		for(int i=0;i<3;i++)
		{
			obj[i]=new faculty();
			obj[i].getdetails();
		}
		
		for(int i=0;i<3;i++)
		{
			obj2[i]=new student();
			obj2[i].getdetails();	
		}
		
		CSEstudentreport obj1=new CSEstudentreport();
		obj1.function();
		System.out.println("Faculty Details");
		for(int i=0;i<3;i++)
		{
			obj[i].dispdetails();
			faculty.eligible_leave.display_leavedetails();
		}
		for(int i=0;i<3;i++)
		{
			obj2[i].displaydetails();
		}

	}

}
class CSEstudentreport {

	public void function() {
		Scanner input = new Scanner(System.in);
		String regno[] = new String[4];
		System.out.println("Enter regno: ");
		for(int i=0;i<regno.length;i++)
		{
			regno[i]=input.nextLine();
			if(regno[i].contains("BCE"))
			{
				continue;
			}
			else
			{
				System.out.println("Only CSE students are allowed");
			}
		}
		for(int i=0;i<regno.length;i++)
			{
				for(int j=i+1;j<regno.length;j++)
				{
					if(regno[i].compareTo(regno[j])>0)
					{
						String var=regno[i];
						regno[i]=regno[j];
						regno[j]=var;
					}
				}
			}
		for(int i=0;i<regno.length;i++)
		{
			System.out.println(regno[i]);
		}
	}
}
class student
{
	public String name;
	public String regno;
	public void getdetails()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student name: ");
		name=in.nextLine();
		System.out.println("Enter Student regno: ");
		regno=in.nextLine();
	}
	public void displaydetails()
	{
		System.out.println(name+" "+regno);
	}
}
class faculty
{
	private String name;
	private String empid;
	public void getdetails()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Faculty name: ");
		name=in.nextLine();
		System.out.println("Enter Faculty empid: ");
		empid=in.nextLine();
	}
	public void dispdetails()
	{
		System.out.println("Faculty name "+ name);
		System.out.println("Faculty id: "+empid);
	}
	
	
	public static class eligible_leave
	{
		public static int el=12;
		public static int ml=20;
		public static int cl=10;
		public int i=10;
		
		public static void display_leavedetails() {
			
			
			System.out.println("the num of el is "+el);
			System.out.println("the num of ml is "+ml);
			System.out.println("the num of cl is "+cl);
	  }
		
	}
}
