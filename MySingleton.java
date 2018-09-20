package automationTest;
public class MySingleton
{
    private static MySingleton myObj;
    int count=0;
     
    static
    	{
        myObj = new MySingleton();
    	}
     
    private MySingleton()
    {
     
    }
     
    public static MySingleton getInstance()
    {
        return myObj;
    }
     
    public void testMe()
    {
        System.out.println("Hey.... it is working!!!");
        System.out.println(++count);
    }
     
    public static void main(String a[]){
        MySingleton ms = getInstance();
        ms.testMe();
        MySingleton ms1 = getInstance();
        ms1.testMe();
    }
}