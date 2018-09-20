package JavaPgm;

import java.util.Scanner;

public class OddEvenWithoutModulo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any posstive number");
		int num=sc.nextInt();
		int temp=(num/2)*2;
		if(temp==num)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
		 sc.close();

	}

}
