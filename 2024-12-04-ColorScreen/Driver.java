public class Driver{
    public static void main(String[] args){
        System.out.print(Text.CLEAR_SCREEN);
        int width = 80; 
        int height = 31;
        border(width, height);
        int[] nums = randomArray();

        int column = 23;
        for (int i = 0; i < 3; i++){
            if (nums[i] < 25){
                Text.color(Text.RED, Text.BRIGHT, Text.background(Text.BLACK));
            }
            else if (nums[i] > 75){
                Text.color(Text.GREEN, Text.BRIGHT, Text.background(Text.BLACK));
            }
            else{
                Text.color(Text.WHITE, Text.background(Text.BLACK));
            }
            Text.go(2, column);
            System.out.print(nums[i]);
            column += 21;
        }

        Text.go(32,0);
        System.out.print(Text.RESET);
    }

    private static void border(int width, int height){
        for (int i = 1; i <= height; i ++){
            for (int j = 1; j <= width; j++){
                Text.go(i,j);
                if (i == 1 || i == height || j == 1 || j == width){
                    Text.color(Text.background(Text.RED));
                    System.out.print("+");
                }
                else if (i == 3){
                    Text.color(Text.background(Text.RED));
                    System.out.print("/");
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