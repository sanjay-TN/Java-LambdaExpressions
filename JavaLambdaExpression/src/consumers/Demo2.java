package consumers;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
	String name;
	int salary;
	String gender;
	
	Employee(String name,int salary,String gender)
	{
		this.name=name;
		this.salary=salary;
		this.gender=gender;
	}
	
}
public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Employee>emplist = new ArrayList<Employee>();
		emplist.add(new Employee("sam",30000,"male"));
		emplist.add(new Employee("sami",50000,"female"));
		emplist.add(new Employee("sam1",20000,"male"));
		emplist.add(new Employee("samanta",60000,"female"));
		
//		functional interface to calculate bonus
		Function<Employee,Integer> fn=emp->(emp.salary*10)/100;
		
//		predicate interface for conditional check
		Predicate<Integer> p = b->b>=5000;
		
//		consumer for print value
		Consumer<Employee> c = emp->{
			System.out.println(emp.name);
			System.out.println(emp.salary);
			System.out.println(emp.gender);
		};
		
		for(Employee e:emplist)
		{
			int bonus = fn.apply(e); // calculate bonus [invoking function].
			if(p.test(bonus))    // invoking predicate.
			{
				c.accept(e);  // invoking consumer.
				System.out.println("Employee bonus:"+bonus);
			}
		}
		
	}

}
