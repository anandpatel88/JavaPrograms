package JavaPgm;

import java.util.Iterator;
import java.util.LinkedList;

public class ThirdlastFromEndLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> link=new LinkedList<Integer>();
		for(int i=10;i<=100;i=i+10)
		{
			link.add(i);
		}
		System.out.println(link);
		int size=link.size();
		int count=0;
		Iterator<Integer> it=link.iterator();
		while(it.hasNext())
		{
			count++;
			if(count==size-2)
			{
				System.out.println("3rd last element is: "+it.next());
				break;
			}
			else
			{
				it.next();
			}
		}
		
	}

}
