package classesandobjects;

public class SalesPerson extends Employee1 {
	float sales,commission,totalSalary;
	
	public SalesPerson()
	{
		super();
		sales = 80;
	}
	
	public SalesPerson(int id,String name,MyDate dob,float workingDays,float perDay,float sales)
			{
		     super (id, name, dob,workingDays, perDay);
		     this.sales =sales;
			}
    
	public void calculate()
	{
		super.calculate();
		if(sales >=90)
		{
			commission = salary*0.2f;
		}
		else if(sales>= 75)
		{
			commission = salary * 0.1f;
		}
		else if(sales >= 60)
		{
			commission = salary*0.05f;
		}
		else 
		{
			commission = 0;
		}
		 totalSalary = salary+commission;
	}	
	
	@Override	 
    public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Commission : "+commission);
		System.out.println("Total Salary : "+totalSalary);
	}

}