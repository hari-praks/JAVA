package javaprograms;
import java.util.Scanner;
public class Eligibleleave {

	public static void main(String[] args) {
		
		faculty obj[] = new faculty[3];
		for(int i=0;i<3;i++)
		{
			obj[i]=new faculty();
			obj[i].getdetails();
		}
		for(int i=0;i<3;i++)
		{
			obj[i].dispdetails();
			faculty.eligible_leave.display_leavedetails();
		}
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
		System.out.println(name);
		System.out.println(empid);
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