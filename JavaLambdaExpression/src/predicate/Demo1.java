package predicate;

import java.util.function.Predicate;
// predicate --> takes one parameter returns boolean value
// use only if you have conditional checks in your program

public class Demo1 {

	public static void main(String[] args) {
//		example 1
		Predicate<Integer> p =(i)->(i>10);
		System.out.println(p.test(20)); // since predicates uses a single argument test.
		System.out.println(p.test(1)); // false
		
//		example 2: check the length of a given string is greater than 4 or not.
		Predicate<String> p1 = i->(i.length()>4);
		System.out.println(p1.test("sames")); // true
		System.out.println(p1.test("sam")); // false
		
//		example 3: print array elements whose size is > 4 from array
		String names[] = {"abcd","efds","deew","dddd"};
		for(String name:names)
		{
			if(p1.test(name))
			{
				System.out.println(name);
			}
		}
		
	}

}
