package automationTest;

import java.util.ArrayList;

public class ArrayListDuplicate {

	public static void main(String[] args) 
	{
		ArrayList<Integer> aL=new ArrayList<Integer>();
		aL.add(1);
		aL.add(2);
		aL.add(3);
		aL.add(4);
		aL.add(4);
		aL.add(2);
		aL.add(1);
		ArrayList<Integer> dL=new ArrayList<Integer>();
		System.out.println("Original Array list: "+aL);
		for(int i=0;i<aL.size();i++)
		{
			for(int j=i+1;j<aL.size();j++)
			{
				if(aL.get(i)==aL.get(j))
				{
					dL.add(aL.get(i));
				}
			}
		}
		System.out.println("duplicate Element: "+dL);
		

	}

}
