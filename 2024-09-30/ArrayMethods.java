// William Li and Ricky Lin williaml298@nycstudents.net rickyl49@nycstudents.net

public class ArrayMethods{

  public static void main(String[] args){
    int[] test1 = new int[] {1,2,3,4,5,6};
    int[][] test2 = new int[][] {{2,3,4}, {5,6,7}, {8,9,10}};
    int[][] test3 = new int[4][2];
    int[][] test4 = new int[][] {{5}, {5}, {5}};
    int[][] test5 = new int[][] {{1,1,1}, {2,2,2}, {3,3,3}};
    int[][] test6 = new int[][] {{1,2,3}, {4,5,6}};

    int[][] test7 = new int[][] {{-1,-1,-3}, {-5, -5, -1}};
    int[][] test8 = new int[][] {{-1,-1,-3}, {-5, -5, -1}, {-1, -1, -1}, {-1, -1, -1, -2}};

    int[][] test9 = new int[4][4];
    int[][] test10 = new int[][] {{1,2}, {7,8}, {123,456}};


    System.out.println(arrToString(test1));
    System.out.println(arrToString(test2));
    System.out.println(arrToString(test3));

    System.out.println(arr2DSum(test2));
    System.out.println(arr2DSum(test3));
    System.out.println(arr2DSum(test4));
    System.out.println(arr2DSum(test5));

    System.out.println(arrToString(swapRC(test5)));
    System.out.println(arrToString(swapRC(test6)));

    System.out.println(arrToString(replaceNegative(test7)));
    System.out.println(arrToString(replaceNegative(test8)));
    
    System.out.println(arrToString(copy(test9)));
    System.out.println(arrToString(copy(test10)));

////////////////
    System.out.println("Testing if changing original changes copy");

    String copy10 = arrToString(copy(test10));

    System.out.println("Before original change: " + copy10);
    
    test10 = new int[][] {{0,0}, {1,1}, {2,2}};

    System.out.println("New original: " + arrToString(test10));
    System.out.println("Old copy: " + copy10);

    System.out.println("Did changing the original change the copy: " + arrToString(test10).equals(copy10));
////////////////




  }

// 1d array
  public static String arrToString(int[] nums){
	String empty = "[";

	for (int i = 0; i < nums.length; i++)
	{
        if (i == nums.length - 1) // if last index
        {
            empty = empty + nums[i]; // dont put the comma space
        }
        else
        {
            empty = empty + (nums[i] + ", ");
        }
	}

	return empty + "]"; // close the string with a bracket
  }

// 2d array

  public static String arrToString(int[][]ary){
    String empty = "[";

    for (int i = 0; i < ary.length; i++)
    {
        empty = empty + (arrToString(ary[i]) + ", ");
    }

    return empty.substring(0,empty.length()-2) + "]";
  }


//Return the sum of all of the values in the 2D array
  public static int arr2DSum(int[][]nums){
    int sum = 0;

    for (int i = 0; i < nums.length; i++)
    {
        for (int x = 0; x < nums[i].length; x++)
        {
            sum += nums[i][x];
        }
    }

    return sum;
  }

// rotate array
  public static int[][] swapRC(int[][]nums){
    int[][] empty = new int[nums[0].length][nums.length];

    for (int i = 0; i < nums.length; i++)
    {
        for (int x = 0; x < nums[i].length; x++)
        {
            empty[x][i] = nums[i][x];
        }
    }
    return empty;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static int[][] replaceNegative(int[][] vals)
  {
    for (int i = 0; i < vals.length; i++)
    {
      for (int x = 0; x < vals[i].length; x++)
      {
        if (x == i && vals[i][x] < 0)
        {
          vals[i][x] = 1;
        }
        else if (vals[i][x] < 0)
        {
          vals[i][x] = 0;
        }
        else
        {
          vals[i][x] = vals[i][x];
        }
      }
    }
    return vals;
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums) {
    int[][] copyArray = new int[nums.length][];

    for (int i = 0; i < nums.length; i++) 
    {
      copyArray[i] = copyHelper(nums[i]); 
    }

    return copyArray; 
  }

  public static int[] copyHelper(int[] oneDimAry) {

    int[] oneDimAryCopy = new int[oneDimAry.length];


    for (int i = 0; i < oneDimAry.length; i++) 
    {
      oneDimAryCopy[i] = oneDimAry[i];
    }

    return oneDimAry; 
  }


}
