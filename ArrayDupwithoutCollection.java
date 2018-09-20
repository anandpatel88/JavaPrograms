package automationTest;
public class ArrayDupwithoutCollection {

public static void main(String[] args)
	{
		int a[]={1,2,2,3,4,4,5,5,6,7};
		int[] duplicate=new int[10];
		int[] unique=new int[10];
		int x = 0,y=0;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<unique.length;j++)
			{
				
				if(a[i]==unique[j])
				{
					count++;
				}
			}
			if(count>0)
			{
				duplicate[x++]=a[i];
				
			}
			else
			{
				unique[y++]=a[i];
			}
		}
		System.out.println("duplicate elemenrts are: ");
		for(int m:duplicate)
		{
			if(m!=0)
			System.out.print(m+" ");
			
		}
		System.out.println();
		System.out.println("unique elemenrts are: ");
		for(int n:unique)
		{
			if(n!=0)
			System.out.print(n+" ");
		}

	}

}
