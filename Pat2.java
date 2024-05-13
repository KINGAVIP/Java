import java.util.Scanner;

public class Pat2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int k=i;k<n-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }    
}
