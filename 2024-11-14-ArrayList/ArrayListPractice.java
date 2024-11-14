//Jai Shah and William Li
import java.util.ArrayList;
public class ArrayListPractice{
  public static ArrayList<String> createRandomArray(int size){
    int addInt=0;
    ArrayList<String> RandArray= new ArrayList<String>(size);
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
}
