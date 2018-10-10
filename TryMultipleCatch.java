package ExceptionHandelling;

public class TryMultipleCatch {

	public static void main(String[] args) 
	{
		try
		{
			int b=10/0;
			String s="anand";
			char ch=s.charAt(7);
			int[] i={10,20};
			int k=i[6];
		}
		catch(ArithmeticException a)
		{
			int b=10/10;
			System.out.println("b is"+b);
		}
		catch(StringIndexOutOfBoundsException str)
		{
			System.out.println("exception in string");		}
		catch(ArrayIndexOutOfBoundsException arr)
		{
			System.out.println("exception in array");		
	}

}
}
