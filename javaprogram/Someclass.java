package javaprogram;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Someclass {

	public static void main(String[] args) {
		try
		{
			File obj = new File("Myname.txt");
			FileOutputStream fout = new FileOutputStream(obj);
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(2);
			dout.writeUTF("hari");
			dout.writeBoolean(true);
			fout.close();
			dout.close();
			FileInputStream fin = new FileInputStream(obj);
			DataInputStream din = new DataInputStream(fin);
			int data = din.readInt();
			String name=din.readUTF();
			boolean result=din.readBoolean();
			System.out.println(data);
			System.out.println(name);
			System.out.println(result);
			fin.close();
			din.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}

