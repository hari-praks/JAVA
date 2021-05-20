
import java.util.Scanner;
public class Reversearray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = input.nextInt();
		int a[]=new int[20];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		System.out.println("Reversed array");
		for(int j=n-1;j>=0;j--)
		{
			System.out.println(a[j]);
		}
	}

}
