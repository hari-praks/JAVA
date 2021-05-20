package javaprograms;

import java.util.Scanner;

public class Sortregno {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String regno[] = new String[4];
		System.out.println("Enter regno: ");
		for(int i=0;i<regno.length;i++)
		{
			regno[i]=input.nextLine();
			if(regno[i].contains("BCE"))
			{
				continue;
			}
			else
			{
				System.out.println("Only CSE students are allowed");
			}
		}
		for(int i=0;i<regno.length;i++)
			{
				for(int j=i+1;j<regno.length;j++)
				{
					if(regno[i].compareTo(regno[j])>0)
					{
						String var=regno[i];
						regno[i]=regno[j];
						regno[j]=var;
					}
				}
			}
		for(int i=0;i<regno.length;i++)
		{
			System.out.println(regno[i]);
		}
	}
}
