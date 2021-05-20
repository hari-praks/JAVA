import java.util.Scanner;
public class checkidentity {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = input.nextInt();
		int a[][]=new int[20][20];
		int sum[]=new int[20];
		int var=0;
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
				if(a[i][i]==1)
				{
					var++;
				}
			}
			
		}
		if(var!=0)
		{
			System.out.println("Its an identity matrix");
		}
		else {
			System.out.println("Its not an identity matrix");
		}
	}

}
