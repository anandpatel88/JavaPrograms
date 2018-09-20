package automationTest;

public class PrimeSelection {

	public static void main(String[] args) 
	{
	 int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
	 for(int k=0;k<a.length;k++)
	 {
		if( primeJazz(a[k])==true)
		{
			System.out.print(a[k]+" ");
		}
	 }
	}
	public static boolean primeJazz(int n)
	{
		boolean flag=false;
		if(n==1 || n==2)
		{
			flag=true;
		}
		else 
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
				flag=false;
				break;
				}
				else
				{
					flag=true;
				}
			}
		}
		return flag;
	}

}
