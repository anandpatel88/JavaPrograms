package automationTest;

public class Pattern5 {

	public static void main(String[] args)
	{
		int space=3;
		for(int i=1;i<=4;i++)
		{
			int n=1;
			for(int k=space;k>=1;k--)
			{
				System.out.print(" ");
			}
			space--;
			for(int j=1;j<=((2*i)-1);j++)
			{
			    if(i>=j)
			    {
				System.out.print(n++);
			    }
			    else if(i==(j-1))
			    {
			        n=n-2;
			       System.out.print(n--);
			     
			    }
			    else
			    {
			         System.out.print(n--);
			    }
			}
			System.out.println();
			
		}
	}

}
