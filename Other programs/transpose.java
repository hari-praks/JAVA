import java.util.Scanner;

public class transpose {

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
		System.out.println("Normal matrix: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("Transpose of matrix is: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[j][i]+"  ");
			}
			System.out.println();
		}
	}

}
