package JavaPgm;

public class SecondLargestNumberFunction {

	public static void main(String[] args) 
	{
		int[] b={20,34,12,36,98,100};
		int x=SecondLargest(b);
		System.out.println(x);

	}
	
	public static int SecondLargest(int[] a)
	{
		int max=a[0];
		int secMax=a[1];
		for(int i=2;i<a.length;i++)
		{
			
			if(a[i]>=max)
			{
				secMax=max;
				max=a[i];
			}
			else if(max >= a[i] && a[i]>=secMax)
			{
				secMax=a[i];
			}
		}
		if(max==secMax)
		{
			return -1;
		}
		else
		{
		return secMax;
		}
	}

}
