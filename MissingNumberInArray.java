package JavaPgm;

public class MissingNumberInArray {

	public static void main(String[] args)
	{
		int[] i={1,2,3,5,6,7};
		int actualSum=0;
		int expecedSum=28;
		for(int j:i)
		{
			actualSum=actualSum+j;
		}
		int missingNum=expecedSum-actualSum;
		System.out.println(missingNum);
	}

}
