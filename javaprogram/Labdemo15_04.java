package javaprogram;

public class Labdemo15_04 {

	public static void main(String[] args) throws Exception {
		account obj =new account(2000);
		Thread thr1=new Thread(new Runnable(){
			
			@Override
			public void run()
			{
				obj.withdraw(30000);
			}
			
		});
	Thread thr2=new Thread(new Runnable(){
			
			@Override
			public void run()
			{
				obj.withdraw(40000);
			}
			
		});
	Thread thr3 = new Thread(new Runnable() {
		
		@Override
		public void run()
		{
			obj.deposit(40000);
		}
		
	});
	thr1.start();
	thr2.start();
	thr3.start();
	thr1.join();
	thr2.join();
	thr3.join();
	System.out.println(obj.bal);
	}
}
class account
{
	int bal;
	public account(int bal)
	{
		this.bal=bal;
	}
	public synchronized void withdraw(int w_amount)
	{
		
		System.out.println("This is withdrawal"+Thread.currentThread().getId());
		while(w_amount>this.bal)
		{
			try {
				System.out.println("Thread is waiting");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Withdrawal happening"+Thread.currentThread().getId());
		this.bal=this.bal-w_amount;
	}
	public synchronized void deposit(int d_amount)
	{
		System.out.println("This is deposit"+Thread.currentThread().getId());
		this.bal=this.bal+d_amount;
		System.out.println("I am notifying"+Thread.currentThread().getId());
		notifyAll();
	}
}












/*account sathish = new account(20000);
Thread thr1=new Thread(new Runnable() {
	@Override
	public void run()
	{
		for(int i=0;i<50;i++)
		{
			sathish.withdraw(100);
		}
	}
	
});
Thread thr2=new Thread(new Runnable() {
	@Override
	public void run()
	{
		for(int i=0;i<50;i++)
		{
			sathish.withdraw(100);
		}
	}
	
});
thr1.start();
thr2.start();
thr1.join();
thr2.join();
System.out.println(sathish.bal);
}

}
class account
{
public int bal;
public account(int deposit)
{
this.bal=deposit;
}
public void withdraw(int w_amount)
{
this.bal=this.bal-w_amount;
}
}*/