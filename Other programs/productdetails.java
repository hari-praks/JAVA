import java.util.Scanner;
public class productdetails {

	public static void main(String[] args) {
		
		product[] pname=new product[4];
		for(int i=0;i<4;i++)
		{
			pname[i]=new product();
		}
		for(int i=0;i<4;i++)
		{
			pname[i].getdetails();		
		}
		for(int i=0;i<4;i++)
		{
			pname[i].compcat();
			pname[i].pricecat();
			pname[i].namecat();
		}
		
	}
}
	
class product{
	String Pid;
	String name;
	int sno;
	String Compname;
	int Price;
	String date;
	
	
	public void getdetails()
	{
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter the product_id");
		Pid=input.nextLine();
		System.out.println("Enter the product_name");
		name=input.nextLine();
		System.out.println("Enter serial number: ");
		sno=Integer.parseInt(input.nextLine());
		System.out.println("Enter the company_name: ");
		Compname=input.nextLine();
		System.out.println("Enter the price: ");
		Price=Integer.parseInt(input.nextLine());
		System.out.println("Enter the date");
		date=input.nextLine();
	}
	public void displaydetails()
	{
		System.out.println("Pid: "+Pid);
		System.out.println("name: "+name);
		System.out.println("sno: "+sno);
		System.out.println("Compname: "+Compname);
		System.out.println("Price of Product: "+Price);
		System.out.println("date: "+date);
	}
	
	public void pricecat()
	{
		if(Price>10000)
		{
			System.out.println("Product details based on price");
			System.out.println("name: "+name);
			System.out.println("Price of Product: "+Price);
		}
	}
	public void namecat()
	{
		if(name.equals("laptop"))
		{
			System.out.println("Product details based on name as laptop");
			System.out.println("Pid: "+Pid);
			System.out.println("name: "+name);
			
		}
	}
	public void compcat()
	{
		if(Compname.equals("Samsung"))
		{
			System.out.println("Samsung Product details");
			System.out.println("Pid: "+Pid);
			System.out.println("name: "+name);
			System.out.println("Compname: "+Compname);
			System.out.println("date: "+date);
		}
	}
	
}

