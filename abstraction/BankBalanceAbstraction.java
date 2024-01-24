package abstraction;

public class BankBalanceAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankBalance aA = new A();
		double balanceA = aA.getBalance();

		BankBalance bB = new B();
		double balanceB = bB.getBalance();

		BankBalance cC = new C();
		double balanceC = cC.getBalance();

		System.out.println("Balance : " + balanceA);
		System.out.println("Balance : " + balanceB);
		System.out.println("Balance : " + balanceC);

	}

}
