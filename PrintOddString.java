package automationTest;

public class PrintOddString {

	public static void main(String[] args)
	{
		String s="interview";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}

}
