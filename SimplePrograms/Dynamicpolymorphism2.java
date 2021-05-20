package javaprogram;
public class Dynamicpolymorphism2 {
	public static void main(String[] args) {
		squares sobj = new squares();
		sobj.getlocation(4, 4);
		sobj.computearea();
		circles cobj = new circles();
		cobj.getlocation(3, 3);
		cobj.computearea();
		cubes obj = new cubes();
		obj.getlocation(2, 3, 0);
		obj.computearea();
		spheres spobj= new spheres();
		spobj.getlocation(5, 5, 5);
		spobj.computearea();
	}

}
abstract class shapes
{
	int area;
	public void displayarea()
	{
		System.out.println("Area : " +area);
	}
	public abstract void computearea();

}

abstract class Twodimensional extends shapes
{
	int x,y,z;
	public void getlocation(int x1,int y1)
	{
		x=x1;
		y=y1;
		z=(int) Math.sqrt((x*x)+(y*y));
	}
}
abstract class Threedimensional extends shapes
{
	int a,b,c,d;
	public void getlocation(int a1,int b1,int c1)
	{
		a=a1;
		b=b1;
		c=c1;
		d=(int) Math.sqrt((a*a)+(b*b)+(c*c));
	}
}
class squares extends Twodimensional 
{
	@Override
	public void computearea() {
		area=4*z;
		super.displayarea();
	}
}
class circles extends Twodimensional 
{
	@Override
	public void computearea() {
		area=z*z;
		super.displayarea();
	}
}
class cubes extends Threedimensional
{
	@Override
	public void computearea() {
		area=6*d*d;
		super.displayarea();
	}

}
class spheres extends Threedimensional
{
	@Override
	public void computearea() {
		area=(int) (4*3.14*d);
		super.displayarea();
	}
		
}