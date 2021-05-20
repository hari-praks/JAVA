package fileHandlingprobs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			stu s = new stu("hari","19BIT0283");
			File obj = new File("newfile.txt");
			ObjectOutputStream objout = new ObjectOutputStream(new FileOutputStream(obj));
			objout.writeObject(s);
			objout.close();
			
			ObjectInputStream objin = new ObjectInputStream(new FileInputStream(obj));
			stu in = null;
			in=(stu)objin.readObject();
			System.out.println(in.name+" "+in.regno);
			objin.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
class stu implements Serializable
{
	String name;
	String regno;
	public stu(String n,String s)
	{
		super();
		this.name=n;
		this.regno=s;
	}
}
