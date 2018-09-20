package automationTest;

public class Test {

	public static void main(String[] args)
	{
		int n=1;
		int m=1;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if((i+j)<=8)
				{
					System.out.print(n);
				}
				else
				{
					System.out.print(m);
				}
				
			}
			m++;
			System.out.println();
		}

	}

}
