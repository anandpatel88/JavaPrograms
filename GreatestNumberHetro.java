package JavaPgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class GreatestNumberHetro {

	public static void main(String[] args) 
	{
		TreeSet<Double> al=new TreeSet<Double>();
		al.add((double) 2);
		al.add((double) 3);
		al.add(4.5);
		al.add((double) 78);
		al.add(6.9);
		Iterator it=al.iterator();
		while(it.hasNext())
		{
		double d=(double) it.next();
			if(d%1==0)
			{
				System.out.print((int)d+" ");
			}
			else
			{
				System.out.print(d+" ");
			}
		}
	
	}
}
