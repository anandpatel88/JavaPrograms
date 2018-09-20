package automationTest;

public class LongestInStringArray {

	public static void main(String[] args) 
	{
		String[] s={"test","automation","manual","c","python"};
		int[] len=new int[s.length];
		for(int i=0;i<s.length;i++)
		{
			len[i]=s[i].length();
		}
		int max=len[0];
		
		for(int j=1;j<len.length;j++)
		{
			if(len[j]>max)
			{
				max=len[j];
			}
		}
		
		for(String s1:s)
		{
			if(s1.length()==max)
			{
				System.out.println("Longest String in Given array is "+s1);
				System.out.println("Longest String length is "+max);
				break;
			}
		}

	}

}
