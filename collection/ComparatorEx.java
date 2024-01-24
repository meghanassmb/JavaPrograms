package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
	int id,salary;
	String name;
	public Employee(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	
}
class SalaryComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1,Employee e2) {
		if(e1.salary==e2.salary)
			return 0;
		else if(e1.salary<e2.salary)
			return 1;
		else
			return -1;
	}
}
class NameComparator implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}

public class ComparatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101,20000,"Raj"));
		list.add(new Employee(102,25000,"Kalyan"));
		list.add(new Employee(103,32000,"Kavya"));
		list.add(new Employee(104,42000,"Moni"));
		list.add(new Employee(105,39000,"Lilly"));
		
		System.out.println("sorting on the basis of salary");
		Collections.sort(list,new SalaryComparator());
		for(Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println("sorting on the basis of name");
		Collections.sort(list,new NameComparator());
		for(Employee employee : list) {
			System.out.println(employee);
		}

	}

}
