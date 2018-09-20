package automationTest;

public class StringLengthTest1 {

	public static void main(String[] args) 
	{
		String s="bangalore";
		char[] ch=s.toCharArray();
		int count=0;
		for(char ch1:ch)
		{
			count++;
		}
	  
	   System.out.println("the lenght of string is:" +count);

	}

}
