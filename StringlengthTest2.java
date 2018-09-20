package automationTest;

public class StringlengthTest2 {

	public static void main(String[] args)
	{
		String s="happy";
		String s1="";
		int i=0;
		while(true)
		{
			if(s.equals(s1))
			{
				break;
			}
			else
			{
				s1=s1+s.charAt(i);
				i++;
				
			}
		}
System.out.println(i);
	}

}
