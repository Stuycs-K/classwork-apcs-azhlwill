import java.util.Random;
import java.util.Arrays;

public class Driver{
    public static void main(String[] args){
        border(80,31);
        int[] nums = randomArray();
        System.out.println(Arrays.toString(nums));

        int column = 0;
        for (int i = 0; i < 3; i++){
            column += 20;
            
            if (nums[i] < 25){
                Text.color(Text.RED, Text.BRIGHT);
            }
            else if (nums[i] > 75){
                Text.color(Text.GREEN, Text.BRIGHT);
            }
            else{
                Text.color(Text.WHITE);
            }
        }
    }

    private static void border(int width, int height){
        for (int i = 0; i <= height; i ++){
            for (int j = 0; j <= width; j++){
                if (i == 0 || i == height || j == 0 || j == width){
                    Text.color(Text.background(Text.RED));
                    System.out.print("+");
                }
                else if (i == 2){
                    Text.color(Text.background(Text.RED));
                    System.out.print("-");
                }
                else{
                    Text.color(Text.background(Text.BLACK));
                    System.out.print(" ");
                }
            }
        }
    }

    private static int[] randomArray(){
        int[] returnArr = new int[3];
        for (int i = 0; i < 3; i++){
            returnArr[i] = (int) (Math.random() * 100);
        }
        return returnArr;
    }

}