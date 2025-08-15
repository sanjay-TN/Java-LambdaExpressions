package LambdaExpressions;

interface Cab3
{
	public String bookCab(String source,String destiny);
	
}
//class Bookcab implements Cab3
//{
//	public String bookCab(String source,String destiny)
//	{
//		System.out.println(source +" to "+destiny);
//		return("price : 2000");
//	}
//}

public class Test3 {

	public static void main(String[] args) {
		Cab3 c = (source,destiny)->{System.out.println(source +" to "+destiny);
		return ("price : 2000");
		};// since we have return type we use curly braces.
		System.out.println(c.bookCab("a","s"));
		
	}

}
