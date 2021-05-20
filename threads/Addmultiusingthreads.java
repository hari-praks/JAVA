package threads;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Addmultiusingthreads {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thr2=new Thread(new Runnable()
		{
	public void run()
	{
		File file2=new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\threads\\file3.txt");
		FileInputStream name = null;
		try {
			name = new FileInputStream(file2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataInputStream obj = new DataInputStream(name);
		try {
			int data1=obj.read();
			int multisum = 0;
			while(obj.available()>1)
			{
				int data=obj.read();
				multisum=data1*data;
				
			}
			
			System.out.println("Multiply is: "+multisum);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		});
		Thread thr_write=new Thread(new Runnable()
				{
			public void run()
			{
				Scanner in =new Scanner(System.in);
				int num1,num2;
				System.out.println("Enter numbers");
				num1=in.nextInt();
				num2=in.nextInt();
				File file3=new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\threads\\file3.txt");
					FileOutputStream fout = null;
					try {
						fout = new FileOutputStream(file3);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					DataOutputStream name = new DataOutputStream(fout);
					try {
						name.writeInt(num1);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						name.writeInt(num2);
						System.out.println("write success");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
			}
				});
		Thread thr1=new Thread(new Runnable()
		{
	public void run()
	{
		File file2=new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\threads\\file3.txt");
		FileInputStream name = null;
		try {
			name = new FileInputStream(file2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataInputStream obj = new DataInputStream(name);
		try {
			int sum=0;
			while(obj.available()>0)
			{
				int data=obj.readInt();
				
				sum=data+sum;
				
			}
			System.out.println("Sum is: "+sum);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		});
		
		thr_write.start();
		thr_write.join();
		thr1.start();
		thr1.join();
		thr2.start();
		thr2.join();
		


	}

}
