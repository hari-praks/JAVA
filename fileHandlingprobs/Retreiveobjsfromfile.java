package fileHandlingprobs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Retreiveobjsfromfile {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		try {
			Course c[]=new Course[4];
			c[0]=new Course("C001","Python","SCOPE","D2");
			c[1]=new Course("C002","Java Programming","SCOPE","C1");
			c[2]=new Course("C001","Node js","SITE","C1");
			c[3]=new Course("C001","DJANGO","SCOPE","A1");
			File obj = new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\fileHandlingprobs\\course.txt");
			ObjectOutputStream objout= new ObjectOutputStream(new FileOutputStream(obj));
			for(int i=0;i<4;i++)
			{
				objout.writeObject(c[i]);
			}
			objout.close();
			
			ObjectInputStream objin = new ObjectInputStream(new FileInputStream(obj));
			Course data[]=new Course[4];
			for(int i=0;i<4;i++)
			{
				data[i]=(Course) objin.readObject();
				if(data[i].cname.equals("Java Programming") && data[i].Course_slot.equals("C1") && data[i].CourseOfferedBy.equals("SCOPE"))
				{
					System.out.println("Courses Available are: ");
					System.out.println("CourseID: "+data[i].Cid);
					System.out.println("CourseName: "+data[i].cname);
					System.out.println("CourseOfferedBy: "+data[i].CourseOfferedBy);
					System.out.println("CourseSlot: "+data[i].Course_slot);
				}
				else if(!data[i].cname.equals("Java Programming") && !data[i].Course_slot.equals("C1") && !data[i].CourseOfferedBy.equals("SCOPE"))
				{
					System.out.println("No Such Courses Match the Criteria");
				}
			
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

	}
}
class Course implements Serializable
{
	String Cid,cname,CourseOfferedBy,Course_slot;

	public Course(String cid, String cname, String courseOfferedBy, String course_slot) {
		Cid = cid;
		this.cname = cname;
		CourseOfferedBy = courseOfferedBy;
		Course_slot = course_slot;
	}
	
}