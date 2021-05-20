package javaprograms;

import java.util.Scanner;

public class multiply {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		  System.out.println("Enter the number:");
		  int a = in.nextInt();
	        for(int i=1;i<11;i++)
	        {
	            int n;
	            n=a*i;
	            System.out.println(a+" x "+i+" = "+n);
	        }
	    }

	}


