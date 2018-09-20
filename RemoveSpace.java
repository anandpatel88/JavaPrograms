package automationTest;

public class RemoveSpace {

	public static void main(String[] args) 
	{
		String s= "My Name Is Khan";
		String s1="";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==' ')
			{
				s1=s1;
			}
			else
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);

	}

}
