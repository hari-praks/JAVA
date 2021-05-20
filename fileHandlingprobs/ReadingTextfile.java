package fileHandlingprobs;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
public class ReadingTextfile {
	public static void main(String[] args) throws Throwable {
		//We use Reader class for  effective reading(coz UTF-16,UTF-8 no of bytes varies)
		try {
			File name = new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\fileHandlingprobs\\file3.txt");
			FileReader obj = new FileReader(name);
			//int data=obj.read();
			//System.out.println((char)data);
			char c[]=new char[5];//char array to read
			obj.read(c);
			for(char d:c)
			{
				System.out.println(d);
			}
			obj.close();
			File fileobj = new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\fileHandlingprobs\\file4.txt");
			FileWriter write_obj = new FileWriter(fileobj,true);//true is coz we need append something
			char d[]= {'s','a','t'};
			write_obj.write(d,1,2);//writing 2 chars only at will be present
			//appending word
			char e[]= {'r','c','b'};
			write_obj.write(e);
			write_obj.close();
			System.out.println("writing success");	
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}}
}
