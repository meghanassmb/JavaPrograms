package classesandobjects2;
import java.util.*;
public class Employee {
	String empName,empCode;
	float basicSalary,allowance,grossSalary,tax,netSalary;
	
	public Employee()
	{
		empName = "Swathi";
		empCode = "EMP1056";
		basicSalary = 18775;
		allowance = 10754;
		grossSalary = 42976;
		tax = 3963;
		netSalary = 35986;		
	}
	
	public void accept()
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the employee name");
			empName = sc.next();
			System.out.println("enter the employee code");
			empCode = sc.next();
			System.out.println("enter the basicSalary");
			basicSalary = sc.nextFloat();
		}
			
	}
	
	public void allow()
	{
		allowance = (55/100)*basicSalary;
	}
	
	public void gross()
	{
		grossSalary = basicSalary + allowance;
	}
	 
	public void tax()
	{
		tax = (12/100)*grossSalary;
	}
	 
	public void net()
	{
		netSalary = grossSalary-tax;
	}
	 
	public void display()
	{
		System.out.println("empCode" + empCode);
		System.out.println("empName" + empName);
		System.out.println("basicSalary" + basicSalary);
		System.out.println("tax" + tax);
		System.out.println("netSalary" + netSalary);
		
	}
	
	
	public Employee(String empName,String empCode,float basicSalary,float allowance,float grossSalary,float tax,float netSalary)
	{
		this.empName = empName;
		this.empCode = empCode;
		this.basicSalary = basicSalary;
		this.allowance = allowance;
		this.grossSalary = grossSalary;
		this.tax = tax;
		this.netSalary = netSalary;
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee();
		employee1.accept();
		employee1.allow();
		employee1.gross();
		employee1.tax();
		employee1.net();
		employee1.display();
		
		
		Employee employee2 = new Employee("Zoya","EMP3673",28685,30846,19876,5437,57839);
		employee2.accept();
		employee2.allow();
		employee2.gross();
		employee2.tax();
		employee2.net();
		employee2.display();
	}

}
