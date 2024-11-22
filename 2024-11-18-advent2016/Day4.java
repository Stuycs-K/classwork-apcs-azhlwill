import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*; 
import java.util.*; 
import java.util.Collections;
import java.util.ArrayList;

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
                String look = input.nextLine();
                String checkSum = "";
                int sectorID = Integer.parseInt(look.substring(look.length()-10, look.length()-7));
                

                int[] counts = new int[27];

                for (int i = 0; i < look.length() - 6; i++){ // 
                    for (int j = 0; j < alphabet.length; j++){
                        if (look.substring(i,i+1).equals(alphabet[j])){
                            int beforeAdd = counts[j];
                            counts[j] = beforeAdd + 1;
                        }
                    }
                }

                ArrayList<Integer> sortedCounts = new ArrayList<Integer>();
                for (int z = 0; z < counts.length; z++){
                    sortedCounts.add(counts[z]);
                }

                Collections.sort(sortedCounts);
                Collections.reverse(sortedCounts);
                System.out.println(sortedCounts.toString() + "\n");

                ////////
                for (int out = 0; out < 5; out++){
                    for (int in = 0; in < counts.length; in++){
                        if (sortedCounts.get(out) == counts[in]){
                            checkSum += "" + alphabet[in];
                            
                            counts[in] = 0;

                            break;
                        }
                    }
                }
                System.out.println(checkSum);
                System.out.println(look.substring(look.length()-6, look.length()-1));
                System.out.println(sectorID);

                /// 
                if (checkSum.equals(look.substring(look.length()-6, look.length()-1))){
                    sectorSum += sectorID;
                }
            }
            System.out.println(sectorSum);
        ////////////// 

            input.close();
        } catch (FileNotFoundException e){
            System.out.println("this will never happen");
            return -1;
        }

        return 0;
    }
}