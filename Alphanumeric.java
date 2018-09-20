package JavaPgm;

public class Alphanumeric {

	public static void main(String[] args) 
	{
		String s="t12es3t";
		String num="";
		String text="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.toString(ch).matches("[^a-z]"))
			{
				num=num+ch;
			}
			else
			{
				text=text+ch;
			}
		}
		System.out.println(num);
		System.out.println(text);
		
	}

}
