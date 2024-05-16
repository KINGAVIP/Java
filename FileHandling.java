// File Handling involves four operations mainly
// 1.Creating a new file 
// 2.Read a file
// 3.Write in a file
// 4.Delete a file

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        File f=new File("handle.txt");
        try {
            // file creation
            if(f.exists())
                System.out.println("FIle exits");
            else f.createNewFile();
        
            // Reading from file
            // using scanner class
            Scanner sc=new Scanner(f);
            // To read line by line
            // while (sc.hasNextLine()) {
                // System.out.println(sc.nextLine());
            // }
            // TO read word by word
            // while (sc.hasNext()) {
                // System.out.println(sc.next());
            // }

            sc.close();
                // Other methods include bufferreader, file reader
            // BufferedReader bf=new BufferedReader(new FileReader(f));
            // String st;
            // while((st=bf.readLine())!=null){
            //     System.out.println(st);}

            // Writing in a file
            // using FIle Writer
            FileWriter fw=new FileWriter(f);
            fw.write("bdysa hai");
            fw.append("\ntubhi go bgga");
            fw.close();
                // Files.writeString(f, "ki haal");

            // BufferedWriter bw=new BufferedWriter(new FileWriter(f));
            // bw.append("bdya bhai");
            // bw.close();


            // Delete a file
            f.delete();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
