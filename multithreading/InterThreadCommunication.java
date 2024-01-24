package multithreading;

class Customer {
	private int balance = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw Rs." + amount);
		if (balance < amount) {
			System.out.println("not enough balance in account.waiting for deposit....");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance = balance - amount;
		System.out.println("Rs." + amount + "withdraw. Balance : " + balance);

	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit Rs." + amount);

		balance = balance + amount;
		System.out.println("deposited Rs. " + amount + "balance :" + balance);
		notify();
	}

}

public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		new Thread("Paras") {
			public void run() {
				customer.withdraw(15000);
			};
		}.start();
		new Thread("Manas") {
			public void run() {
				customer.deposit(15000);
			};
		}.start();
	}

}
