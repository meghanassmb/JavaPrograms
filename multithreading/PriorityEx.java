package multithreading;

public class PriorityEx extends Thread {

	public static void main(String[] args) {
		PriorityEx t1 = new PriorityEx();
		t1.setName("Thread1");
		t1.setPriority(MIN_PRIORITY);
		t1.start();
		
		PriorityEx t2 = new PriorityEx();
		t2.setName("Thread2");
		t2.setPriority(MAX_PRIORITY);
		t2.start();

	}
	
	@Override
	public void run()
	{
		System.out.println("Thread Name : " +getName()+ " Thread Priority : " +getPriority());
	}

}
