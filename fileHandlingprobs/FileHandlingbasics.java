package fileHandlingprobs;
import java.io.File;
import java.io.IOException;
public class FileHandlingbasics {
	public static void main(String[] args) throws Throwable{
		File file1 = new File("myname.txt");
		System.out.println(file1.getName());
		System.out.println(file1.getParent());
		System.out.println(file1.separator);
		System.out.println(file1.getAbsolutePath());
		/* Another way to create a file where parent folder is given as first paramter
		 File file2 = new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\fileHandlingprobs","file2.txt");
		if(file2.createNewFile())
		{
			System.out.println("FILE IS CREATED");
		}*/
		File obj1=new File("C:\\\\Users\\\\hari\\\\eclipse-workspace\\\\javalabdemo\\\\src\\\\fileHandlingprobs");
		//Another way of creating a file where instance of file is given as object 
		File file3=new File(obj1,"file3.txt");
		if(file3.createNewFile())
		{
			System.out.println("FILE IS CREATED");
		}
		//It won't create another file of the same name
		System.out.println(file3.getParent());
		System.out.println(file3.isAbsolute());
		System.out.println(file3.canRead());
		System.out.println(file3.canWrite());
		System.out.println(file1.canExecute());
		if(file1.exists()==true)
		{
			System.out.println("FIle 1 is present");
		}
		System.out.println(file3.isDirectory());//Since file3 is a file not a directory
		//Deleting file
		System.out.println(file1.delete());
		File obj = new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\fileHandlingprobs");
		String names[]=obj.list();
		for(String s:names)
		{
			System.out.println(s);
		}

	}

}
