package JavaPgm;

public class SecondLargestInArray
{
	public static void main(String[] args)
	{
		int i[]={2,3,4,5,67,45,34};
		int l=3;
		int sl=2;
		for(int k=0;k<i.length;k++)
		{
			if(i[k]>l)
			{
				l=i[k];
				sl=l;
			}
			else if(i[k]>sl && i[k]<l)
			{
				sl=i[k];
			}
		}
		System.out.println("Largest= " +l);
		System.out.println("2nd Largest= " +sl);
	}

}
