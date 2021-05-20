import java.util.Scanner;
public class bubblesort {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the n value: ");
			int n = input.nextInt();
			int temp=0;
			int a[]=new int[20];
			System.out.println("Enter the elements of an array");
			for(int i=0;i<n;i++)
			{
				a[i]=input.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n-i-1;j++)
				{
					if(a[j]>a[j+1])
					{
						temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
				
			}
			System.out.println("Sorted array is: ");
			for(int i=0;i<n;i++)
			{
				System.out.println(a[i]);
			}
		
			
			
	}
}
