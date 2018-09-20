package automationTest;

public class TwoDimentionArray {

	public static void main(String[] args)
	{
		int k=1;
		int arr[][]=new int[3][3];
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				arr[i][j]=k++;
			}
		}
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
