package automationTest;

public class Anagram {

	public static void main(String[] args) 
	{
		String s="god";
		String s1="dog";
		int count=0;

		
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if (s.charAt(i)==s1.charAt(j))
				{
					count++;
				}
			}
		}
		if(count==s.length())
		{
			System.out.println("String are anagram");
		}
		else
		{
			System.out.println("not anagram");
		}

	}

}
