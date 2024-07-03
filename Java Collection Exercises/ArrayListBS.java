import java.util.*;
public class ArrayListBS {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        arr.add(2);
        arr.add(5);
        arr.add(3);
        arr.add(9);
        arr.add(1);
        Collections.sort(arr);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to be searched");
        Integer n=sc.nextInt();
        sc.close();
        int low=0,high=4,flag=0;
        while (low<high) {
            int mid=low+(high-low)/2;
            if(arr.get(mid)==n)
            {
                System.out.println("Searched at:"+mid);
                flag=1;
                break;
            }
            else if(arr.get(mid)>n)
            {
                high=mid-1;
            }
            else
                low=mid+1;
        }
        if(flag==0)
            System.out.println("not found");
    }    
}

// to sort an arraylist user Collections.sort(arr)
