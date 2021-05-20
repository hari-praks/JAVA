import java.util.Scanner;

public class arrayofobjeg {

	public static void main(String[] args) {
		
		students s[]=new students[2];
		for(int i=0;i<2;i++)
		{
			s[i]=new students();
		}
		for(int i=0;i<2;i++)
		{
			s[i].getdetails();
		}
		for(int i=0;i<2;i++)
		{
			s[i].displaydetails();
		}
	}

}
class students{
	String name;
	String regno;

	public void getdetails()
	{
		Scanner input= new Scanner(System.in);
		System.out.println("enter name : ");
		name=input.nextLine();
		System.out.println("enter regno : ");
		regno=input.nextLine();
		
	}
	public void getdetails(String iname,String iregno)
	{
		this.name=iname;
		this.regno=iregno;
	}
	public void displaydetails()
	{
		System.out.println("Student name is " + name);
		System.out.println("Student regno is "+ regno);
	}
}