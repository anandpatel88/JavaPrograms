package ExceptionHandelling;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		try
		{
			int c=a/b;
			System.out.println("hi-- this line is not printed");
			System.out.println("hello-- this line is not printed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("you had ebetered b as 0, please enter again");
			b=sc.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		
		

	}

}
