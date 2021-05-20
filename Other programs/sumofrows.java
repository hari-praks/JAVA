import java.util.Scanner;

public class sumofrows {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = input.nextInt();
		int a[][]=new int[20][20];
		int sum[]=new int[20];
		System.out.println("Enter the elements of matrix: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=input.nextInt();
			}
		}	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				sum[i]=a[i][j]+sum[i];
				
			}
			System.out.println("Sum of "+i+" Row "+sum[i]);
		}

	}

}
