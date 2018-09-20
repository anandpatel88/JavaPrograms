package automationTest;

public class SwapString {

	public static void main(String[] args)
	{

    String a="manual";
    String b="automation";
    
    System.out.println("Before Swapping a is " +a);
    System.out.println("Before Swapping b is " +b);
    a=a.concat(b);
    b=a.substring(0, a.length()-b.length());
    a=a.substring(b.length(),a.length());
    System.out.println("Before Swapping a is " +a);
    System.out.println("Before Swapping b is " +b);
    
    
    

	}

}


