package automationTest;

public class PrimeByJazz 
{

	public static void main(String[] args)
	{
		int a[]={2,3,9,7,11,13,17,20,20};
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=2;j<a[i];j++)
		{
					if(a[i]%j==0)
					{
						flag=1;
						break;
					}
				}
			if(flag==0)
			{
			System.out.print(a[i]+" ");
		}
			flag=0;
		
		}

	}

}
