package automationTest;
import java.util.HashMap;
public class WordInString3 {

	public static void main(String[] args)
	{
		String words="cat,dog,cow,cat,dog,ox";
		String[] a=words.split(",");
		HashMap<String, Integer> hm = new HashMap<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{
			   hm.put(a[i], hm.get(a[i])+1);
			}
			else
			{
				hm.put(a[i], 1);
			}
		}
		System.out.println(hm);
		

	}

}
