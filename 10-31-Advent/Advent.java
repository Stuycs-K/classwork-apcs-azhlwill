import java.util.Scanner;

public class Advent{
  public static void main(String[] args) {
    String text = "This is a sample\nOf how to read\ntext!";

    // creates a Scanner object to read throug the String
    Scanner input = new Scanner(text);

    //you don't want a for loop here unless you know the size of the data set

    // prints out each word
    while(input.hasNext()){
      System.out.println(input.next());
    }

    /* prints out based off lines
    while(input.hasNextLine()){
      System.out.println(input.nextLine());
    //do something with the next line of the file
    }
    */

  Scanner sc1 = new Scanner("This is a bunch of words");
  while (sc1.hasNext()){
    System.out.println(sc1.next());
  }


  Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
  Double sum = 0.0;
  while (sc2.hasNext()){
    sum += sc2.nextDouble();
  }
  System.out.println(sum);

  }
}