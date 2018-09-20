package JavaPgm;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListObject 
{
 String name;
 int empN;
 int age;
 boolean status;

 public ArrayListObject(String name,int empN,int age,boolean status)
 {
	 this.name=name;
	 this.empN=empN;
	 this.age=age;
	 this.status=status;
 }
	public static void main(String[] args)
	{
		ArrayListObject alo1=new ArrayListObject("Anand", 12, 23, true);
		ArrayListObject alo2=new ArrayListObject("Amit", 13, 24, true);
		ArrayListObject alo3=new ArrayListObject("Sara", 14, 28, false);
		
		ArrayList<ArrayListObject> arr=new ArrayList<ArrayListObject>();
		arr.add(alo1);
		arr.add(alo2);
		arr.add(alo3);
		System.out.println(arr.get(0).name);
		Iterator<ArrayListObject> it=arr.iterator();
		while(it.hasNext())
		{
			ArrayListObject alo=it.next();
			System.out.println(alo.name);
			System.out.println(alo.empN);
			System.out.println(alo.age);
			System.out.println(alo.status);
		}
	}   
	

}
