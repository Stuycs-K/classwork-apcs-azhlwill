public class Driver{
    public static void main(String[] args){
        border(80,31);
    }

    private static void border(int width, int height){
        for (int i = 0; i <= height; i ++){
            for (int j = 0; j <= width; j++){
                if (i == 0 || i == height || j == 0 || j == width){
                    Text.color(Text.background(Text.RED));
                    System.out.print(" ");
                }
                else{
                    Text.color(Text.background(Text.BLACK));
                    System.out.print(" ");
                }
            }
        }
    }
}