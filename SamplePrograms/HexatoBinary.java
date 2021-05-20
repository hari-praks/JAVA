package javaprograms;

import java.util.Scanner;

public class HexatoBinary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		StringBuffer a = new StringBuffer();
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			String somename=Integer.toHexString(arr[i]);
			a.append(somename);
		}
		String hex=a.toString();
		System.out.println("Hexadecimal is : "+hex);
		StringBuffer b = new StringBuffer();
		for(int i=0;i<arr.length;i++)
		{
			char aa=arr[i];
			b.append(String.format("%8s",Integer.toBinaryString(aa)).replaceAll(" ", "0"));
		}
		System.out.println("Binart is :  "+b);
	}
}
