package fileHandlingprobs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Bufferedreader {

	public static void main(String[] args) throws IOException {
		BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in,"UTF-16"));
		int data = bufread.read();
		System.out.println((char) data);
	
	}

}
