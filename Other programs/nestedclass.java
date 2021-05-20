public class nestedclass {
	public static void main(String[] args) {
		//we need to create an obj for outer class
		outer outerobj = new outer();
		//creating obj for inner class
		outer.inner innerobj = outerobj.new inner();
		innerobj.display();
	}
}
class outer
{
	public String var1;
	private String var2;
	protected String var3;
	public static int count=1;
	
	public outer()
	{
		var1="test1";
		var2="test2";
		var3="test3";
	}
		/*//this is a method in outer class
		public void display_nestedvar()
		{
			System.out.println(nestedvar);
		}*/
		//so we cannot access a variable from inner class 
	
	//inner class can access all the members from outside class
	//outer class cannot access any of the members from inner class
	public class inner //this is also known as inner class(class which is not static and inside other class) 
	{
		//declare a datamember for inner class
		public String nestedvar;
		public inner()
		{
			nestedvar="somevalue";
		}
		public void display()
		{
			System.out.println(var1+var2+var3+count);
		}
		//can we have static data members and methods in our nested class which is non static? no
		//if the class is static v can have data members which are static bt u can't access the outer class members since outer class is non static
		
		//public static int count1=1; //this is not allowed coz the class is not static
		//no static method/data member can be created inside a non static class 
	}
}
