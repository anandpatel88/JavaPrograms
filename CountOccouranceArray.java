package automationTest;

public class CountOccouranceArray {

	public static void main(String[] args) {
		int[] a={1,2,3,4,1,2,5,3,5,6,2,6};
		for(int i =0;i<a.length;i++)
		{
			int count=0;
			boolean flag=true;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					flag=false;
				}
			}
			if(flag)
			{
				for(int k=i;k<a.length;k++)
				{
					if(a[i]==a[k])
					{
						count++;
					}
					
				}
				System.out.println(a[i]+"="+count);
			}
			
		}
	}

}
