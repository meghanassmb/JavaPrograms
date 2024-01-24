package classesandobjects;

public class Person {
	
	int id;
	String name;
	MyDate dob;
	
	public Person()
	{
		id = 101;
		name = "Riya";
		dob = new MyDate();//dd,mm,yy
		
	}
	
	public Person(int id,String name,MyDate dob)
	{
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	
	public void display()
	{
		System.out.println("Id : "+id);
		System.out.println("Name :" +name);
		dob.display();
	}

	

	public void calculate() {
		// TODO Auto-generated method stub
		
	}

	

}
