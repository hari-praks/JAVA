package javaprogram;
import java.util.Scanner;
public class countwords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String sentence = input.nextLine();
		System.out.println("Enter the word to be searched: ");
		String word = input.nextLine();
		int count=0;
		String[] arr=sentence.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].contains(word))
			{
				count++;
			}
			
		}
		System.out.println("No of times  "+word+"  occurs is: "+count);
		}
}
