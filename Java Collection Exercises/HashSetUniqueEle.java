// Properties of a hashset
// underlying data structure is hash table
// duplicate values are not allowed
// objects not to be inserted in same order
// null elements are allowed


// Program to print duplicate elements in an array

import java.util.HashSet;

public class HashSetUniqueEle {
    public static void main(String[] args) {
        int arr[]=new int[5];      
        arr[0]=3;  
        arr[1]=9;  
        arr[2]=2;  
        arr[3]=1;  
        arr[4]=2;
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<5;i++)
        {
            hs.add(arr[i]);
        }  
        System.out.println("ELements by removing duplicates are");
        for(Integer ele:hs)
        {
            System.out.print(ele+" ");
        }
    }    
}
// hashset does not necessarily sorts the elements but does not maintain order
// TO maintain insertion order use LinkedHashSet