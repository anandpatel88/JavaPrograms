package JavaPgm;

public class JavaObjectCreation {

	public static void main(String[] args) throws Exception, IllegalAccessException, ClassNotFoundException 
	{
		 MyObject object = new MyObject();
		 object.run();
		 MyObject object1 = (MyObject) Class.forName("JavaAutomation.JavaPgm.MyObject").newInstance();
		 object1.run();
		

	}

}
