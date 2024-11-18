import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    System.out.println(solved("input.txt"));
  }

  public static int solved(String filename){
    int distance = 0;


    try {
      File file = new File("input.txt");//1
      Scanner input = new Scanner(file);

      while (input.hasNext()){
        distance++;
        input.next();
      }



      input.close();//releases the file from your progra








    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
    }
    return distance;
  }
}
