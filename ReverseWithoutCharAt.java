package JavaPgm;

public class ReverseWithoutCharAt {

	public static void main(String[] args) 
	{
		String s="automation";
		String rev="";
		char[] ch=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			
			rev=rev+ch[i];
		}
		System.out.println(rev);
	

	}

}
