import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {

  public static void main(String[] args) {
      System.out.println(countTrianglesA("inputTri.txt"));
    }

  public static boolean checkTriangle(int sideA, int sideB, int sideC){
    return (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);

  }

  public static int countTrianglesA(String filename){
    File inputFile = new File(filename);//1
    int sideA, sideB, sideC;
    int validTriangles = 0;

    try {
      Scanner input = new Scanner(inputFile); //scan it
// loop
      while(input.hasNext()){
        sideA = Integer.parseInt(input.next());
        sideB = Integer.parseInt(input.next());
        sideC = Integer.parseInt(input.next());
        
        if (checkTriangle(sideA, sideB, sideC)){
          validTriangles++;
        }
      }
      input.close();
// catch
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }

    return validTriangles;
  }

}
