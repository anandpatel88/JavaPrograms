package automationTest;

public class ReverseWordsInString {

	public static void main(String[] args)
	{
		String s="i do not like java";
		System.out.println("original string is: "+s);
		String s1="";
		String sArr[]=s.split(" ");
		for(int i=0;i<sArr.length;i++)
		{
			s1=s1+reverseOfWord(sArr[i]);
			s1=s1+" ";
		}
		
		System.out.println("string with reversing words is: "+s1);

	}
	public static String reverseOfWord(String word)
	{
		String rev="";
		if(word.length()==1)
		{
			rev=word;
		}
		else
		{
			for(int i=word.length()-1;i>=0;i--)
			{
				rev=rev+word.charAt(i);
			}
		}
		return rev;
		
	}

}
