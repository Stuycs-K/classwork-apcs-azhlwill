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
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String> returnArray = new ArrayList<String>(original.size());
    for (int i = original.size() - 1; i >= 0; i--){
      returnArray.add(original.get(i));
    }
    return returnArray;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
    
    ArrayList<String> returnArray = new ArrayList<>(a.size() + b.size());
    int smallerSize = Math.min(a.size(), b.size());

    for (int i = 0; i < smallerSize; i++) {
        returnArray.add(a.get(i));
        returnArray.add(b.get(i));
    }

    // add rest starting from smallerSize since thats the end of the short list
    if (a.size() > b.size()) {
        for (int i = smallerSize; i < a.size(); i++) {
            returnArray.add(a.get(i));
        }
    } else if (b.size() > a.size()) {
        for (int i = smallerSize; i < b.size(); i++) {
            returnArray.add(b.get(i));
        }
    }

    return returnArray;


  } 
}
