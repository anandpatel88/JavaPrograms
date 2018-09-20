package automationTest;

public class MixedString {

	public static void main(String[] args)
	{
		String s="abc123de56";
		char[] ch=s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(Character.toString(ch[i]).matches("[a-z?]"))
			{
				
			}
			else
			{
				sum=sum+Integer.parseInt(Character.toString(ch[i]));
			}
		}
		System.out.println(sum);
		
	}
	

}
