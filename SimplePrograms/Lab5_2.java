package javaprogram;
import java.util.Scanner;
public class Lab5_2 {

	public static void main(String[] args) {
		student obj[]=new student[5];
		for(int i=0;i<5;i++)
		{
			obj[i]=new student();
			obj[i].getinfo();
			obj[i].dispinfo();
		}
		sortobj(obj);
	}
	public static void sortobj(student a[])
	{
		 for (int i = 0; i < 5; i++) 
	     {
	         for (int j = i+1; j <5; j++) { 
	             if (((a[i].name).compareTo(a[j].name))>0) 
	             {
	                 String temp = a[i].name;
	                 a[i].name = a[j].name;
	                 a[j].name = temp;
	             }
	         }
	     }
	     System.out.print("Strings in Sorted Order:");
	     for (int i=0; i <a.length; i++) 
	     {
	         System.out.println(a[i].name+" "+a[i].regno+" "+a[i].phone);
	     }
	}
		
		
}

class student
{
	public String name;
	public String regno;
	public String phone;
	
	public void getinfo()
	{
		Scanner input= new Scanner(System.in);
		System.out.println("enter name : ");
		name=input.nextLine();
		System.out.println("enter regno : ");
		regno=input.nextLine();
		System.out.println("enter phone : ");
		phone=input.nextLine();
	}
	public void dispinfo()
	{
		System.out.println(name);
		System.out.println(regno);
		System.out.println(phone);
	}
	
	

}




