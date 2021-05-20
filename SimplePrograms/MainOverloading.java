package javaprogram;
import java.util.Scanner;
public class MainOverloading {
	
	public static void main(int[] a)
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=2;j<n;j++)
			{
				if(a[i]%j==0)
				{
					count++;
		
				}
			}
			if(count==0)
			{
				System.out.println(a[i]+" is a prime number");
			}
			else
			{
				System.out.println(a[i]+" is a composite number");
			}
			
		}
			
		}

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n value");
		int n = in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		main(arr);
	}
}
