// FileFound.java:18: error: unreported exception FileNotFoundException; must be caught or declared to be thrown

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileFound {
    public static void main(String[] args) {
        try{
            readFile("a.txt");
        }
        catch(FileNotFoundException e)
        {
            // System.out.println("There is an error");
            System.out.println(e.getMessage());
        }
    }

    public static void readFile(String file) throws FileNotFoundException
    {
        File f=new File(file);
        Scanner sc=new Scanner(f);
        while(sc.hasNextLine())
        {
            String line=sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
}
