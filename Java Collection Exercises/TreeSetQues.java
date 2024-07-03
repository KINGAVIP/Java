// Convert a hash set into a treeset
// DIfference between a tree and hashset
//                      HashSet         TreeSet
// 1.Data Structure     Hash Table      Red Black Tree
// 2.Time Complexity    O(1)            O(logn)
// 3.Order              Arbitary        Sorted
// 4.Null Values        Allowed         Not
// 5.Processing         Fast            Slow
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetQues {
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<>();
        hs.add("Ritesh");
        hs.add("Avi");
        hs.add("Himansu");
        hs.add("Ayush");
        for(String ele:hs)
        {
            System.out.print(ele+" ");
        }

        TreeSet<String>ts=new TreeSet<>(hs);
        // like this we can directly put items without iterating
        System.out.println(" ELements in a TREE Set:");
        for(String ele:ts)
        {
            System.out.print(ele+" ");
        }
    }
}
