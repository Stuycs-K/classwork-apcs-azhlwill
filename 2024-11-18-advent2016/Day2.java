import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Day2{
  public static void main(String[] args){
    System.out.println(solve("Day2Input.txt"));
  }

  public static int solve(String filename){

    int[][] keypad = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};


    try{
      File file = new File("Day2Input.txt");
      Scanner input = new Scanner(file);

      while (input.hasNextLine()){
        int xCor = 1;
        int yCor = 1;

        String instructions = input.nextLine();
        System.out.println(instructions + "\n");

        for (int i = 0; i < instructions.length(); i++){
          char single = instructions.charAt(i);
          System.out.println(single);
        }

      }

      input.close();
    }
    catch (FileNotFoundException e){
      return -1;
    }


    return 1;
  }


}
