package javalabdemo;

import java.util.Scanner;

public class hackerank1 {

	public static void main(String[] args) {
		
		        Scanner in = new Scanner(System.in);
		        
		        int t=in.nextInt();
		        for(int i=0;i<t;i++){
		            int a = in.nextInt();
		            int b = in.nextInt();
		            int n = in.nextInt();
		           
		           for(int j=0;j<n;j++)
		           {
		        	   int total;
		        		 total=a+(int) Math.pow(2,j)*b;
				         System.out.print(total+" ");
		           }
		               
		        }
		        in.close();
		        
		    }

	}

