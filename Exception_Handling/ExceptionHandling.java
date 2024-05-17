import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer:");
        Integer n=sc.nextInt();
        sc.close();
        try{
            Integer a=0/((n%2)-1);
            System.out.println(a+"Integer is even");
        }
        catch(Exception e)
        {
            System.out.println("Integer is odd");
        }
    }
}
