package javaprograms;
		import java.util.Scanner;
		public class numdigits {
			public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				int even=0,prime=0,odd=0;
				  System.out.println("Enter the number:");
				  int a = in.nextInt();
				  while(a>0)
				  {
					  int b=a%10;
					  if(a%2==0)
					  {  even++;}
					  else{ odd++;}
					  int c=0,d=0;
					  d=b/2;
					  for(int i=2;i<d;i++)
					  {
						  if(a%i==0)
						  { c++;}
						  if(c>0)
						  {	  prime++; }
					  }
					  a=a/10;
				  }
				  System.out.println("Number of even numbers:"+even);
				  System.out.println("Number of odd numbers:"+odd);
				  System.out.println("Number of prime numbers:"+prime);		  
			}			
}





