package automationTest;

public class Pascal {

	public static void main(String[] args) 
	{
		int row=7;
		int k=row-1;
		for(int i=0;i<row;i++)
		{
			for(int space=k;space>0;space--)
			{
				System.out.print(" ");
			}
			k--;
			
			for(int j=0;j<=i;j++)
			{
				//Fact(i)/(fact(j)*fact(i-j)
				int value=factorial(i)/(factorial(j)*factorial(i-j));
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
	}
	public static int factorial(int i)
	{
		int fact=1;
		while(i>0)
		{
			fact=fact*i;
			i=i-1;
		}
		return fact;
	}

}
