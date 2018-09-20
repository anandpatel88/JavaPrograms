package JavaPgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NumberOrder {

	public static void main(String[] args)
	{
		int num=16845;
		int length=0;
		while(num>0)
		{
			num=num/10;
			length++;
		}
		List<Integer> list=new ArrayList<Integer>();
		int i=0;
		num=16845;
		System.out.println("my input number is "+num);
		while(num>0)
		{
			list.add(num%10);
			num=num/10;
			i++;
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		int outNum=0;
		for(int j=0;j<list.size();j++)
		{
			outNum=outNum*10+list.get(j);
			
		}
		
		System.out.println("my output number is "+outNum);
	}

}
