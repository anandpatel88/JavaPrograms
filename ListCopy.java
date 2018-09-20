package JavaPgm;

import java.util.ArrayList;

public class ListCopy {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(7);
		al.add(4);
		al.add(2);
		al.add(8);
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.addAll(al);
		System.out.println("first ArrayList "+al);
		System.out.println("first ArrayList "+al1);
		
		
		

	}

}
