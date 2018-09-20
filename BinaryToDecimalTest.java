package automationTest;

public class BinaryToDecimalTest {

	public static void main(String[] args) 
	{
		int bin=101001;
		int rem=0;
		int mul=1;
		int dec=0;
		while(bin>0)
		{
			rem=bin%10;
			dec=dec+(rem)*mul;
			mul=mul*2;
			bin=bin/10;
		}
		System.out.println(dec);

	}

}
