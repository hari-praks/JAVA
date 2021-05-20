package fileHandlingprobs;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Example2 {

	public static void main(String[] args) {
		try
		{
			FileOutputStream fout = new FileOutputStream("Myname.txt");
			OutputStreamWriter iwrite = new OutputStreamWriter(fout);
			iwrite.write(26986);
			iwrite.close();
			fout.close();
			System.out.println("file Write is successful");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
