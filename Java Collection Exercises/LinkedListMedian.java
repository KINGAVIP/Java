import java.util.*;
public class LinkedListMedian {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(2);
        ll.add(9);
        ll.add(5);
        Collections.sort(ll);
        System.out.println(ll.get(ll.size()/2));
    }
}


// Every method - add first, add to last, remove, and more is present