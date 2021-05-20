public class statnestedclass {
public static void main(String[] args) {
		
		faculty.eligible_leave.display_leavedetails();
		//to access i_display we need obj for outer class too since its nested
		faculty f1=new faculty("hari","19bit");
		f1.l.i_display();
	}
}
class faculty
{
	private String name;
	private String empid;
	public faculty(String name,String empid)
	{
		this.name=name;
		this.empid=empid;
	}
	//obj for i_display()
	eligible_leave l = new eligible_leave();
	
	//this class is static nested class
	public static class eligible_leave
	{
		public static int el=12;
		public static int ml=20;
		public static int cl=10;
		public int i=10;
		
		public static void display_leavedetails() {
			System.out.println("the num of el is "+el);
			System.out.println("the num of ml is "+ml);
			System.out.println("the num of cl is "+cl);
	  }
		/*public void test_method()
		{
			System.out.println(name+empid); //u cannot access non static(outerclass) members in ur static nested class
		}*/
		public void i_display() {
			System.out.println("The non static variable inside nestedstatic class is  "+i);
		}//inorder to execute this we need an obj
	}
}
