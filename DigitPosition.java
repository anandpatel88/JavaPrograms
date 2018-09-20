package automationTest;

public class DigitPosition {

	public static void main(String[] args)
	{
		int num=123456789;
		int x=9;
		int res=1;
		int rem=0;
		
		while(num!=0)
		{
			
			rem=rem%10;
			if (rem==x)
			{
				res=res;
				break;
			}
			else
			{
				res=res*10;
			}
			num/=10;
			
		}
		System.out.println(res);
	}

}
