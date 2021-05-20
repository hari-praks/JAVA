package threads;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class WriteObjsUsingThrds {

	public static void main(String[] args) {
		
		try
		{
			faculty f[]=new faculty[5];
			f[0]=new faculty("Satish","f1001","M","Ast.Prof");
			f[1]=new faculty("Hari","f1002","M","Prof");
			f[2]=new faculty("Akshaya","f1003","F","Prof");
			f[3]=new faculty("Sanskriti","f1004","F","Ast.Prof");
			f[4]=new faculty("Rajesh","f1005","M","Prof");
			File obj = new File("C:\\Users\\hari\\eclipse-workspace\\javalabdemo\\src\\threads\\faculty.txt");
			Thread T1=new Thread(new Runnable()
					{
				public void run()
				{
					
					ObjectOutputStream objout = null;
					try {
						objout = new ObjectOutputStream(new FileOutputStream(obj));
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					for(int i=0;i<5;i++)
					{
						try {
							objout.writeObject(f[i]);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					try {
						System.out.println("write success");
						objout.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
					});
			Thread T2=new Thread(new Runnable()
			{
		public void run()
		{
			
			ObjectInputStream objin = null;
			try {
				objin = new ObjectInputStream(new FileInputStream(obj));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			faculty data[]=new faculty[5];
			for(int i=0;i<5;i++)
			{
				try {
					data[i] = (faculty) objin.readObject();
				} catch (ClassNotFoundException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(data[i].designation.equals("Ast.prof"))
				{
					System.out.println(data[i].fname+" "+data[i].fid+" "+data[i].designation+" "+data[i].gender);
				}
			}
			System.out.println("Read Success");
			try {
				objin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		});
			T1.start();
			T2.start();
			T1.join();
			T2.join();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
class faculty implements Serializable
{
	String fname,fid,gender,designation;

	public faculty(String fname,String fid, String gender, String designation) {
		this.fname=fname;
		this.fid = fid;
		this.gender = gender;
		this.designation = designation;
	}
	
}