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

  public static ArrayList<String> mixLists(ArrayList<String> a, ArrayList<String> b) {
    ArrayList<String> returnArray = new ArrayList<>(a.size() + b.size());
    for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
      if (i < a.size()) {returnArray.add(a.get(i));}
      if (i < b.size()) {returnArray.add(b.get(i));}
    } // only adds when its in bounds
    return returnArray;
  }
}

