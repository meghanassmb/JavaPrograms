package designpatterns;

import java.util.Scanner;

interface MobileShop{
	void modelNo();
	void price();
}

class IPhone implements MobileShop{

	@Override
	public void modelNo() {
		System.out.println("IPhone6");
		
	}

	@Override
	public void price() {
		System.out.println("Rs.70000");
		
	}
	
}
class Samsung implements MobileShop{

	@Override
	public void modelNo() {
		System.out.println("Samsung Galaxy");
		
	}

	@Override
	public void price() {
		System.out.println("Rs.42000");
		
	}
	
}
class Blackberry implements MobileShop{

	@Override
	public void modelNo() {
		System.out.println("Blackberry z10");
		
	}

	@Override
	public void price() {
		System.out.println("Rs.57000");
		
	}
	
}

class ShopKeeper{
	private IPhone iPhone;
	private Samsung samsung;
	private Blackberry blackberry;
	
	public ShopKeeper() {
		iPhone = new IPhone();
		samsung = new Samsung();
		blackberry = new Blackberry();
		
	}
     public void saleIPhone() {
    	 iPhone.modelNo();
    	 iPhone.price();
     }
     public void saleSamsung() {
    	 samsung.modelNo();
    	 samsung.price();
     }
     public void saleBlackberry() {
    	 blackberry.modelNo();
    	 blackberry.price();
     }
     
}

public class FacadePattern {

	public static void main(String[] args) {
		int choice;
		
		ShopKeeper shopKeeper = new ShopKeeper();
		Scanner sc = new Scanner(System.in);
        do {
        	System.out.println("Enter your choice.Press\n 1.IPhone \n 2.Samsung \n 3.Blackberry \n 4.Exit");
        	choice = sc.nextInt();
             switch(choice) {
             case 1: shopKeeper.saleIPhone();
             break;
             case 2: shopKeeper.saleSamsung();
             break;
             case 3: shopKeeper.saleBlackberry();
             break;
             default : System.out.println("Invalid choice");
             }
             
        }
        while(choice!=4);
	}

}
