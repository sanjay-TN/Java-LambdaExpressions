package predicate;

import java.util.function.Predicate;

// Joining predicates and,or,negate.

//p1 --checks number is even
//p2 --checks number is greater than 50


public class Demo3 {

	public static void main(String[] args) {
		int a[] = {5,15,20,25,30,35,40,45,50,55,60,65};
		Predicate<Integer> p1 = i->(i%2==0);
		Predicate<Integer> p2 = i->(i>50);
		/*System.out.println("even numbers are");
		for(Integer ar:a)
		{
			if(p1.test(ar))
			{
				System.out.println(ar);
			}
		}
		System.out.println("numbers greater than 50 are");
		Predicate<Integer> p2 = i->(i>50);
		for(Integer arr:a)
		{
			if(p2.test(arr))
			{
				System.out.println(arr);
			}
		}
		*/
// for and operator &&
		System.out.println("for and operator");
		for(Integer i1:a)
		{
//			if(p1.test(i) && p2.test(i)) 
			if(p1.and(p2).test(i1))
			{
				System.out.println(i1);
			}
		}
// for or operator ||
		System.out.println("for or operator");
		for(Integer i:a)
		{
//			if(p1.test(i) || p2.test(i)) 
			if(p1.or(p2).test(i))
			{
				System.out.println(i);
			}
		}
// for negate operator
		System.out.println("for negate operator");
		for(Integer i2:a)
		{ 
			if(p1.negate().test(i2))
//			if(!p1.test(i2))
			{
				System.out.println(i2);
			}
		}
	}

}
