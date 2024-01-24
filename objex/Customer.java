package objex;

public class Customer  implements Cloneable{
	
	int id;
	String name;
	String phone;
	
	public Customer(int id,String name,String phone)
	{
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer[id =" + id +" ,name= "+name +" , phone= "+phone+ "]";
	}


	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer(101 , "Divya" , "9817346528");
		Customer customer2 = new Customer(102 , "Veena" , "9928460179");
		System.out.println(customer1);
		System.out.println(customer2);
		Customer customer3 = (Customer) customer2.clone();
		System.out.println(customer3);
		
		

	}

}
