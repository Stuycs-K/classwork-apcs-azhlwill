import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class day20{
    public static void main(String[] args){
        System.out.println(solution("day20input.txt"));
    }

    public static int solution(String filename){
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            ArrayList<String> ranges = new ArrayList<String>();

            while (input.hasNext()){
                ranges.add(input.next());
            }

            for (int i = 0; i < ranges.size(); i++){
                ranges.set(i, (Arrays.toString(ranges.get(i).split("-"))));
            }
            System.out.println(ranges);


        } catch(FileNotFoundException e){
            System.out.println("no");
        }

        return -111;
    }
}