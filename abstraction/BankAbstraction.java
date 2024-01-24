package abstraction;

import java.util.Scanner;

abstract class Bank{
	public abstract float getRateOfInterest();
		
	
}

class BOI extends Bank{
	
	@Override
	public float getRateOfInterest() {
		return 8.7f;
	}
}
class TJSB extends Bank{
	
	@Override
	public float getRateOfInterest() {
	
		return 6.6f;
		}
}

	
public class BankAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float principleAmount,years,rateBOI,rateTJSB;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the principleAmount : ");
			principleAmount = sc.nextFloat();
			System.out.println("Enter number of years : ");
			years = sc.nextFloat();
		}
		Bank bBOI = new BOI();
		rateBOI = bBOI.getRateOfInterest();
		

		Bank bTJSB = new TJSB();
		rateTJSB = bTJSB.getRateOfInterest();
		
		float interestBOI = (principleAmount * years * rateBOI)/100;
		
		float interestTJSB = (principleAmount * years * rateTJSB)/100;
		
		System.out.println("Simple Interest for BOI : " +interestBOI);
		System.out.println("Simple Interest for TJSB : " +interestTJSB);
		
		
		

	}

}
