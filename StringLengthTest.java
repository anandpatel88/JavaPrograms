package automationTest;

public class StringLengthTest {

	public static void main(String[] args) 
	{

    String s="bangalore";
    String s1="";
    int count=0;
    int i=0;
    while(!s.equals(s1))
    {
    	count++;
    	s1=s1+s.charAt(i);
    	i++;
    	
    }
    System.out.println("the lenght of string is:" +count);
	}
}
