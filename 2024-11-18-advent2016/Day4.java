import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day4{
    public static void main(String[] args){
        System.out.println(dia4("Day4Input.txt"));
    }

    public static int dia4(String filename){
        
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
        //////////////
            System.out.println("hello");

            input.close();
        } catch (FileNotFoundException e){
            System.out.println("this will never happen");
            return -1;
        }

        return 0;
    }
}