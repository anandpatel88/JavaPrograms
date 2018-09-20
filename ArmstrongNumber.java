package JavaPgm;
public class ArmstrongNumber
{
/// 1634=(1)^4+(6)^4+(3)^4+(4)^4
	public static void main(String[] args)
	{
		int n=1634;
		int length=0;
		int mul=1;
		int rem=0;
		int sum=0;
		while(n>0)
		{
			n=n/10;
			length=length+1;
		}
		System.out.println("Length "+length);
		for(int i=1;i<=length;i++)
		{
			rem=n%10;
			for(int j=1;j<=length;j++)
			{
				mul=mul*rem;
			}
			sum=sum+mul;
			n=n/10;
		}
		if(sum==n)
		{
			System.out.println("number is Armstrong");
		}
		else
		{
			System.out.println("number is not Armstrong");
		}

	}

}
