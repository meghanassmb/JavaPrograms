package abstraction;

abstract class BankBalance {

	public abstract double getBalance();

}

class A extends BankBalance {

	@Override
	public double getBalance() {
		return 100;
	}
}

class B extends BankBalance {

	@Override
	public double getBalance() {

		return 150;
	}
}

class C extends BankBalance {

	@Override
	public double getBalance() {

		return 200;
	}
}
