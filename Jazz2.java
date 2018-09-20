package automationTest;

public class Jazz2 {

	public static void main(String[] args) {
		for(int i=1;i<12;i++)
		{
			for(int j=1;j<12;j++)
			{
				if(i+j==12)
				{
					System.out.print(i+"+"+j+"= "+(i+j));
				}
			}
			System.out.println();
		}

	}

}
