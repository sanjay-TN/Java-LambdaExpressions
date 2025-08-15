package function;

import java.util.function.Function;

/*
Function chaining [combining]
		*)andthen()
		*)compose()

*/
public class Demo3 {

	public static void main(String[] args) {
		
		Function<Integer,Integer> fn = n->n*2;
		Function<Integer,Integer> f = n->n*n*n;
		System.out.println(fn.andThen(f).apply(2)); // 64
		System.out.println(fn.compose(f).apply(2)); // 16
		
	}

}
