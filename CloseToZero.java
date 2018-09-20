package automationTest;

public class CloseToZero {

	public static void main(String[] args) 
	{
		int[] a={-5,-4,-3,7,8,9,2};
		int sum=0;
		
		int close=Math.abs(a[0]+a[1]);
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			sum=Math.abs(a[i]+a[j]);
			if(close>sum)
			{
				close=sum;
			}
			}
		}
		System.out.println("close is "+close);
		
		for(int l=0;l<a.length;l++)
		{
			for(int m=l+1;m<a.length;m++)
			{
			if(Math.abs(a[l]+a[m])==close)
			{
				System.out.println("pair is "+a[l]+","+a[m]);
				break;
			}
			}
			
		}
		
	}

}
