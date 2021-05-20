package javaprograms;
import java.util.Scanner;
public class chitcal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		int total=amount*10;
		amount=(total*18/100)/12;
		System.out.println("18% of amount is: "+amount);
		int yearly[]=new int[20];
		int commission[]=new int[20];
		int sum[]=new int[20];
		for(int i=9;i>0;i--)
		{
			yearly[i]=amount*i;
			commission[i]=yearly[i]/12;
			System.out.println("monthly in "+ i +"  month  "+commission[i]);
			sum[i]=total-yearly[i];
			System.out.println("Total amount to be given on "+ i + " month " + sum[i]);
		}
	}
}

