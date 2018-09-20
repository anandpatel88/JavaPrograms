package JavaPgm;

import static org.testng.Assert.assertEqualsNoOrder;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListpgm {

	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add("anand");
		ll.add(13);
		ll.add('a');
		for(int i=0;i<ll.size();i++)
		{
		System.out.println(ll.get(i));
			
		}
		
      LinkedList<String> lls=new LinkedList<String>();
      lls.add("anand");
      lls.add("mohan");
      lls.add("Patel");
      System.out.println("######Generic########");
      System.out.println("content of linked Text"+lls);
      for(int i=0;i<lls.size();i++)
		{
		System.out.println(lls.get(i));
			
		}
      System.out.println("######ForEach########");
      for (String s:lls)
      {
    	  System.out.println(s);
      }
      System.out.println("######Iterator########");
      Iterator<String> it=lls.iterator();
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
      
      lls.addFirst("Automation");
      System.out.println("######addFirst########");
      System.out.println("content of linked Text"+lls);
      lls.addLast("Engineer");
      System.out.println("######AddLast########");
      System.out.println("content of linked Text"+lls);
      lls.set(0, "java");
      System.out.println("######set at index########");
      System.out.println("content of linked Text"+lls);
      lls.removeLast();
      System.out.println("######removelast########");
      System.out.println("content of linked Text"+lls);
      lls.removeFirst();
      System.out.println("######removeFirst########");
      System.out.println("content of linked Text"+lls);
      lls.remove(2);
      System.out.println("######removing 2nd Element########");
      System.out.println("content of linked Text"+lls);
	}

}
