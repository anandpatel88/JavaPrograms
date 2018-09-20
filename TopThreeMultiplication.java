package automationTest;

public class TopThreeMultiplication {

	public static void main(String[] args) 
	{
		int n[]={1,4,-6,-8,0,8,89};
        int temp=0;
        int mul=1;
        /*int j[]=n.clone();
        for(int v:j)
        {
        System.out.println(j);
        }*/
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
        
		for(int p=n.length-1;p>=n.length-3;p--)
		{
			mul=mul*n[p];
		}
System.out.println("multiplication of 3 numbers are: "+mul);
	}

}
