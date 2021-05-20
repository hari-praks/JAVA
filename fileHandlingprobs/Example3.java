package fileHandlingprobs;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example3 {

	public static void main(String[] args) {
		try
		{
			File obj =new File("Myname.txt");
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(obj));
			bout.write(105);
			bout.close();
			FileInputStream fin = new FileInputStream(obj);
			BufferedInputStream bin =new BufferedInputStream(fin);
			int data = bin.read();
			System.out.println((char) data);
			fin.close();
			bin.close();
			
		}catch(Exception e)
		{
			
			System.out.println(e.getMessage());
		}

	}

}
