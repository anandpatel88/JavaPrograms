package automationTest;

public class SeleniumPrintDiag {

	public static void main(String[] args) 
	{
		String s="SELENIUM";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(i==j)
				{
					System.out.print(s.substring(i,i+1)+" ");
				}
				else
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}

	}

}
