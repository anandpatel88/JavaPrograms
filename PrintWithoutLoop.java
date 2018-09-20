package automationTest;

public class PrintWithoutLoop 
{
	static int i=1;

	public static void main(String[] args) 
	{
		print();
	}
	
	public static void print()
	{
		if(i<=10)
		{
		System.out.println(i++);
		print();
		}
	}
	
}
