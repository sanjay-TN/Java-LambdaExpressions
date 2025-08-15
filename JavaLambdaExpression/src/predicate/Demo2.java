package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
	String e_name;
	int salary;
	int experiance;
	
	
	Employee(String name,int sal,int exp)
	{
		e_name=name;
		salary=sal;
		experiance=exp;
	}
}

public class Demo2 {

	public static void main(String[] args) {
//		ex 1:
		Employee emp = new Employee("Sam",50000,5);
		
//		emp obj--> return name if sal >30k and exp >3
		
		Predicate<Employee> pr = e->(e.salary>30000 && e.experiance>3);
		System.out.println(pr.test(emp));
		
//		ex 2:
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("john",50000,5));
		al.add(new Employee("john1",40000,3));
		al.add(new Employee("john2",30000,4));
		al.add(new Employee("john3",60000,2));
		
		for(Employee e:al)
		{
			if(pr.test(e))
			{
				System.out.println(e.e_name+" "+e.salary);
			}
		}
	}

}
