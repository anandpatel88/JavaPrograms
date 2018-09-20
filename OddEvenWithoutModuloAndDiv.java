package JavaPgm;

import java.util.Scanner;

public class OddEvenWithoutModuloAndDiv {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any posstive number");
		int num=sc.nextInt();
		while(num>2)
		{
			num=num-2;
		}
		if(num==2)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
		sc.close();
	}

}
