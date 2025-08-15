package LambdaExpressions;

@FunctionalInterface  // optional
interface Cab
{
	public void bookCab();
}


public class Test {

	public static void main(String[] args) {
		Cab cab = ()->System.out.println("ola cab is booked...");
		cab.bookCab();

	}

}
