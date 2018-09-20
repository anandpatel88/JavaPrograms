package JavaPgm;
import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm1= new HashMap<Integer, String>();
		hm1.put(1, "good");
		hm1.put(2, "morning");
		hm1.put(3, "bye");
		
		HashMap<Integer,String> hm2= new HashMap<Integer, String>();
		hm2.put(1, "good");
		hm2.put(4, "night");
		hm2.put(5, "bye");
		for(Integer i:hm1.keySet())
		{
			String value1=hm1.get(i);
		
			for(Integer j:hm2.keySet())
			{
				String value2=hm2.get(j);
			
				if(i==j && value1.equals(value2))
				{
					System.out.println("key is "+i+" value is "+value1);
					break;
				}
			}
		}
	
	}
}
