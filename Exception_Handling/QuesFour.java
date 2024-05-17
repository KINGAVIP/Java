
// Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive.


// I made it user defined exception
import java.io.File;
import java.util.Scanner;

public class QuesFour {
    public static void main(String[] args) {
        File f=new File("a.txt");
        try {
            if(!f.exists())
                f.createNewFile();
            Scanner sc=new Scanner(f);
            while(sc.hasNext())
            {
                // System.out.println(sc.next());
                checkpositive(sc.next());
            }
            sc.close();
        } catch (Exception e) {  
            e.printStackTrace();
            // System.out.println(e.printStackTrace());
        }
    }
    public static void checkpositive(String st) throws PositiveNumberException
    {
        if(st.matches("[0-9]+") && Integer.parseInt(st)>0)
        {
            System.out.println("I got :"+st);
            throw new PositiveNumberException("A Number is positive");
        }
    }
}
class PositiveNumberException extends Exception{
    public PositiveNumberException(String message)
    {
        super(message);
    }
}
