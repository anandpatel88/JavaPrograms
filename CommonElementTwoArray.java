package JavaPgm;

public class CommonElementTwoArray {

	public static void main(String[] args)
	{
		int[] a={1,2,4,5,7,9,8,10};
		int[] b={1,4,9,10,5,11};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+", ");
				}
			}
		}

	}

}
