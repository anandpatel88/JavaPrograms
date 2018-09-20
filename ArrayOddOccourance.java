package automationTest;

public class ArrayOddOccourance {

	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,1,2,1,3,2};
		for(int i=0;i<a.length;i++)
		{
			boolean flag=true;
			int count=0;
			for(int k=i-1;k>=0;k--)
			{
				if(a[i]==a[k])
					{
	                flag=false;
					}
			}
			if(flag)
			{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			}
			if(count%2==1)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}
