package javaprogram;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class HowtoreadUTF_16 {

	public static void main(String[] args) {
		try
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\javaprogram\\Myname.txt");
			InputStreamReader iread=new InputStreamReader(fin,"UTF-16");
			int data=iread.read();
			System.out.println((char) data);
			fin.close();
			iread.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
}
