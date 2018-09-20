package JavaPgm;

public class LargestAndSmallestInArray 
{
	
	public static void main(String[] args)
	{
		int[] i={10,22,-34,45,56,-76,43,12};
		int l=i[0];
		int s=i[0];
		for(int j=1;j<=i.length-1;j++)
		{
			if(i[j]>l)
			{
				l=i[j];
			}
			else if (i[j]<s)
			{
				s=i[j];
			}
		}
		
		System.out.println(l);
		System.out.println(s);
	}

}
