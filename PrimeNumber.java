package JavaPgm;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number to check prime/not prime");
		int n=sc.nextInt();
		System.out.println("you have intered "+n);
		prime(n);
		sc.close();
	}
	public static void prime(int x)
	{
		boolean flag=false;
		if(x<=0)
		{
			System.out.println("Please enter +ve number");
		}
		else if(x==1)
		{
			System.out.println("given number is prime");
		}
		else
		{
			for(int i=2;i<x;i++)
			{
				
				if(x%i==0 && x!=i)
				{
					flag=true;
					break;
				}
				
			}
			if(flag)
			{
				System.out.println("given number is not prime");
			}
			else
			{
				System.out.println("given number is  prime");
			}
		}
		
	}
	

}
