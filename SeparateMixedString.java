package automationTest;

public class SeparateMixedString {

	public static void main(String[] args)
	{
		String s="t12e3s4t567";
		String text="";
		String num="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
				if(Character.toString(c).matches("[0-9?]"))
				{
					num=num+c;
				}
				else
				{
					text=text+c;
				}
		}
		System.out.println("Text is "+text);
		System.out.println("num is "+num);

	}

}
