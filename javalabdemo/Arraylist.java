package javalabdemo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<>();
		s.add("hari");
		s.add("praks");
		s.add("ram");
		s.add(2, "Chris");
		s.remove(1);
		//s.clear(); clears everything
		//s.isEmpty() checks whether its empty
		//System.out.println(s.contains("hari"));
		//System.out.println(s.indexOf("ram"));
		//lastIndexOf searches from reverse
 		System.out.println(s.size());
		/*for(String k:s)
		{
			System.out.println(k);
		}*/
		for(int i=0;i<s.size();i++)//not length
		{
			String k = s.get(i);
			System.out.println(k);
		}
		ArrayList<String> k = (ArrayList<String>) s.clone();
		for(int j=k.lastIndexOf("ram");j>=0;j--)
		{
			String e = k.get(j);
			System.out.println(e);
		}
		
		//creating Iterator
		java.util.Iterator<String> itr=s.iterator();
		System.out.println("Using Iterator");
		while(itr.hasNext())
		{
			String j =itr.next();
			System.out.println(j);
		}
			//creating list Iterator-It can traversal in reverse
		ListIterator<String> litr=s.listIterator(s.size());
		System.out.println("Using List Iterator");
		while(litr.hasPrevious())
		{

			System.out.println(litr.previous());

		
		}
	}
}
		/*employeee e1 = new employeee("hari","123e");
		employeee e2 = new employeee("prakash","122e");
		LinkedList<employeee> EmpLL = new LinkedList<employeee>();
		EmpLL.add(e1);
		EmpLL.add(e2);
		ListIterator<employeee> itr =EmpLL.listIterator(EmpLL.size());
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous().name);
		}
		

	}

}
class employeee
{
	String name,empid;

	public employeee(String name, String empid) {
		this.name = name;
		this.empid = empid;
	}
	public void display()
	{
		System.out.println(name+empid);
	}
	
}*/