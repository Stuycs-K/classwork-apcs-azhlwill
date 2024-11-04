import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {

  public static void main(String[] args) {
      countTrianglesA("inputTri.txt");
    }

  public static int countTrianglesA(String filename){
    File file = new File(filename);//1
    try {
      Scanner input = new Scanner(file);
      while(input.hasNext()){
        System.out.println(input.next());
      }
      input.close();
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");

    return 0;
    }

  return 0;
  }

}
