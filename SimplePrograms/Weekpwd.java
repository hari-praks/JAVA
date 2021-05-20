package javaprogram;
import java.util.Scanner;
public class Weekpwd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Username: ");
		String user = input.nextLine();
		System.out.println("Enter password : ");
		String pwd = input.nextLine();
		char[] pwd1=new char[30];
		pwd1=pwd.toCharArray();
		int count=0;
		for(int i=0;i<user.length();i++)
		{
			if(user.contains(String.valueOf(pwd1[i])))
			{
				count++;
			}	
		}
		if(count>=3)
		{
			System.out.println("week");
		}
		else
		{
			System.out.println("Strong");
		}
	}
}
