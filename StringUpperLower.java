package automationTest;

public class StringUpperLower
{

	public static void main(String[] args)
	{
		String s="abcXYZ";
		String result="";
	    for (int i=0;i<s.length();i++)
	    {
		if (Character.toString(s.charAt(i)).matches("[a-z?]"))
		{
			result=result.concat(Character.toString(s.charAt(0)).toUpperCase());
		}
		else
		{
			result=result.concat(Character.toString(s.charAt(0)).toLowerCase());
		}

		
	}
	    System.out.println(result);
	}
}
	


