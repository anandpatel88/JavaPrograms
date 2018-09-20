package JavaPgm;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListPgm {

	public static void main(String[] args)
	{

  ArrayList al=new ArrayList();
  al.add(5);
  al.add("Anand");
  al.add(true);
  al.add(5);
  System.out.println(al.size());
  System.out.println(al.get(3));
  al.remove(3);
  System.out.println("List is"+al);
  System.out.println(al.size());
  System.out.println("########Using Simple For#######");
   for(int i=0;i<al.size();i++)
   {
	   System.out.println(al.get(i));
   }
   System.out.println("########Using Iterator#######");
  Iterator it= al.iterator();
  for(int i=0;i<al.size();i++)
  {
	   System.out.println(it.next());
  }
	}

}
