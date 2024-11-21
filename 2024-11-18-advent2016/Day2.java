import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Day2{
  public static void main(String[] args){
    System.out.println(solve("Day2Input.txt"));
  }

  public static int solve(String filename){

    int[][] keypad = new int[][] {{0,0,1,0,0}, {0,2,3,4,0}, {5,6,7,8,9}, {0,100,101,102,0}, {0,0,103,0,0}};

    try{
      File file = new File("Day2Input.txt");
      Scanner input = new Scanner(file);

      while (input.hasNextLine()){
        int xCor = 2;
        int yCor = 0;


        String instructions = input.nextLine();
        System.out.println(instructions + "\n");


        for (int i = 0; i <instructions.length(); i++){
          char single = instructions.charAt(i);

          if (single == 'U'){
            int tempXU = xCor - 1;
            if (xCor != 0){
              if (keypad[tempXU][yCor] != 0){xCor--;}
            }
          }

          else if (single == 'D'){
            int tempXD = xCor + 1;
            if (xCor != 4){
              if (keypad[tempXD][yCor] != 0){xCor++;}
            }
          }

          else if (single == 'L'){
            int tempYL = yCor - 1;
            if (yCor != 0){
              if (keypad[xCor][tempYL] != 0){yCor--;}
            }
          }

          else{
            int tempYR = yCor + 1;
            if (yCor != 4){
              if (keypad[xCor][tempYR] != 0){yCor++;}
            }          }
        }
        System.out.println(keypad[xCor][yCor]);
      }

      input.close();
    }
    catch (FileNotFoundException e){
      return -1;
    }
    return 1;
  }


}
