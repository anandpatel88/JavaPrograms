package automationTest;

public class FactwithRecurs {

	public static void main(String[] args) 
	{
		long fact=factorial(10);
		System.out.println(fact);

	}
	public static int factorial(int i)
	{
		if(i==0)
		{
			return 1;
		}
		else
		{
			return i*factorial(i-1);
		}
		 
	}

}
