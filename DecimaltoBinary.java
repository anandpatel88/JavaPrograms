package JavaPgm;

public class DecimaltoBinary {

	public static void main(String[] args)
	{
		int num=12;
		int binum[]=new int[100];
		int i=0;
		while(num != 0)
        {
            binum[i++] = num%2;
            num = num/2;
        }
		for(int j=i-1; j>0; j--)
        {
            System.out.print(binum[j]);
        }
		
	}

}
