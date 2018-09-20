package JavaPgm;

public class RemovingDuplicateString {

	public static void main(String[] args)
	{
		String s="anandmohanpatel";
		String s1="";
		
		
		for(int i=0;i<s.length();i++)
		{
			boolean res=false;
			for(int j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j) && i!=j)
						{
					     res=true;
					     break;
					     
						}
			}
			if(!res)
			{
				s1=s1+s.charAt(i);
			}
			
			
		}
		System.out.println(s1);
		

	}

}
