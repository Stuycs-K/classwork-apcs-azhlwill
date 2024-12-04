import java.util.ArrayList;

public class ColorDemo{
  public static void main(String[] args){
    String[] colors = {"\u001b[31m", "\u001b[32m", "\u001b[33m", "\u001b[34m", "\u001b[35m", "\u001b[36m", "\u001b[37m", "\u001b[38m", "\u001b[39m"};
    
    ArrayList<String> colorCopy1 = new ArrayList<String>();
    ArrayList<String> colorCopy2 = new ArrayList<String>();

    for (int i = 0; i < colors.length; i++){
      colorCopy1.add(colors[i]);
    }

    try{
      for (int j = 0; j < colorCopy1.size(); j++){
        colorCopy2.add(0, colorCopy1.get(j));
        System.out.println(colorCopy1.get(j) + "colorful");
        Thread.sleep(250);
      }
  
      for (int w = 0; w < colorCopy2.size(); w++){
        System.out.println(colorCopy2.get(w) + "colorful but reversed" + colorCopy1.get(w) + " colorful" + colorCopy1.get(w) + "\u001b[0m plain again");
        Thread.sleep(250);
      }
  
      System.out.println("\u001b[2J cleared screen");
      System.out.println("\u001b[H cursor to top left");
    } catch (Exception e){
      System.out.println("no");
    }
  }
}