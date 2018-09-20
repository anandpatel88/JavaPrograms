package automationTest;

public class WordInString {

	public static void main(String[] args)
	{ 
		String words="cat,dog,cow,cat,dog,ox";
		String[] a=words.split(",");
		////First loop for iterating array element from 1st to last
		for(int i =0;i<a.length;i++)
		{
			int count=0;
			boolean flag=true;
			////2nd loop to verify that whether we have already taken count for this word in array
			for(int j=0;j<i;j++)
			{
				if(a[i].equals(a[j]))
				{
					flag=false;
				}
			}
			if(flag)
			{
				///Third loop to take count
				for(int k=i;k<a.length;k++)
				{
					if(a[i].equals(a[k]))
					{
						count++;
					}
					
				}
				System.out.print(a[i]+"="+count+", ");
			}
			
		}
	}

}
