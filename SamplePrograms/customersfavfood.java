package javaprograms;
import java.util.Scanner;
public class customersfavfood {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		String customer[]=new String[7];
		String favfood[]=new String[7];
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter your name: ");
			customer[i]=in.nextLine();
			System.out.println("Enter your favfood: ");
			favfood[i]=in.nextLine();
		}
		for(int i=0;i<favfood.length;i++)
		{
			for(int j=i+1;j<customer.length;j++)
			{
				if(favfood[i].equals(favfood[j]))
				{
					System.out.println(customer[i]+" is a foodie twin of "+customer[j]);
				}
			}
		}
		 
	}
}

