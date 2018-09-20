package automationTest;

import java.util.ArrayList;

public class ArrayDuplicate {

	public static void main(String[] args)
	{
		int a[]={1,2,2,3,4,4,5,5,6,7};
		ArrayList<Integer> duplicate=new ArrayList<Integer>();
		ArrayList<Integer> unique=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!unique.contains(a[i]))
			{
				unique.add(a[i]);
			}
			else
			{
				duplicate.add(a[i]);
			}
		}
		System.out.println("duplicate elemenrts are: " +duplicate);
		System.out.println("unique elemenrts are: "+unique);

	}

}
