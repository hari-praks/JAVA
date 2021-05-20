package threads;
public class CourseRegistration {
	public static void main(String[] args) throws Exception {
		CourseReg obj=new CourseReg("Java Programming","Satish",0);
		Runnable  r = ()->{
				try {
					obj.RegisterSeat();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			};
		 Thread thr1=new Thread(r);
	 Runnable r1 =()->
	 {
				try {
					obj.RegisterSeat();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
	};
	Thread thr2=new Thread(r1);
	Runnable r2=()->{

			obj.Allot_seats(30);;
		};
		Thread thr3=new Thread(r2);
    Runnable r3=()->
		{
			System.out.println("FINAL NOS: "+obj.NOS);
		};
		Thread thr4=new Thread(r3);
	thr1.start();
	thr2.start();
	thr3.start();
	thr4.start();
	thr1.join();
	thr2.join();
	thr3.join();
	thr4.join();
	}
}
class CourseReg
{
	String cname,fname;
	int NOS;

	public CourseReg(String cname, String fname, int nOS) {
		this.cname = cname;
		this.fname = fname;
		NOS = nOS;
	}
	public synchronized void RegisterSeat() throws Exception
	{
		while(NOS==0)
		{
			
			System.out.println("Thread is waiting");
			wait();
		}
		
			NOS--;
	}
	public synchronized void Allot_seats(int seats)
	{
		NOS=seats+NOS;
		System.out.println("NOS AT ALLOT:"+NOS);
		notifyAll();
	}

}