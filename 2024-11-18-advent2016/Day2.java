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

        System.out.println(keypad[xCor][yCor]);

        for (int i = 0; i <instructions.length(); i++){
          char single = instructions.charAt(i);
          if (single == 'U'){
            if (xCor != 0){xCor--;}
          }
          else if (single == 'D'){
            if (xCor != 2){xCor++;}
          }
          else if (single == 'L'){
            if (yCor != 0){yCor--;}
          }
          else{
            if (yCor != 2){yCor++;}
          }
        }

        System.out.println(keypad[xCor][yCor]);
/*
        for (int i = 0; i < instructions.length(); i++){
          char single = instructions.charAt(i);
          if (single == 'U'){
            if (xCor == 0){
              xCor = 0;
              System.out.println(keypad[xCor][yCor]);
            }
            else{
              xCor++;
              System.out.println(keypad[xCor][yCor]);
            }
          }

          if (single == 'D'){
            if (xCor == 2){
              xCor = 2;
              System.out.println(keypad[xCor][yCor]);
            }
            else{
              xCor--;
              System.out.println(keypad[xCor][yCor]);
            }
          }

          if (single == 'L'){
            if (yCor == 0){
              yCor = 0;
              System.out.println(keypad[xCor][yCor]);
            }
            else{
              yCor--;
              System.out.println(keypad[xCor][yCor]);
            }
          }

          if (single == 'R'){
            if (yCor == 2){
              yCor = 2;
              System.out.println(keypad[xCor][yCor]);
            }
            else{
              yCor++;
              System.out.println(keypad[xCor][yCor]);
            }
          }
        }
*/

      }

      input.close();
    }
    catch (FileNotFoundException e){
      return -1;
    }


    return 1;
  }


}
