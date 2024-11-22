import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class day6{
    public static void main(String[] args){
        System.out.println(solution("day6input.txt"));
    }

    public static String solution(String filename){
        try{
            File file = new File(filename);
            Scanner input = new Scanner(file);


        } catch (FileNotFoundException e){
            System.out.println("not happening");
        }
        return null;
    }
}