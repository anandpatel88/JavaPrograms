package automationTest;

import java.util.ArrayList;

public class ArrayListofArrayList {

	public static void main(String[] args) {
		ArrayList<ArrayList> aL=new ArrayList<ArrayList>();
		ArrayList<String> a=new ArrayList<String>();
		ArrayList<String> b=new ArrayList<String>();
		ArrayList<String> c=new ArrayList<String>();
		a.add("anand");
		a.add("Bangalore");
		a.add("Testing");
		b.add("patel");
		b.add("hyderabad");
		b.add("automation");
		c.add("kumar");
		c.add("chennai");
		c.add("java");
		aL.add(a);
		aL.add(b);
		aL.add(c);
		for(int i=0;i<aL.size();i++)
		{
			for(int j=0;j<aL.size();j++)
			{
				System.out.print(aL.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
	}

}
