package function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
	String name;
	int salary;
	
	Employee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
}
public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList <Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee("sam",50000));
		emplist.add(new Employee("sam1",60000));
		emplist.add(new Employee("sam2",30000));
		emplist.add(new Employee("sam3",40000));
		
		Function<Employee,Integer> fn = e->{
			int sal=e.salary;
			if(sal>=10000 && sal<=20000)
				return (sal*10/100);
			else if(sal>20000 && sal<=30000)
				return (sal*20/100);
			else if(sal>30000 && sal<=50000)
				return (sal*30/100);
			else
				return (sal*40/100);
			
		};
		
		Predicate<Integer> p=b->b>5000;
		
		for(Employee emp:emplist)
		{
			int bonus=fn.apply(emp);
			if(p.test(bonus))
			{
				System.out.println(emp.name+" "+emp.salary);
				System.out.println("bonus  is:"+bonus);
			}
			
		}
		
		
	}

}
