package fileHandlingprobs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class OperationAnyNumOFTimes {

	public static void main(String[] args) throws Exception {
		try {
			Scanner in =new Scanner(System.in);
			boolean value=true;
			do {
				int a;
				System.out.println("Menu: \n 1.Write UTF-16 \n 2.Read UTF-16 \n 3.Quit");
				a=in.nextInt();
				switch(a)
				{
				case 1:
					OutputStreamWriter objwrite=new OutputStreamWriter(new FileOutputStream("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\fileHandlingprobs\\sample.txt"));
					System.out.println("Enter data:  ");
					int data=in.nextInt();
					objwrite.write(data);
					System.out.println("write success");
					objwrite.close();
					break;
					
				case 2:
					FileInputStream fin=new FileInputStream("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\fileHandlingprobs\\sample.txt");
					InputStreamReader objin = new InputStreamReader(fin,"UTF-16");
					int data1=objin.read();
					System.out.println("Read success");
					System.out.println((char)data1);
					fin.close();
					objin.close();
					break;
				case 3:
					value = false;
					break;
					
			}
				
			}
			
			while(value==true);
		}
		catch(FileNotFoundException f)
		{
			System.out.println(f.getMessage());
		}
		catch(IOException i)
		{
			System.out.println(i.getMessage());
		}	
		
}
}
