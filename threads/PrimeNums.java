package threads;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class PrimeNums {
	public static void main(String[] args) throws InterruptedException{
		
		Thread thr1=new Thread(new Runnable()		
				{
			public void run()
			{
				File file1=new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\\\fileHandlingprobs\\file1.txt");
				try {
					FileOutputStream fout = new FileOutputStream(file1);
					DataOutputStream name = new DataOutputStream(fout);
					String  primeNumbers = "";
				       for (int i = 1; i <= 100; i++)         
				       { 		  	  
				          int counter=0; 	  
				          for(int j =i; j>=1; j--)
				          	{
				        	  if(i%j==0)
				        	  	{
				        		  	counter = counter + 1;
				        	  	}
				          	}
				          if (counter==2)
				          {
				        	  name.writeInt(i); 
				          }	
				        
				      
				        
				       }
				       System.out.println("write success to file1");
				       name.close();
				        fout.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				  
				
				}
			
				});
		Thread thr2=new Thread(new Runnable()		
		{
	public void run()
	{
		File file1=new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\\\fileHandlingprobs\\file2.txt");
		try {
			FileOutputStream fout = new FileOutputStream(file1);
			DataOutputStream name = new DataOutputStream(fout);
			String  primeNumbers = "";
		       for (int i = 101; i <= 200; i++)         
		       { 		  	  
		          int counter=0; 	  
		          for(int j =i; j>=1; j--)
		          	{
		        	  if(i%j==0)
		        	  	{
		        		  	counter = counter + 1;
		        	  	}
		          	}
		          if (counter==2)
		          {
		        	  name.writeInt(i);
		          }	
		         
		       
		       
		       }
		       System.out.println("write success to file2");
		       name.close();
		       fout.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		}
	
		});
		
		
		Thread thr3=new Thread(new Runnable()		
		{
	public void run()
	{
		
		try {
			File file1=new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\\\fileHandlingprobs\\file1.txt");
			FileInputStream name = new FileInputStream(file1);
			DataInputStream obj = new DataInputStream(name);
			System.out.println("prime numbers from 1 to 100");
			while(obj.available()>0)
			{
				int data=obj.readInt();
				System.out.print(data+" ");
			}
			obj.close();
			name.close();
		      
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		  
		
		}
	
		});
		Thread thr4=new Thread(new Runnable()		
		{
	public void run()
	{
		
		try {
			File file2=new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\\\fileHandlingprobs\\file2.txt");
			FileInputStream name = new FileInputStream(file2);
			DataInputStream obj = new DataInputStream(name);
			System.out.println();
			System.out.println("prime numbers from 101 to 200");
			while(obj.available()>0)
			{
				int data=obj.readInt();
				System.out.print(data+" ");
			}
			obj.close();
			name.close();
		      
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		  
		
		}
	
		});
   thr1.start();
   thr1.join();
   thr1.sleep(2000);
   thr2.start();
   thr2.join();
   thr2.sleep(2000);
   thr3.start();
   thr3.join();
   thr4.start();
   thr4.join();
	}
}