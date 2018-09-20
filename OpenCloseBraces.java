package automationTest;

public class OpenCloseBraces {

	public static void main(String[] args)
	{
		String s="{{{}([{{}}})]}";
		int countOpenBr1=0;
		int countCloseBr1=0;
		int countOpenBr2=0;
		int countCloseBr2=0;
		int countOpenBr3=0;
		int countCloseBr3=0;
		for(int i=0;i<s.length();i++)
		{
			String s1=Character.toString(s.charAt(i));
			if(s1.equals("("))
			{
				countOpenBr1++;
			}
			else if(s1.equals("{"))
			{
				countOpenBr2++;
			}
			else if(s1.equals("["))
			{
				countOpenBr3++;
			}
			else if(s1.equals(")"))
			{
				countCloseBr1++;
			}
			else if(s1.equals("}"))
			{
				countCloseBr2++;
			}
			else if(s1.equals("]"))
			{
				countCloseBr3++;
			}
		}
	
		if(	countOpenBr1==countCloseBr1 && countOpenBr2==countCloseBr2 && countOpenBr3==countCloseBr3)
		{
			System.out.println("good");
		}
		else
		{
			System.out.println("bad");
		}

	}

}
