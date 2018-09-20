package TestCollection;

import java.util.HashMap;
import java.util.Set;

public class HashMapIteration {

       public static void main(String[] args) 
       {
              HashMap<Integer,String> hm=new HashMap<Integer,String>();
              hm.put(1, "one");
              hm.put(2, "two");
              hm.put(3, "three");
              System.out.println(hm);
        Set<Integer> keys = hm.keySet();
        for(Integer key: keys){
            System.out.println("Value of "+key+" is: "+hm.get(key));
        }

       }
}
