package JavaPgm;

import java.util.ArrayList;

public class ArrayListArithimetic {

	public static void main(String[] args) 
	{
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Anand");
		ar.add("mohan");
		ar.add("Patel");
		ar.add("Manual");
		
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("java");
		ar1.add("selenium");
		ar1.add("maven");
		ar1.add("Manual");
		
		ar.addAll(ar1); // adding tow array list
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ar.removeAll(ar1); // removing 2nd array list
		System.out.println("##################");
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
        ar.retainAll(ar1); //Intersection
        System.out.println("##################");
        for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
	}

}
