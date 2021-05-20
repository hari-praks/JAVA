package javaprograms;
import java.util.Scanner;
public class Multinestedclassobjs {

	public static void main(String[] args) {
		
		emp obj = new emp();
		//obj.getinfo();
		System.out.println("Enter how many address you possess: ");
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		emp.address innerarray[] = new emp.address[n];
		for(int i=0;i<n;i++)
		{
			innerarray[i] = obj.new address();
			innerarray[i].getdetails();
		}	
		for(int i=0;i<n;i++)
		{
			innerarray[i].disdetails();
		}
	}
}

class emp
{
	public String name;
	public String empid;
	public void getinfo()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter employee name");
		name=in.nextLine();
		System.out.println("Enter employee empid");
		empid=in.nextLine();
	}
	
	public class address
	{
		public String Street;
		public String City;
		public String District;
		public String State;
		public String Country;
		public String Zipcode;

		public void getdetails()
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter his address: ");
			Street=in.nextLine();
			City=in.nextLine();
			District = in.nextLine();
			State = in.nextLine();
			Country=in.nextLine();
			Zipcode=in.nextLine();
		}
		public void disdetails()
		{
			System.out.println("Name of employee: "+name);
			System.out.println("Empid: "+empid);
			System.out.println("Street: "+Street);
			System.out.println("City: "+City);
			System.out.println("District: "+District);
			System.out.println("State: "+State);
			System.out.println("Country: "+Country);
			System.out.println("Zipcode: "+Zipcode);
		}
		
	}
}
