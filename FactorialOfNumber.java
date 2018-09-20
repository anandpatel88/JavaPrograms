package JavaPgm;

public class FactorialOfNumber 
{

	public static void main(String[] args) 
	{
		System.out.println(fact(10));
		
	}
	public static int fact(int i)
	{
		int fact=1;
		if(i>1)
		{
		
	   fact=i*fact(i-1);
		}
		return fact;
	}

}
