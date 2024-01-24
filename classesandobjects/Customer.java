package classesandobjects;

public class Customer extends Person
{
	String prodName;
	int quantity;
	float price,billAmount,finalBill,discount;

public Customer()
{
	super();
	prodName = "Book";
	quantity = 50;
	price = 100;
	billAmount = 587;
	
}
 public Customer(int id,String name,MyDate dob,String prodName,int quantity,float price,float billAmount)
 {
	 super (id ,name ,dob);
     this.prodName = prodName;
     this.quantity = quantity;
     this.price = price;
     this.billAmount = billAmount;
 }
 
 public void calculate()
 {
	 super.calculate();
	 if (billAmount >= 20000)
	 {
		 discount = 0.15f/billAmount;
	 }
	 else if(billAmount >=15000)
	 {
		 discount = 0.1f/billAmount;
	 }
	 else if(billAmount >= 10000)
	 {
		 discount = 0.07f/billAmount;
	 }
	 else
	 {
		 discount = 0;
	 }
	 
	 finalBill = billAmount - discount;
 }
 
 @Override
 public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("discount : "+discount);
		System.out.println("finalBill : "+finalBill);
	}

}
	 
	






