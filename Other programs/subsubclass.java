public class subsubclass {
	public static void main(String[] args) {
		class3 s = new class3(10,20,30);
		s.display();
	}
}
class superclass
{
	private int a;
	public superclass(int inp1){
		a=inp1;
		System.out.println(a);	
	}
	public void display()
	{
		System.out.println("super class function "+a);
	}
}
class subclass extends superclass
{
	private int b;
	public subclass(int inp1,int inp2) {
		super(inp1);
		b=inp2;
		System.out.println(b);
	}
	public void display()
	{
		super.display();
		System.out.println("subclass function "+b);
	}
}
class class3 extends subclass
{
	private int c;
	public class3(int inp1,int inp2,int inp3)
	{
		super(inp1,inp2);
		c=inp3;
		System.out.println(c);
	}
	public void display()
	{
		super.display();
		System.out.println("subsub class function "+c);
	}
}