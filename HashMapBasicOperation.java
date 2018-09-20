package TestCollection;

import java.util.HashMap;

public class HashMapBasicOperation {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		System.out.println(hm);
		System.out.println(hm.get(1));
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		hm.remove(2);
		System.out.println(hm);
		System.out.println(hm.size());
		hm.clear();
		System.out.println(hm.size());
	}
}
