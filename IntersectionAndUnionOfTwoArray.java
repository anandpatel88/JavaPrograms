package automationTest;

public class IntersectionAndUnionOfTwoArray {

	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5,6,7,8};
		int[] b={1,5,8,9,10,11,13,15};
		int[] union=new int[20];
		int k=0;
		int flag=0;
//		Login for intersect
		for(int i=0;i<a.length;i++)
		{
		union[k++]=a[i];
		}
		for(int j=0;j<b.length;j++)
		{
			flag=0;
			for(int n=0;n<union.length;n++)
			{
				if(b[j]==union[n])
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				union[k++]=b[j];
			}
		}
		for(int m:union)
		{
			if(m!=0)
			System.out.print(m+" ");
		}
		
		

	}

}
