package ExceptionHandelling;

public class TryWithFinally {

	public static void main(String[] args)
	{
		try
		{
			int i=10/0;
		}
		
		catch(Exception e)
		{
			System.out.println("in catch");
		}
		finally
		{
			System.out.println("terminating pgm");
		}
		
		try
		{
			System.out.println("in try2");
			String s="anand";
			char ch=s.charAt(7);
		}
		finally
		{
			System.out.println("terminating again");
		}

	}

}
