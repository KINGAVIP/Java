// Find occurence of elements in java

import java.util.*;

public class HashMapSort {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();  
        arr.add(3);      
        arr.add(2);      
        arr.add(4);      
        arr.add(3);      
        arr.add(2);
        arr.add(3);
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(Integer x:arr)
        {
            if(mp.containsKey(x))
            {
                mp.put(x, mp.get(x)+1);
            }
            else
            {
                mp.put(x, 1);
            }
        }
        for(Integer x:mp.keySet())
        {
            System.out.println(x+" has occurences :"+mp.get(x));
        }

    }
}
