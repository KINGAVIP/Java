// Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.

import java.util.HashMap;
import java.util.Scanner;

public class QuesSix {
    public static HashMap<Integer,Integer>hp=new HashMap<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of integers to be entered");
        Integer n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            Integer a=sc.nextInt();
            try {
                checkduplicate(a);
            } catch (DuplicateException e) {
                e.printStackTrace();
            }
        }
        sc.close();
    }
    public static void checkduplicate(Integer n) throws  DuplicateException
    {
        if(hp.get(n)==null)
        {
            hp.put(n, 1);
        }
        else
        {
            System.out.println("the duplicate value is "+(n));
            throw new DuplicateException("Contains duplicate");
        }
    }
}

class DuplicateException extends Exception{
    public DuplicateException(String Message){
        super(Message);
    }
}