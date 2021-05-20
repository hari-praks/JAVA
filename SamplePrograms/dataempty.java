package javaprograms;

import java.util.Scanner;

public class dataempty {

	public static void main(String[] args) {
		
		children s=new children();
		s.getdetails();
		s.checkentry();
	}

}

class children{
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
	public void checkentry()
	{
		if(this.name.isEmpty() && this.regno.isEmpty())
		{
			System.out.println("Please enter something");
		}
	}
}
