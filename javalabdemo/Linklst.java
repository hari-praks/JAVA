package javalabdemo;
import java.util.LinkedList;
import java.util.ListIterator;
public class Linklst {
	public static void main(String[] args) {
		car c[] = new car[4];
		c[0]=new car("c1001","Punto","Fiat");
		c[1]=new car("c1002","A6","Audi");
		c[2]=new car("c1003","Fiesta","Ford");
		c[3]=new car("c1004","I10","Hyndai");
	
		
		LinkedList<car> L=new LinkedList<car>();
		for(int i=0;i<4;i++)
		{
			L.add(c[i]);
		}
		ListIterator<car> lst=L.listIterator(L.size());
		while(lst.hasPrevious())
		{
			car t = (car) lst.previous();
			if(t.cbrand.equals("Ford"))
			{
				System.out.println("Cars that suit your category are: ");
				System.out.println(t.cid+" "+t.cname+" "+t.cbrand);
			}
		}
	}

}
class car
{
	String cid,cname,cbrand;

	public car(String cid, String cname, String cbrand) {
		this.cid = cid;
		this.cname = cname;
		this.cbrand = cbrand;
	}
	
}