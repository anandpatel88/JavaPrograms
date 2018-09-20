package automationTest;

public class DisplayOnlyRepeat {

	public static void main(String[] args) 
	{
		String s="my my name is anand anand";
		String[] s1=s.split(" ");
		
		
		for(int i=0;i<s1.length;i++)
		{
			int count=0;
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					count=count+1;
				}
			}
			if (count>0)
			{
				System.out.print(s1[i]+" ");
			}
			
			
		}
		

	}

}
