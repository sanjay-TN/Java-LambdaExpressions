package LambdaExpressions;

interface Cab1
{
	public void bookcab(String source, String destination);
}


public class Test2 {
	public static void main(String args[])
	{
		Cab1 c = ( source, destination)->System.out.println("cab booked from" +" "+source +" "+"to"+" "+ destination);
		c.bookcab("banglore","hyderabad");
	}

}
