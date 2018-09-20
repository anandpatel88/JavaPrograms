package TestCollection;

import java.util.HashMap;
import java.util.Set;

public class HashMapContainsFn {

       public static void main(String[] args) 
       {
              HashMap<Integer,String> hm=new HashMap<Integer,String>();
              hm.put(1, "anand");
              hm.put(2, "mohan");
              hm.put(3, "patel");
             if(hm.containsKey(1))
             {
            	 System.out.println(" 1 is present");
             }
            if(hm.containsValue("patel"))
            {
            	 System.out.println(" patel is present");
            }

       }
}
