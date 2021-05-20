package javaprogram;

import java.util.Scanner;

public class DynamicPolymorphism {
	
	public static void main(String[] args) {
		
	}
}
abstract class shape
{
	protected double area;
	public void display()
	{
		System.out.println(area);
	}
	public abstract void computearea();
}

class circle extends shape
{
	double r;
	public circle()
	{
		r=4;
	}
	@Override
	public void computearea()
	{
		double area=3.14*r*r;
		
	}
}
class square extends shape
{
	double r;
	public square()
	{
		r=5;
	}
	@Override
	public void computearea()
	{
		double area=r*r;
	}
}
class sphere extends shape
{
	@Override
	public void computearea()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter radius to compute volume of sphere: ");
		double r=in.nextInt();
		double SA = 4*3.14*r*r;
		System.out.println("Surface area of Sphere is "+SA);
	}
}
class cube extends shape
{
	@Override
	public void computearea()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter side of the cube: ");
		double a=in.nextDouble();
		double SA=6*a*a;
		System.out.println("Surface area of cube is"+ SA);
	}
}