package automationTest;

public class LinearSearch {

	public static void main(String[] args) 
	{
		int n[]={4,5,3,2,7,8,10,1,11};
		int s=10;
		for(int i=0;i<n.length;i++)
		{
				if(n[i]==s)
				{
					System.out.println(s+" is present"+"at position: "+(i+1));
				}
			}
		}

	}


