package function;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {
		Function<Integer,Integer> f = n-> n*n;
		System.out.println(f.apply(5));
		
//		 find string length
		Function<String,Integer> f1 = s->(s.length());
		System.out.println("length is: ");
		System.out.print(f1.apply("dssa"));

	}

}
