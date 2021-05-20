package javaprograms;
import java.util.Scanner;
public class facultylabex {

	public static void main(String[] args) {
		staff obj = new staff();
		obj.get_faculty();
		staff.degree nested_obj = obj.new degree();
		nested_obj.get_degree();
		obj.display_faculty();
		nested_obj.degree_details();

	}

}
class staff
{
	String name;
	String empid;
	String degree;
	
	Scanner in =  new Scanner(System.in);
	public void get_faculty()
	{
		System.out.println("Enter details: ");
		name=in.nextLine();
		empid=in.nextLine();
		degree=in.nextLine();
	}
	
	public void display_faculty()
	{
		System.out.println("Name: "+name);
		System.out.println("Employee id : "+empid);
		System.out.println("Degree: "+degree);
	}
	
	class degree
	{
		String d_name;
		String awarded_year;
		String awarded_by;
		
		public void get_degree()
		{
			d_name=in.nextLine();
			awarded_year=in.nextLine();
			awarded_by=in.nextLine();
		}
		public void degree_details()
		{
			System.out.println("Degree_Name: "+d_name);
			System.out.println("Awarded year: "+awarded_year);
			System.out.println("Awarded By: "+awarded_by);
		}
		
	}
}
