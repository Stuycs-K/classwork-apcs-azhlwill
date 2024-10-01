// William Li and Ricky Lin williaml298@nycstudents.net rickyl49@nycstudents.net

public class ArrayMethods{

  public static void main(String[] args){
    int[] test1 = new int[] {1,2,3,4,5,6};
    int[][] test2 = new int[][] {{2,3,4}, {5,6,7}, {8,9,10}};
    int[][] test3 = new int[4][2];
    int[][] test4 = new int[][] {{5}, {5}, {5}};
    int[][] test5 = new int[][] {{1,1,1}, {2,2,2}, {3,3,3}};



    System.out.println(arrToString(test1));
    System.out.println(arrToString(test2));
    System.out.println(arrToString(test3));

    System.out.println(arr2DSum(test2));
    System.out.println(arr2DSum(test3));
    System.out.println(arr2DSum(test4));
    System.out.println(arr2DSum(test5));


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




  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}

  public static int[][] swapRC(int[][]nums){
    return new int[1][1];
  }
*/
}
