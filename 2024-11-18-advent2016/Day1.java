import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
  public static void main(String[] args) {
    System.out.println(solved("input.txt"));
  }

  public static int solved(String filename){
    int distance = 0;
    String[] compassDirections = {"N", "E", "S", "W"};
    int currentDirection = 0;
    int xCor = 0;
    int yCor = 0;

    try {
      File file = new File("input.txt");
      Scanner input = new Scanner(file);

      while (input.hasNext()){
        String letterNumber = input.next();

        String grids = letterNumber.substring(1, letterNumber.length() -1 );

        int amt = Integer.parseInt(grids);



        if (letterNumber.contains("R")){
          currentDirection = (currentDirection + 1) % 4;
        }
        if (letterNumber.contains("L")){
          currentDirection = (currentDirection + 3) % 4;
        }

        String direction = compassDirections[currentDirection];
        if (direction.equals("N")){
          yCor += amt;
        }
        else if (direction.equals("S")){
          yCor -= amt;
        }
        else if (direction.equals("E")){
          xCor += amt;
        }
        else{
          xCor -= amt;
        }


      }

      input.close();


    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return Math.abs(xCor) + Math.abs(yCor);
  }
}
