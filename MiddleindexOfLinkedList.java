package automationTest;

import java.util.Iterator;
import java.util.LinkedList;

public class MiddleindexOfLinkedList {

	public static void main(String[] args) 
	{
		LinkedList<Integer> linklist=new LinkedList<>();
		linklist.add(1);
		linklist.add(2);
		linklist.add(3);
		linklist.add(4);
		linklist.add(5);
		int count=0;
		System.out.println(linklist);
		Iterator it=linklist.iterator();
		while(it.hasNext())
		{
			it.next();
			count++;
		}
		Iterator it1=linklist.iterator();
		int count1=-1;
		while(it1.hasNext())
		{
			count1=count1+1;
			if(count1==count/2)
			{
				System.out.println("middle index is: "+it1.next());
		
			}
			else
			{
				it1.next();
			}
		
	}
	}
}
