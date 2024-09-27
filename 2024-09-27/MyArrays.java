public class MyArrays{
  public static void main(String[] args){

// 
    int[] test1 = {1,2,3,4,5};
    System.out.println(aryToString(test1));
    int[] test2 = {};
    System.out.println(aryToString(test2));
    int[] test3 = {100,10,1,0,-5};
    System.out.println(aryToString(test3));
  }

// arrToString
  public static String aryToString(int[] nums){
    String empty = "[";

    for (int i = 0; i < nums.length; i++)
    {
      if (i == nums.length - 1)
      {
        empty = empty + nums[i];
      }
      else
      {
        empty = empty + (nums[i] + ", ");
      }
    }

    return empty + "]";
  }

/*
  //Write a function that returns a new array with the same values as the parameter ary.
  public static int[] returnCopy(int[]ary){
    int[] newArr = new int[ary.length];

    for (int i = 0; i < ary.length; i++)
    {
      newArr[i] = ary[i];
    }

    return newArr;
  }

  //Write a function that returns a new array, that contains all of the values of ary1 followed by all of the values of ary2.
  //The order of the values should remain the same.

/*
  public static int[] concatArray(int[]ary1,int[]ary2){

*/
  }
