package javaprograms;

import java.util.Scanner;

public class Mutlipleobjeg2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		department outer = new department();
		outer.getinfo();
		System.out.println("Enter number of location that a department possess: ");
		int n=in.nextInt();
		department.location inner[]=new department.location[n];
		for(int i=0;i<n;i++)
		{
			inner[i]=outer.new location();
			inner[i].getdetails();
		}
		for(int i=0;i<n;i++)
		{
			inner[i].dispdetails();
		}

	}

}
class department
{
	Scanner in = new Scanner(System.in);
	String depname;
	public void getinfo()
	{
		System.out.println("enter dep name: ");
		depname=in.nextLine();
		
	}
	class location
	{
		String lid,lname,longitude,latitude;
		
		public void getdetails()
		{
			
			System.out.println("Enter location details: ");
			lid=in.nextLine();
			lname=in.nextLine();
			longitude=in.nextLine();
			latitude=in.nextLine();
		}
		public void dispdetails()
		{
			System.out.println(lid+" "+lname+" "+longitude+" "+latitude);
		}
		
	}
}