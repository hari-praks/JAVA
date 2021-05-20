package fileHandlingprobs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
public class Read_write_file {
	public static void main(String[] args) throws Throwable {
		try {
			File name = new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\fileHandlingprobs\\file3.txt");
			FileInputStream obj = new FileInputStream(name);
			int data;
			//data=obj.read();//reads only h from hello
			//System.out.println((char)data);
			/*while((data=obj.read())!=-1)
			{
				System.out.println((char)data);//reads hello one by one
			}*/
			//anyone of the method should be used to read a file 	
			byte b[]=new byte[5];
			obj.read(b,2,3);
			System.out.println(obj.available());//prints 2 which is available bytes in the file
			for(byte k:b)
			{
				System.out.println((char)k);
			}
			obj.close();//This is important and should be inside try block
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage()); 
		}
		
		//FileOutputStream
		File name = new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\fileHandlingprobs\\file3.txt");
		FileOutputStream obj = new FileOutputStream(name);
		obj.write(104);
		obj.close();
		FileInputStream obj1 = new FileInputStream(name);
		int data = obj1.read();
		System.out.println(data);
		obj1.close();
	}
}
