package javaprogram;
import java.util.Scanner;

public class countvowels {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the word : ");
		String word = input.nextLine();
		int count=0;
		String vowel[]= {"a","e","i","o","u"};
		for(int i=0;i<vowel.length;i++)
		{
			if(word.contains(vowel[i]))
			{
				count++;
			}
		}
		
		
		System.out.println("No of vowels: "+count);
	}

}
