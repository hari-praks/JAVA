package threads;
public class RunnableThread {
	public static void main(String[] args) {
		Thread thr = new Thread( new Runnable() {
					@Override
					public void run() {
							System.out.println("I am from the thread 1 ");
					}	
		});	
		thr.start();//only THread class can start
		Thread thr2 = new Thread( new Runnable() {
			@Override
			public void run() {
					System.out.println("I am from the thread 2 ");
				
			}
		});
		thr2.start();
		System.out.println("main Thread");
		
}
}


