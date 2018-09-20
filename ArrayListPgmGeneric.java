package JavaPgm;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPgmGeneric {

	public static void main(String[] args) {
		ArrayList<String> aLs=new ArrayList<String>();
		aLs.add("Anand");
		aLs.add("Mohan");
		aLs.add("Patel");
		System.out.println("Lis is"+aLs);
		String title=aLs.get(2);
		System.out.println("title is " +title);
		System.out.println(aLs.size());
		System.out.println("########Simple For########");
		for(int i=0;i<aLs.size();i++)
		{
			System.out.println(aLs.get(i));
		}
		System.out.println("########Each For########");
		for(String s:aLs)
		{
			System.out.println(s);
		}
		System.out.println("###########Using Iterator########");
	   Iterator<String> it=aLs.iterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }

	}

}
