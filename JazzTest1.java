package automationTest;

public class JazzTest1 {

	public static void main(String[] args)
	{
		String s="JUVERIA";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
			String sub=s.substring(i, j+1);
			if(sub!=s)
			System.out.println(sub);
			}
		}

	}

}
