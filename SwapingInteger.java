package JavaPgm;

public class SwapingInteger {

	public static void main(String[] args)
	{
		int x=5;
		int y=7;
		System.out.println("before swapping the values are:");
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		System.out.println("after swapping the values are:");
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		}

}
