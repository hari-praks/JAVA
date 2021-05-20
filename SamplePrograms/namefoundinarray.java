package javaprograms;
import java.util.Scanner;
public class namefoundinarray {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		String name[]=new String[5];
		System.out.println("enter names: ");
		for(int i=0;i<5;i++)
		{
			name[i]=in.nextLine();
		}
		System.out.println("Enter name to be searched: ");
		String search=in.nextLine();
		int count=0;
		for(int i=0;i<5;i++)
		{
			if(name[i].contains(search))
			{
				count++;	
			}	
		}
		if(count==1)
		{
			System.out.println("Name found");
		}
		else
		{
			System.out.println("Name not found");
		}
	}
}
