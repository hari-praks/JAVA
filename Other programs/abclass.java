public class abclass {
	public static void main(String[] args) {
		//shape a=new shape(); //we can't create the obj for abstract class
		square s =new square();
		s.computearea();
		s.display();
	}
}
abstract class shape
{
	protected double area;
	public void display()
	{
		System.out.println(area);
	}
	public abstract void computearea();//wenever a method is abstract the clas must also be abstract
}
class square extends shape
{
	int side;
	public square()
	{
		side=10;
	}
	@Override
	public void computearea() {
		// TODO Auto-generated method stub
		area=side*side;
	}
}
