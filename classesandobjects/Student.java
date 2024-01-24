package classesandobjects;

public class Student extends Person{
	int rollNumber;
	String name;
	float phy,chem,maths;
	float percentage,total;
	
	public Student()
	{
		super();
		rollNumber= 27;
	    name= "Meghana";
	    phy=78;
	    chem=86;
	    maths=92;
	}
	public Student(int id,String name,MyDate dob,float phy,float chem,float maths)
	{
		super(id,name,dob);
		this.phy=phy;
		this.chem=chem;
		this.maths=maths;
		
	}
	public void calcu()
	{
		super.calculate();
		total=phy+chem+maths;
		percentage=total/3;
	}
	
	
	@Override
	 public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("total : " +total);
		System.out.println("percentage : " +percentage);
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.calcu();
		student1.display();
		
		Student student2 = new Student(267,"Preethi",67,87,83);
		student2.calcu();
		student2.display();*/

	}


