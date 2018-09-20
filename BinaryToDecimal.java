package JavaPgm;

public class BinaryToDecimal {

	public static void main(String[] args)
	{
		long bin=1110;
		int rem=0, sum=0, i=1;
		
		while(bin>0)
		{
			rem=(int) (bin%10);
			sum=sum+(rem)*i;
			i=i*2;
			bin=bin/10;
		}
		System.out.println(sum);

	}

}
