public class MyArrays
  {
  public static void main(String[] args){

	int[] test1 = {1,2,3,4,5};
	int[] test2 = {};
	int[] test3 = {100,10,1,0,-5};
  int[] test4 = {0,0,0,0,0,0,0,0};
  int[] test5 = {-5,-3,2,1,23,4,5,12345};
// aryToString test cases

	System.out.println(aryToString(test1));
	System.out.println(aryToString(test2));
	System.out.println(aryToString(test3));
  System.out.println(aryToString(test4));
	System.out.println(aryToString(test5));



// returnCopy test cases
	System.out.println("actual: " + aryToString(test1) + " result: " + aryToString(returnCopy(test1)));
  System.out.println("actual: " + aryToString(test2) + " result: " + aryToString(returnCopy(test2)));
	System.out.println("actual: " + aryToString(test3) + " result: " + aryToString(returnCopy(test3)));
  System.out.println("actual: " + aryToString(test4) + " result: " + aryToString(returnCopy(test4)));
  System.out.println("actual: " + aryToString(test5) + " result: " + aryToString(returnCopy(test5)));

// concatArray test cases

  System.out.println(aryToString(concatArray(test1, test2)));
  System.out.println(aryToString(concatArray(test1, test3)));
  System.out.println(aryToString(concatArray(test1, test4)));
  System.out.println(aryToString(concatArray(test1, test5)));
  System.out.println(aryToString(concatArray(test2, test3)));
  System.out.println(aryToString(concatArray(test2, test4)));
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


  public static int[] concatArray(int[]ary1,int[]ary2){
    int length1 = ary1.length;
    int length2 = ary2.length;

    int[] returnAry = new int[length1 + length2];

    int currentSpot = 0;

    for (int i = 0; i < length1; i++)
    {
      returnAry[currentSpot] = ary1[i];
      currentSpot++;
      
    }

    for (int x = 0; x < length2; x++)
    {
      returnAry[currentSpot] = ary2[x];
      currentSpot++;
    }

    return returnAry;
  }
}