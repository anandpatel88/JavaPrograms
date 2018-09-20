package automationTest;

import java.util.HashMap;

public class HashMapDupilcate {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "anand");
		hm.put(2, "Patel");
		hm.put(3, "mohan");
		System.out.println(hm);
		hm.put(1, "anand");
		System.out.println(hm);
		hm.put(1, "anandupdate");
		System.out.println(hm);

	}

}
