package JavaPgm;

public class StringManipulation 
{
	public static void main(String[] args)
	{
		String s="the rain has started here";
		int length=s.length();
		System.out.println("length of String is "+length);
		char ch=s.charAt(5);
		System.out.println("Char at 5th is "+ch);
		int ind=s.indexOf('s');
		System.out.println("index of s "+ind);
		int ind1=s.indexOf('s', 5);
		System.out.println("index of s "+ind1);
	
	}

}
