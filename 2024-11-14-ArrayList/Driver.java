import java.util.ArrayList;

public class Driver{
  public static void main(String[] args){
    System.out.println(ArrayListPractice.createRandomArray(20));
    ArrayListPractice.replaceEmpty(ArrayListPractice.createRandomArray(50));
    ArrayList<String> ary1 = ArrayListPractice.createRandomArray(10);
    ArrayListPractice.replaceEmpty(ary1);
    System.out.println(ary1);
    System.out.println(ArrayListPractice.makeReversedList(ary1));
    //ArrayListPractice.makeReversedList(ArrayListPractice.createRandomArray(10));

    ArrayList<String> aryA = ArrayListPractice.createRandomArray(3); // a less than b
    ArrayList<String> aryB = ArrayListPractice.createRandomArray(5);
    ArrayListPractice.replaceEmpty(aryA);
    ArrayListPractice.replaceEmpty(aryB);
    System.out.println("\nA less than B:\n" + "Array A: " + aryA);
    System.out.println("Array B: " + aryB);
    System.out.println(ArrayListPractice.mixLists(aryA, aryB));

    ArrayList<String> aryA2 = ArrayListPractice.createRandomArray(7); // a greater than b
    ArrayList<String> aryB2 = ArrayListPractice.createRandomArray(5);
    ArrayListPractice.replaceEmpty(aryA2);
    ArrayListPractice.replaceEmpty(aryB2);
    System.out.println("\nA greater than B:\n" + "Array A: " + aryA2);
    System.out.println("Array B: " + aryB2);
    System.out.println(ArrayListPractice.mixLists(aryA2, aryB2));

    ArrayList<String> aryA3 = ArrayListPractice.createRandomArray(5); // equal
    ArrayList<String> aryB3 = ArrayListPractice.createRandomArray(5);
    ArrayListPractice.replaceEmpty(aryA3);
    ArrayListPractice.replaceEmpty(aryB3);
    System.out.println("\nA equal to B:\n" + "Array A: " + aryA3);
    System.out.println("Array B: " + aryB3);
    System.out.println(ArrayListPractice.mixLists(aryA3, aryB3));

  }
}
