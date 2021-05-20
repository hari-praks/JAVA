package fileHandlingprobs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
public class Store_View_project {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		try
		{
			 project p[]=new project[3];
			 p[0]=new project("Websitehosting","p1001","Vellore","50k");
			 p[1]=new project("Appdev","p1002","Mumbai","70k");
			 p[2]=new project("ML","p1003","Chennai","1.5Laks");
			boolean value=true;
			Scanner in =new Scanner(System.in);
			do {
				int a;
				System.out.println("Menu: \n 1.Submit Project Data \n 2.View Project data \n 3.Quit");
				a=in.nextInt();
				switch(a)
				{
				case 1:
					File obj = new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\fileHandlingprobs\\project.txt");
					ObjectOutputStream objout= new ObjectOutputStream(new FileOutputStream(obj));
					for(int i=0;i<3;i++)
					{
						objout.writeObject(p[i]);
					}
					System.out.println("Write Success");
					objout.close();
					break;
				case 2:
					File obj1 = new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\fileHandlingprobs\\project.txt");
					ObjectInputStream objin = new ObjectInputStream(new FileInputStream(obj1));
					project data[]=new project[3];
					for(int i=0;i<3;i++)
					{
						data[i] = (project) objin.readObject();
						System.out.println(data[i].pid+" "+data[i].pname+" "+data[i].location+" "+data[i].budget);
					
					}
					objin.close();
					break;
				case 3:
					value=false;
					break;
				}
				
				
			}
			while(value=true);
		}
		catch(FileNotFoundException f)
		{
			System.out.println(f.getMessage());
		}
		catch(IOException i)
		{
			System.out.println(i.getMessage());
		}

	}

}
class project implements Serializable
{
	String pname,pid,location,budget;

	public project(String pname, String pid, String location, String budget) {
		this.pname = pname;
		this.pid = pid;
		this.location = location;
		this.budget = budget;
	}
	
}