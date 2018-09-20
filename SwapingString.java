package JavaPgm;

public class SwapingString 
{
	public static void main(String[] args)
	{
		String x="java";
		String y="selenium";
		System.out.println("before swapping the values are:");
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		System.out.println("after swapping the values are:");
		x=x+y;
		y=x.replaceAll("selenium", "");
		x=x.replaceAll("java", "");
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		}

};
