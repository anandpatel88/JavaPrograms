package automationTest;

public class MiddleIndexForSum {

	public static void main(String[] args) {
	
		int[] a={1,2,4,5,3,4};
		
		for(int i=1;i<a.length-1;i++)
		{
			int sumLeft=0;
			int sumRight=0;
			
			for(int j=0;j<i;j++)
			{
				sumLeft=sumLeft+a[j];
			}
			for(int k=i+1;k<a.length;k++)
			{
				sumRight=sumRight+a[k];
			}
			if(sumLeft==sumRight)
			{
				System.out.println("middle Index is "+a[i]);
			}
		}
	}

}
