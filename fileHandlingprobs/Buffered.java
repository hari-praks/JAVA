package fileHandlingprobs;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
public class Buffered {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bufin = new BufferedInputStream(System.in);
		int data = bufin.read();
		byte b[] = new byte[4];
		bufin.read(b);
		for(byte c:b)
		{
			System.out.println((char)c);
		}
		/*int data = bufin.read();
		bufin.mark(data);
		byte b[] = new byte[4];
		bufin.read(b);
		bufin.reset();
		data=bufin.read();
		System.out.println((char)data);*/
		bufin.close();
		BufferedOutputStream bufout = new BufferedOutputStream(System.out);
		bufout.write(data);
		bufout.close();
	}
}
