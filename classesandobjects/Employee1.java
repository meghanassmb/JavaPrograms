package classesandobjects;

public class Employee1 extends Person
{
    float workingDays,perDay,salary;	
    
    public Employee1()
    {
    	super();   //used to call parent class constructor,1st line of constructor
    	workingDays = 20;
    	perDay = 2200;
    }
    
    public Employee1(int id,String name,MyDate dob,float workingDays,float perDay)
    {
    	super(id,name,dob);
    	this.workingDays = workingDays;
    	this.perDay = perDay;
    }
    
    public void calculate()
    {
    	salary = workingDays * perDay;
    }
    
    @Override //overriding display() from parent class
    public void display()
    {
    	super.display(); // calling display() from parent class
    	System.out.println("Salary :" +salary);
    }

}
