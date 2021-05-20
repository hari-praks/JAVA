package javaprogram;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Usernamecheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Username: ");
		String user = input.nextLine();
		System.out.println("Enter password : ");
		String pwd = input.nextLine();
		System.out.println("Enter password again to confirm: ");
		String cpwd = input.nextLine();
		
		if(pwd.length()<8 || user.length()<8)
		{
			System.out.println("Username or password shd be min of 8 characters");
		}
		else if(!cpwd.matches(pwd))
		{
			System.out.println("Passwords don't match to the user");
		}
		else if(user.contains(" ") ||  pwd.contains(" "))
		{
			System.out.println("Username or Pwd should not contain blank spaces");
		}	
		else if(pwd.length()>8 && user.length()>8)
		{
			char[] pwd1=new char[30];
			pwd1=pwd.toCharArray();
			int count=0;
			for(int i=0;i<pwd.length();i++)
			{
				if(user.contains(String.valueOf(pwd1[i])))
				{
					count++;
				}	
				
			}
			if(count>=3)
			{
				System.out.println("Password cannot contain username");
			}
			else
			{
				System.out.println("Strong");
			}
			
		}
		
	}

}
