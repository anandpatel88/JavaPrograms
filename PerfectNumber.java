package JavaPgm;

public class PerfectNumber {
	
	///Perfect number is sum of its divisor

	public static void main(String[] args)
	{
		
		PerfectNumber p=new PerfectNumber();
		p.isPerfect(496);

	}
	public void isPerfect(long l)
	{
		long sum=0;
		for (int i=1;i<l;i++)
		{
			if(l%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==l)
		{
			System.out.println("Given number is pefect");
		}
		else
		{
			
				System.out.println("Given number is not pefect");
			
		}
	}

}
