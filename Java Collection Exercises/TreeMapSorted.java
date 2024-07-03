// Implementation of sortedmap interface
// Sorts on basis of key
import java.util.*;
public class TreeMapSorted {
    public static void main(String[] args) {
        TreeMap<String,Integer>mp=new TreeMap<>();
        mp.put("avi",1);
        mp.put("roman",2);
        mp.put("aa",4);

        for(String x:mp.keySet())
        {
            System.out.println(x+" has value "+ mp.get(x));
        }
    }
}
