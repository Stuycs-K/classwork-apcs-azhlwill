import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*; 
import java.util.*; 

public class Day4{
    public static void main(String[] args){
        System.out.println(dia4("Day4Input.txt"));
    }

    public static int dia4(String filename){
        
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            int sectorSum = 0;
        //////////////setup
            String[] alphabet = new String[]{"0th", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        /// 
            while (input.hasNextLine()){
                int[] counts = new int[27];

                String look = input.nextLine();
                for (int i = 0; i < look.length() - 6; i++){ // 
                    for (int j = 0; j < alphabet.length; j++){
                        if (look.substring(i,i+1).equals(alphabet[j])){
                            int beforeAdd = counts[j];
                            counts[j] = beforeAdd + 1;
                        }
                    }
                }

                System.out.println(Arrays.toString(counts));

                ////////
            }
        ////////////// 

            input.close();
        } catch (FileNotFoundException e){
            System.out.println("this will never happen");
            return -1;
        }

        return 0;
    }
}