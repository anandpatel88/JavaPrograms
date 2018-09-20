package automationTest;

public class ArraySort {

	public static void main(String[] args) 
	{
		int n[]={2,4,6,1,10,8,9,11,3,5};
        int temp=0;  
        for(int i=0;i<n.length-1;i++)
        {
        	for(int k=i+1;k<n.length;k++)
            {
        	if(n[i]>n[k])
        	{
        		temp=n[i];
        		n[i]=n[k];
        		n[k]=temp;
        		
        	}
            }
        }
        
		for(int k:n)
		{
			System.out.print(k+" ");
		}

	}

}
