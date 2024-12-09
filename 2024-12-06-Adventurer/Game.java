import java.util.Scanner;
class Game {
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:
    Adventurer p1 = new Spearman("Bobby", 12);
    Adventurer p2 = new CodeWarrior("Bob", 10);


    System.out.println("Would you like to play? y/n");
    //Read one line of user input
    String runGame = userInput.nextLine();
    while (runGame.equals("y")){
      System.out.println("running game");

      System.out.println("Current Stats:");
      System.out.println(p1.getName() + "\n     HP: " + p1.getHP() + "/" + p1.getmaxHP() + "\n     " + p1.getSpecialName() + p1.getSpecial() + "/" + p1.getSpecialMax());

      System.out.println("Would you like to continue? y/n");
      runGame = userInput.nextLine();
    }
    //Do something with the input
  }
}
