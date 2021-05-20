import java.util.Scanner;

public class luckynum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int lucky=5;
		int n=0;
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter the "+i+" number: ");
			n = input.nextInt();
			if(n==lucky)
			{
				break;
			}
		}
		if(n!=lucky)
		{
			System.out.println("You are Unlucky");
		}
		
			

	}

}
