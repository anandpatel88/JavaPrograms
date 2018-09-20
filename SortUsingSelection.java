/*The selection sort is a combination of searching and sorting. During each pass, 
the unsorted element with the smallest (or largest) value is moved to its proper 
position in the array. The number of times the sort passes through the array is one 
less than the number of items in the array. In the selection sort, the inner loop finds 
the next smallest (or largest) 
value and the outer loop places that value into its proper location.*/


package JavaPgm;

public class SortUsingSelection {

	public static void main(String[] args)
	{
		int[] a={5,6,4,3,7,8,9,10,12,2,1};
		int l=a.length;
		for(int i=0;i<l;i++)
		{
			
			for(int j=0;j<l;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		
		for(int k:a)
		{
			System.out.println(k);
		}

	}

}
