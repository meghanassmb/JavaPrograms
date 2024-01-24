package multithreading;

class PrintTable {
	public void print(int n) {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(n * i);
			}
		}
	}
}

class Thread1 extends Thread {
	PrintTable printTable;

	public Thread1(PrintTable printTable) {
		super();
		this.printTable = printTable;
	}

	@Override
	public void run() {
		printTable.print(2);
	}
}

class Thread2 extends Thread {
	PrintTable printTable;

	public Thread2(PrintTable printTable) {
		super();
		this.printTable = printTable;
	}

	@Override
	public void run() {
		printTable.print(3);
	}
}

public class SynchronizedBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTable printTable = new PrintTable();
		Thread1 thread1 = new Thread1(printTable);
		thread1.setName("shannu");
		thread1.start();

		Thread2 thread2 = new Thread2(printTable);
		thread2.setName("shannu");
		thread2.start();

	}

}




