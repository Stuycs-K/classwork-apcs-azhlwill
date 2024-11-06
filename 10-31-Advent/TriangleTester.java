import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class TriangleTester {

  public static void main(String[] args) {
      System.out.println(countTrianglesA("inputTri.txt")); // 52
      System.out.println(countTrianglesB("inputTri.txt")); // 94
    }

  public static boolean checkTriangle(int sideA, int sideB, int sideC){
    return (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);

  }

  public static int countTrianglesA(String filename){
    File inputFile = new File(filename);
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

  public static int countTrianglesB(String filename){
    File file = new File(filename);
    try {
      Scanner input = new Scanner(file);
      int validTriangles = 0;
      int num = 0;
      ArrayList<Integer> col1 = new ArrayList<>();
      ArrayList<Integer> col2 = new ArrayList<>();
      ArrayList<Integer> col3 = new ArrayList<>();
      while(input.hasNext()){
        col1.add(input.nextInt()); // add [this, _ , _]
        col2.add(input.nextInt()); // add [ _ , this, _]
        col3.add(input.nextInt()); // add [ _ , _ , this]
        num++; // num is to check if 3 columns have been added

        if(num%3==0){
          if(checkTriangle(col1.get(num-1), col1.get(num-2), col1.get(num-3))){
            validTriangles++; // triangle 1
          }
          if(checkTriangle(col2.get(num-1), col2.get(num-2), col2.get(num-3))){
            validTriangles++; // triangle 2
          }
          if(checkTriangle(col3.get(num-1), col3.get(num-2), col3.get(num-3))){
            validTriangles++; // triangle 3
          }
        }
      }
      input.close();
      return validTriangles;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return 0;
    }
  }
}



