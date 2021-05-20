package javaprogram;

import java.util.Scanner;

public class Compositioneg {

	public static void main(String[] args) {
		students a = new students();
		a.getinfo();
	}
}
class guardian
{
	String studentno;
	String name;
	String phone;
	String city;
	String passedregno;
	public guardian(String s)
	{
		passedregno=s;
	}
	public void getguardians()
	{
		System.out.println("Enter guardian details");
		Scanner in=new Scanner(System.in);
		name=in.nextLine();
		phone=in.nextLine();
		city=in.nextLine();
		System.out.println("Enter student's regno to confirm: ");
		studentno=in.nextLine();
	}
	public void dispguardian()
	{
		System.out.println("Guardian details:");
		if(passedregno.equals(studentno))
		{
			System.out.println(studentno+" "+name+" "+phone+" "+city);
		}
		
		
	}
}
class students
{
	public String regno;
	public int n;
	
	public void getinfo()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter student regno: ");
		regno=in.nextLine();
		System.out.print("Enter no of guardians: ");
		n=in.nextInt();
		guardian arr[]=new guardian[n];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=new guardian(regno);
		arr[i].getguardians();
	}
	for(int i=0;i<arr.length;i++)
	{
		arr[i].dispguardian();
	}
	}

	
}