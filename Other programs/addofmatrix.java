import java.util.Scanner;
public class addofmatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the rows of matrix 1 : ");
		
		int n = input.nextInt();
		System.out.println("Enter the rows of matrix 2 : ");
		int m = input.nextInt();
		int a[][]=new int[20][20];
		int b[][]=new int[20][20];
		int c[][]=new int[20][20];
		System.out.println("Enter the elements of matrix 1: ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=input.nextInt();
			}
		}	
		System.out.println("Enter the elements of matrix 2: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=input.nextInt();
			}
		}
		if(m==n)
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
