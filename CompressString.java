package JavaPgm;

public class CompressString {

	public static void main(String[] args)
	{
		String s="anandmohanpatel";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j) && i<j)
				{
					count=count+1;
				}	
			}
			if(count>=1)
			{
			System.out.println(s.charAt(i)+""+count);
			}
			count=0;
			
		}
		
	}

}
