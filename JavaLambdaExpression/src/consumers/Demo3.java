package consumers;

import java.util.function.Consumer;

public class Demo3 {

	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s+"  "+"is White");
		Consumer<String> c1=s->System.out.println(s+"  "+"is Black");
		Consumer<String> c2=s->System.out.println(s+"  "+"is Brown");
	
//		c.accept("car");
//		c1.accept("car");
//		c2.accept("car");
		
		// consumer chaining.
		c.andThen(c1).andThen(c2).accept("car");
//		or
		Consumer<String> c3 = c.andThen(c1).andThen(c2);
		c3.accept("car");
		
	}

}
