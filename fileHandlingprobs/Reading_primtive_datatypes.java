package fileHandlingprobs;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Reading_primtive_datatypes {
	public static void main(String[] args) throws IOException {
		File name = new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\fileHandlingprobs\\file6.txt");
		FileOutputStream obj = new FileOutputStream(name);
		DataOutputStream dout = new DataOutputStream(obj);
		dout.writeBoolean(false);
		dout.writeInt(5);
		dout.writeUTF("Best");
		dout.close();
		FileInputStream obj1 = new FileInputStream(name);
		DataInputStream din = new DataInputStream(obj1);
		boolean d =din.readBoolean();
		int data = din.readInt();
		String name1 = din.readUTF();
		System.out.println(d+" "+data+" "+name1);
		din.close();	
	}
}
