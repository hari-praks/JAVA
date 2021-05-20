import java.util.Scanner;

public class inputodd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		int sum=0;
		for(int i=0;i<=5;i++)
		{
			int n = input.nextInt();
			if(n%2!=0)
			{
				sum+=n;
			}
			if(n%2==0)
			{
				i--;
				continue;
			}
		}
		System.out.println(sum);

	}

}
