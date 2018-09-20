package automationTest;

public class CountDigitOfNum 
{
	public static void main(String[] args)
	{
	int i=42352636;
	System.out.println("length using 1st method: "+countOne(i));
	System.out.println("length using 2nd method: "+countTwo(i));
	}
	
	public static int countOne(int m)
	{
		int count=0;
		while(m>0)
		{
			m=m/10;
			count++;
		}
		return count;
	}
	
	public static int countTwo(int n)
	{
		Integer j=n;
		String s=j.toString();
		return s.length();
	}
	
	
}
