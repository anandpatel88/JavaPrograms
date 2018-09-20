package JavaPgm;

import javax.jws.soap.SOAPBinding;

public class CallByValueAndRef {

	public static void main(String[] args) 
	{
		CallByValueAndRef obj= new CallByValueAndRef();
		System.out.println(obj.run(2));//call by value
		System.out.println(obj.get(obj));

	}
	
	public int run(int i)
	{
		i=5;
		return i;
	}
	public CallByValueAndRef get(CallByValueAndRef obj)
	{
		return obj;
	
	}

}
