package javaprogram;

import java.util.Scanner;

public class Association {

	public static void main(String[] args) {
		
		samplestudent s1=new samplestudent();
		s1.getinfo();
		professor p =new professor();
		p.viewstudentprofile(s1);

	}

}
class samplestudent
{
	String name;
	String regno;
	
	public void getinfo()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter student details");
		name=in.nextLine();
		regno=in.nextLine();
	}
}
class professor
{
	public void viewstudentprofile(samplestudent s)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter regno that u want to view");
		String regnoview=in.nextLine();
		if(s.regno.equals(regnoview))
		{
			System.out.println(s.name+" "+s.regno);
		}
	}
}