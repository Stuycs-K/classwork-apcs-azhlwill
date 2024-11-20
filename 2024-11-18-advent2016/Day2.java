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
          if (single.equals('U')){
            if (xCor == 0){
              xCor = 0;
            }
            else{
              xCor++;
            }
          }

          if (single.equals('D')){
            if (xCor == 2){
              xCor = 2;
            }
            else{
              xCor--;
            }
          }

          if (single.equals('L')){
            if (yCor == 0){
              yCor = 0;
            }
            else{
              yCor--;
            }
          }

          if (single.equals('R')){
            if (yCor == 2){
              yCor = 2;
            }
            else{
              yCor++;
            }
          }

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
