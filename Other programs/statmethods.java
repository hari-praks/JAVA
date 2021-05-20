import java.util.Scanner;
public class statmethods {
	static int k;
	int f;
	static int j;//usually it throws an error that y we create static blocks
	static {
		k=20;
		j=30;
		//f=15;//this can't be done since its not static
		System.out.println("I m running first");
	}
	public static void main(String[] args) {
		System.out.println(k+j);
		firstclass s1= new firstclass();
		s1.getdetails();
		firstclass s2= new firstclass();
		s2.getdetails();
		System.out.println(s1.display_details());
		System.out.println(s2.display_details());
		s1.print_address();
		//no need to create an object to invoke display_total_students
		firstclass.display_total_students();
		firstclass.display_total_students("Myname");
	}
}
class firstclass{
	public String name;
	public String regno;
	public static String univ_add="vellore vit";//since univ_add is common for all we gonna make that as a static variable
	//we save memory by creating it
	public static int count=0;
	public firstclass()
	{
		count++;//this shows that wenever an obj is created,count gets incremented
	}
	public void getdetails()
	{
		Scanner input= new Scanner(System.in);
		System.out.println("enter name : ");
		name=input.nextLine();
		System.out.println("enter regno : ");
		regno=input.nextLine();
		
	}
	public String display_details()
	{
		return name+regno+univ_add;
	}
	public static void display_total_students()
	{
		//System.out.println(name);//we can't access a non static member in static method
		System.out.println("The total num of objects is "+count);
		//print_address();//we can't call the other members which are non static from static methods
	}
	
	public static void display_total_students(String test)
	{
		System.out.println("this is from an overloaded static method "+test);
		//static members can be overloaded bt not overridden
	}
	public void print_address()
	{
		System.out.println("university address"+ univ_add);
		//getdetails();//this is possible meaning s1.getdetails
		firstclass.display_total_students("myothername");
		//a non static method can call the static method
	}
}
