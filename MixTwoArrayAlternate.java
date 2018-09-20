package automationTest;

public class MixTwoArrayAlternate {

	public static void main(String[] args) 
	{
		String s1="JAVA";
		String s2="selenium";
		String res="";
		int n=0;
		for(int i=0;i<s1.length();i++)
		{ 
			 res=res+s1.charAt(i)+s2.substring(n, n+2);
			 n=n+2;
		}
		System.out.println(res);

	}

}
