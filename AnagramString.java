package JavaPgm;

public class AnagramString {

	public static void main(String[] args) 
	{
		// all char of 1st string is same is all char of second string
		
		String s1="abcde";
		String s2="ebcda";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			String s=ch+"";
		if(s2.contains(s))
				{
			     count = count+1;
				}
		}
		if(s1.length()==count)
		{
			System.out.println("Strings are Anagram");
		
		}
		else
		{
			System.out.println("Strings are not Anagram");
		}
		
	}

}
