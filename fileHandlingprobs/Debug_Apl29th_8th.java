package fileHandlingprobs;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Debug_Apl29th_8th {

	public static void main(String[] args) throws IOException {

			shape s[]=new shape[4];
			s[0]=new shape();
			s[0].setShapeDetails();
			s[0].display_details();
			s[0].display_shapename();
			s[0].write_datatoFile();
		}
	}
class shape
{
	int numsides;
	double area;
	String shapename;
	public void setShapeDetails()
	{
		System.out.println("Enter the number of sides");
		Scanner input = new Scanner(System.in);
		this.numsides=input.nextInt();
		System.out.println("Enter the area");
		this.area=input.nextDouble();
		System.out.println("Enter the shape");
		this.shapename=input.next();
	}
	public void display_details()
	{
		System.out.println(numsides+area);
	}
	public void display_shapename()
	{
		if(this.shapename.equals("circle"))
		{
			System.out.println("its a circle");
		}
	}
	public void write_datatoFile() throws IOException
	{
		File f = new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\\\fileHandlingprobs\\satish.txt");
		FileOutputStream fout = new FileOutputStream(f);
		fout.write(numsides);
		fout.close();
			
	}

}
