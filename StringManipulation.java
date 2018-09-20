package automationTest;

public class StringManipulation {

	public static void main(String[] args)
	{
		String s="JuVERia";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			String s2=Character.toString(ch);
			if (s2.matches("[a-z?]"))
			{
	          s1=s1+s2.toUpperCase();
			}
			else
			{
				s1=s1+s2.toLowerCase();
			}
		}
		
		System.out.println(s1);

	}

}
