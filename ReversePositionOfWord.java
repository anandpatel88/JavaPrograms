package automationTest;

public class ReversePositionOfWord {

	public static void main(String[] args)
	{
		String s="my name is anand patel";
		String s1="";
		String sArr[]=s.split(" ");
		for(int i=sArr.length-1;i>=0;i--)
		{
			s1=s1+sArr[i]+" ";
		}
		
		System.out.println(s1);

	}

}
