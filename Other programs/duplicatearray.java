
import java.util.Scanner;
public class duplicatearray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = input.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the sorted elements of an array");
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j]=a[i];
				j++;
			}
		}
		a[j++]=a[n-1];
		System.out.println("Array wihtout duplicates: ");
		for(int i=0;i<j;i++)
		{
			System.out.println(a[i]);
		}
	}

}
