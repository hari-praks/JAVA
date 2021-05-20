import java.util.Scanner;
public class linearsearch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = input.nextInt();
		int a[]=new int[20];
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
			
		}	
		System.out.println("Enter the num to be searched: ");
		int b = input.nextInt();
		int var=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==b)
			{
				System.out.println("The number is found and the number is "+ a[i]);
				var++;
				break;
			}
		}
		if(var==0)
		{
			System.out.println("The element is not present");
		}
	}

}
