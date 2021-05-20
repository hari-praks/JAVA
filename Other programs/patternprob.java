5import java.util.Scanner;

public class patternprob {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = input.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<i+1;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
