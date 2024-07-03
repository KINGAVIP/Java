import java.util.PriorityQueue;

public class PriorityQueueQues {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        // For MaxPriorityQueue
        // PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(2);
        pq.add(1);
        pq.add(9);
        pq.add(5);
        while(!pq.isEmpty())
        {
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
    }        
}
