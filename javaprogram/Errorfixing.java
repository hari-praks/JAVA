package javaprogram;
public class Errorfixing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		professor satish = new professor("satish","vellore","111","a06");
				satish.display_professor();
				}
}
abstract class person {
	protected String name;
	protected String address;
	public abstract void display_vitadd();
}
class faculty extends person 
{
	public String empid;
	public void display_faculty() {
	System.out.println(name+address+empid);
	}
	@Override
	public void display_vitadd() {
		// TODO Auto-generated method stub	
	}
}
class professor extends faculty 
{
	professor(String n,String a,String e,String c)
	{
		name=n;
		address=a;
		empid=e;
		cabinno=c;
	}
	public String cabinno;
	public void display_professor() {
	System.out.println(name+" "+address+" "+empid+" "+cabinno);
}
}

