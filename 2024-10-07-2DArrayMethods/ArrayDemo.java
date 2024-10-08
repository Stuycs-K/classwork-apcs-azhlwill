import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    int[] test1 = new int[] {1,2,3,4,5,6};
    int[][] test2 = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
    int[][] test3 = new int[][] {{0,0,1},{1,1,1},{0,1,0}};
    int[][] test4 = new int[][] {{1,1,1}, {1,1,1}, {1,1,1}};
    int[][] test5 = new int[][] {{1,2,3}, {1,2,3}};
    int[][] test6 = new int[][] {{-1,-1,-3}, {-5, -5, -1}};
    int[][] test7 = new int[][] {{-1,-1,-3}, {5, 5, -1}, {-1, -1, -1}, {-1, -1, -1, -2}};
    int[][] test8 = new int[4][4];
    int[][] test9 = new int[][] {{1,2}, {7,8}, {123,456}};
    int[][] test10 = new int[][] {{1,1,1}, {2,2,2}, {3,3,3}};
    int[][] test11 = new int[][] {{1,2,3}, {4,5,6}};
    int[][] test12 = new int[][] {{1,2}, {3}};
    int[][] test13 = new int[1][2];


    System.out.println(Arrays.toString(test1).equals(arrToString(test1)));
    System.out.println(Arrays.deepToString(test2).equals(arrToString(test2)));
    System.out.println(countZeros2D(test3)); // 4
    System.out.println(countZeros2D(test4)); // 0
    System.out.println(arr2DSum(test3)); // 5
    System.out.println(arr2DSum(test4)); // 0
    System.out.println(arr2DSum(test5)); // 12
    System.out.println(arrToString(replaceNegative(test6)));
    System.out.println(arrToString(replaceNegative(test7)));
    System.out.println(arrToString(copy(test8)));
    System.out.println(arrToString(copy(test9)));
    System.out.println(arrToString(swapRC(test10)));
    System.out.println(arrToString(swapRC(test11)));
    System.out.println(htmlTable(test12)); // <table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>
    System.out.println(htmlTable(test13)); // <table><tr><td>0</td><td>0</td></tr></table>
  }

// 0.
  public static String arrToString(int[]ary){
    String empty = "[";

    for (int i = 0; i < ary.length; i++)
    {
      if (i == ary.length - 1) 
      {
        empty = empty + ary[i]; 
      }
      else
      {
        empty = empty + (ary[i] + ", ");
      }
	}

	return empty + "]"; 
  }

// 0.
  public static String arrToString(int[][]ary){
    String empty = "[";

    for (int i = 0; i < ary.length; i++)
    {
        empty = empty + (arrToString(ary[i]) + ", "); 
    }
    return empty.substring(0,empty.length()-2) + "]"; 
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++)
    {
        for (int x = 0; x < nums[i].length; x++)
        {
            if (nums[i][x] == 0)
            {
                count++;
            }
        }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++)
    {
        for (int x = 0; x < nums[i].length; x++)
        {
            count += nums[i][x];
        }
    }
    return count;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static int[][] replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++)
    {
      for (int x = 0; x < vals[i].length; x++)
      {
        if (x == i && vals[i][x] < 0) // same col + row and negative
        {
          vals[i][x] = 1;
        }
        else if (vals[i][x] < 0) // negative but diff col + row
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
      copyArray[i] = copyHelper(nums[i]); // copy the 1d  into the 2d 
    }

    return copyArray; 
  }
// helper for 1-dim array
  public static int[] copyHelper(int[] oneDimAry) { // use int[] since you give it a 1d array

    int[] oneDimAryCopy = new int[oneDimAry.length];

    for (int i = 0; i < oneDimAry.length; i++) 
    {
      oneDimAryCopy[i] = oneDimAry[i];
    }

    return oneDimAry; 
  }


  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] empty = new int[nums[0].length][nums.length]; // swap lengths

    for (int i = 0; i < nums.length; i++)
    {
        for (int x = 0; x < nums[i].length; x++)
        {
            empty[x][i] = nums[i][x]; //swap
        }
    }
    return empty;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String empty = "<table>";
    String part1 = "<tr>";
    String part2 = "</tr>";
    String part3 = "<td>";
    String part4 = "</td>";

    for (int i = 0; i < nums.length; i++)
    {
      empty = empty + part1;
      for (int x = 0; x < nums[i].length; x++)
      {
        empty = empty + part3 + nums[i][x] + part4;
      }
      empty = empty + part2;
    }

    return empty + "</table>";
  }
}

// <table>
// <tr> (start of array)
// <td>_</td> (for each thing in array)
// </tr> (end of array)
// </table> 