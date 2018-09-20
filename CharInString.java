package automationTest;

public class CharInString {

	public static void main(String[] args)
	{
		String s = "foobar";

	    int i = 0;
	    for(char c: s.toCharArray())
	    {
	        i++;
	    }
	    System.out.println(i);

	}

}
