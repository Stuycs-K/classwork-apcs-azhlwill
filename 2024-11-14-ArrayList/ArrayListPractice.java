//Jai Shah and William Li
import java.util.ArrayList;

public class ArrayListPractice{
  public static ArrayList<String> createRandomArray(int size){
    int addInt=0;
    ArrayList<String> RandArray = new ArrayList<String>(size);
    for(int i=0; i<size; i++){
      addInt=(int)(Math.random()*11);
      if (addInt==0){
        RandArray.add("");
      }
      else{
        RandArray.add(""+addInt);
      }
    }
    return RandArray;
  }

  public static void replaceEmpty( ArrayList<String> original){
    //Modify the ArrayList such that it has all of the empty strings are
    //replaced with the word "Empty".
    for (int i = 0; i < original.size(); i++){
      if (original.get(i).equals("")){
        original.set(i, "Empty");
      }
    }
    System.out.println(original);
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String> returnArray = new ArrayList<String>(original.size());

    return returnArray;
  }
}
