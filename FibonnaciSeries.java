package JavaPgm;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter a boubdry value");
		int n=sc.nextInt();
		int i=0;
		int j=1;
		int f=0;
		System.out.println(i);
		System.out.println(j);
		
		while(f<n)
		{
			f=i+j;
			i=j;
			j=f;
			if(f<n)
			{
			System.out.println(f);
			}
		}
		sc.close();
		

	}

}
