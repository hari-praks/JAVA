package javaprogram;
import java.util.Scanner;
public class Reversesentence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sentence :  ");
		String sentence[]= input.nextLine().split(" ");
		wordsreverse obj[]=new wordsreverse[sentence.length];
		for(int i=0;i<sentence.length;i++)
		{
			obj[i]= new wordsreverse(sentence[i]);
		}
		
	}
}
class wordsreverse{
	public String s1;
	wordsreverse(String s)
	{
		this.s1=s;
		char word[]=new char[30];
		word=s1.toCharArray();
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(word[i]);
			
		}
		System.out.print(" ");
	}
}
