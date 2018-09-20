package automationTest;

public class Merging3Array {
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40};
		int[] b={50,60};
		int[] c={70,80,90,100};
 		int[] d=new int[a.length+b.length+c.length];	
		for(int i=0;i<=a.length-1;i++)
		{

			d[i]=a[i];			
		}
		for(int j=0;j<=0+b.length-1;j++)
		{
	
			d[a.length+j]=b[j];			
		}
		for(int m=0;m<=c.length-1;m++)
		{
	
			d[a.length+b.length+m]=c[m];			
		}
		for(int n:d)
		{

			System.out.print(n +" ");
		}
	
	}

}
