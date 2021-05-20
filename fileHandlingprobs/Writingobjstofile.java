package fileHandlingprobs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Writingobjstofile {
	public static void main(String[] args) {
		try {
			student s[]=new student[3];
			
			s[0]=new student("Prakash","19BIT","praks@gmail.com","Bangalore");
			s[1]=new student("Ram","20BCE","ram@gmail.com","Vellore");
			s[2]=new student("Hari","19BCE","ari@gmail.com","Chennai");
	
			//Serializable-writing obj to file
			File obj = new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\fileHandlingprobs\\student.txt");
			ObjectOutputStream objout= new ObjectOutputStream(new FileOutputStream(obj));
			for(int i=0;i<3;i++)
			{
				objout.writeObject(s[i]);
			}
			objout.close();
			//DeSerialize is getting the object print
			ObjectInputStream objin = new ObjectInputStream(new FileInputStream(obj));
			student data[]=new student[3];
			for(int i=0;i<3;i++)
			{
				data[i] = (student) objin.readObject();
				if(data[i].address.equals("Vellore") && data[i].regno.contains("BCE"))
				{
					System.out.println(data[i].name+" "+data[i].regno+" "+data[i].email+" "+data[i].address);
				}
			}
			objin.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
class student implements Serializable //mandatory 
{
	String name;
	String regno;
	String email,address;
	public student(String name, String regno, String email, String address) {
		this.name = name;
		this.regno = regno;
		this.email = email;
		this.address = address;
	}	
}