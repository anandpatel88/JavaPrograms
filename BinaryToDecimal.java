package automationTest;

public class BinaryToDecimal {

	public static void main(String[] args) 
	{
		int i=101010011;
		int rem=0;
		int twoPower=1;
		int dec=0;
		while(i>0)
		{
			rem=i%10;
			dec=dec+rem*twoPower;
			twoPower=twoPower*2;
			i=i/10;
		}
		
		System.out.println(dec);
	}

}
