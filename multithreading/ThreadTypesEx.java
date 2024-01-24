package multithreading;

public class ThreadTypesEx extends Thread {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTypesEx t1 = new ThreadTypesEx();
		ThreadTypesEx t2 = new ThreadTypesEx();
		ThreadTypesEx t3 = new ThreadTypesEx();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();

	}
	@Override
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Functionality of Daemon Thread : "+getName());
			
		}
		else
		{
			System.out.println("Functionality of user  Thread : "+getName());
		}
	}

}
