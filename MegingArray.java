package automationTest;

public class MegingArray {

	public static void main(String[] args) 
	{
		int[] a={10,20,30,40};
		int[] b={50,60};
		int[] c=new int[a.length+b.length];
		int k=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			k=a[i];
			c[i]=k;			
		}
		for(int j=0;j<=0+b.length-1;j++)
		{
			k=b[j];
			c[a.length+j]=k;			
		}
		System.out.print("{ ");
		for(int n:c)
		{
			
			System.out.print(n +",");
		}
		System.out.print("} ");
		
		

	}

}
