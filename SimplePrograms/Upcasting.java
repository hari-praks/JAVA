package javaprogram;

import java.util.Scanner;

public class Upcasting {

	public static void main(String[] args) {
		shape s=new sphere();
		s.vol();
		shape c = new cone();
		c.vol();
		shape cu=new cube();
		cu.vol();
		shape cy=new cylinder();
		cy.vol();
	}

}
abstract class shape
{
	double r;
	public abstract void vol();
}
class sphere extends shape
{
	@Override
	public void vol()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter radius to compute volume of sphere: ");
		r=in.nextInt();
		double volume = 1.34*3.14*r*r*r;
		System.out.println("Volume of Sphere is "+volume);
	}
}
class cube extends shape
{
	@Override
	public void vol()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter edge to compute volume of cube: ");
		double edge=in.nextDouble();
		double volume=edge*edge*edge;
		System.out.println("Volume of cube is"+ volume);
	}
}
class cylinder extends shape
{
	@Override
	public void vol()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter radius and height to compute volume of Cylinder: ");
		r=in.nextDouble();
		double h=in.nextDouble();
		double volume = 3.14*r*r*h;
		System.out.println("Volume of cylinder is "+volume);
	}
}
class cone extends shape
{
	@Override
	public void vol()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter radius and height to compute volume of cone: ");
		r=in.nextDouble();
		double h=in.nextDouble();
		double volume = 0.34*3.14*r*r*h;
		System.out.println("Volume of cone is "+volume);
	}
}