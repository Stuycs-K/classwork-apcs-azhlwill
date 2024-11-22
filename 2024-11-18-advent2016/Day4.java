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
                String look = input.nextLine(); // get line
                String checkSum = ""; // blank
                int sectorID = Integer.parseInt(look.substring(look.length()-10, look.length()-7));
                // get ID if the rooms valid

                int[] counts = new int[27]; // so i dont have to count a as 0

                for (int i = 0; i < look.length() - 6; i++){ // 
                    for (int j = 0; j < alphabet.length; j++){
                        if (look.substring(i,i+1).equals(alphabet[j])){
                            int beforeAdd = counts[j]; // previous value
                            counts[j] = beforeAdd + 1; // increase count of that letter by one
                        }
                    }
                }

                ArrayList<Integer> sortedCounts = new ArrayList<Integer>(); 
                for (int z = 0; z < counts.length; z++){
                    sortedCounts.add(counts[z]); // copying to arraylist so i can use Collections
                }

                Collections.sort(sortedCounts); // sort in decreasing order
                Collections.reverse(sortedCounts); // flip so that its increasing order

                ////////
                for (int out = 0; out < 5; out++){ // check the top 5
                    for (int in = 0; in < counts.length; in++){ // go into the original counts
                        if (sortedCounts.get(out) == counts[in]){ // since the #s are the same, just check if its equal
                            checkSum += "" + alphabet[in]; //update the checkSum
                            
                            counts[in] = 0;
                            // if u dont set this to 0, once you reach the break
                            // it will go back to the outer for loop and get stuck back in counts
                            // same letter over and over again
                            //need to set counts[in] to 0 so that it can continue from counts 1 to 26

                            break;
                        }
                    }
                }
                System.out.println(checkSum); // the created checkSum
                System.out.println(look.substring(look.length()-6, look.length()-1)); // checkSum from actual String 
                System.out.println(sectorID); // ID from earlier

                /// 
                if (checkSum.equals(look.substring(look.length()-6, look.length()-1))){ // validate checkSum
                    sectorSum += sectorID; // add ID
                }
            } //after while loop
        ///
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