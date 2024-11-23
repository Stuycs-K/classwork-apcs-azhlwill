import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class day6{
    public static void main(String[] args){
        System.out.println(solution("day6input.txt"));
    }

    public static String getLetter(ArrayList<String> col){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] counts = new int[26];

        for (int x = 0; x < counts.length; x++){
            counts[x] = -1;
        }

        for (int i = 0; i < col.size(); i++){
            if (alphabet.contains(col.get(i))){
                int index = alphabet.indexOf(col.get(i));
                if (counts[index] < 0){
                    counts[index] = 0;
                    counts[index]++;
                }
                else{
                    counts[index]++;
                }
            }
        }
        
        int leastCount = 100;
        int indexLeast = 0;
        //System.out.println(Arrays.toString(counts));
        for (int j = 0; j < counts.length; j++){
            if (counts[j] < leastCount && counts[j] > 0){
                leastCount = counts[j];
                indexLeast = j;
            }
        }
        String returnThis = "" + alphabet.charAt(indexLeast);
        return returnThis;
    }

    public static String solution(String filename){
        try{
            File file = new File(filename);
            Scanner input = new Scanner(file);
            ///// array list creation
            ArrayList<String> col1 = new ArrayList<String>(); 
            ArrayList<String> col2 = new ArrayList<String>(); 
            ArrayList<String> col3 = new ArrayList<String>(); 
            ArrayList<String> col4 = new ArrayList<String>(); 
            ArrayList<String> col5 = new ArrayList<String>(); 
            ArrayList<String> col6 = new ArrayList<String>(); 
            ArrayList<String> col7 = new ArrayList<String>(); 
            ArrayList<String> col8 = new ArrayList<String>(); 

            /// 


            while (input.hasNextLine()){
                String row = input.nextLine();
                System.out.println(row);


                
                col1.add("" + row.charAt(0));
                col2.add("" + row.charAt(1));
                col3.add("" + row.charAt(2));
                col4.add("" + row.charAt(3));
                col5.add("" + row.charAt(4));
                col6.add("" + row.charAt(5));
                col7.add("" + row.charAt(6));
                col8.add("" + row.charAt(7));
                 

                
            }
            System.out.println(col1.toString());
            System.out.println(col2.toString());
            System.out.println(col3.toString());
            System.out.println(col4.toString());
            System.out.println(col5.toString());
            System.out.println(col6.toString());
            System.out.println(col7.toString());
            System.out.println(col8.toString());
            System.out.println("\n");
            System.out.println(getLetter(col1));
            System.out.println(getLetter(col2));
            System.out.println(getLetter(col3));
            System.out.println(getLetter(col4));
            System.out.println(getLetter(col5));
            System.out.println(getLetter(col6));
            System.out.println(getLetter(col7));
            System.out.println(getLetter(col8));


        
        } catch (FileNotFoundException e){
            System.out.println("not happening");
        }
        return null;
    }
}