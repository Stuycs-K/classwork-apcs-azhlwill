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

  }
}
