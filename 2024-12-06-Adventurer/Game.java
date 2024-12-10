import java.util.Scanner;
class Game {
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:
    Adventurer p1 = new CodeWarrior("Bobby the Robot", 12);
    Adventurer p2 = new Spearman("Bob the Builder", 10);


    System.out.println("Would you like to play? y/n");

    String runGame = userInput.nextLine();

    while (!runGame.equals("y") && !runGame.equals("n")){
      System.out.println("Would you like to play? y/n");

      runGame = userInput.nextLine();
    }

    while (runGame.equals("y")){
      System.out.println("Running game...");

      // display stats
      System.out.println("Current Stats: \n========================");
      System.out.println(p2.getName() + " (YOU)\n     HP: " + p2.getHP() + "/" + p2.getmaxHP() + "\n     " + p2.getSpecialName() + ": " + p2.getSpecial() + "/" + p2.getSpecialMax() + "\n");
      System.out.println(p1.getName() + "\n     HP: " + p1.getHP() + "/" + p1.getmaxHP() + "\n     " + p1.getSpecialName() + ": " + p1.getSpecial() + "/" + p1.getSpecialMax());
      System.out.println("========================");

      // PLAYER MOVES
      System.out.println("It is your turn, what would you like to do?\n\n    attack / special / support\n");
      String move = userInput.nextLine();
      while (!move.equals("attack") && !move.equals("special") && !move.equals("support")){
        System.out.println("Invalid choice, enter one of the following: attack ... special ... support ...");
        move = userInput.nextLine();
      }

      if (move.equals("attack")){
        System.out.println(p2.attack(p1));
      }
      else if (move.equals("special")){
        System.out.println(p2.specialAttack(p1));
      }
      else if (move.equals("support")){
        System.out.println(p2.support());
      }
      // PLAYER MOVES
      System.out.println("\n");

      // Check if player won
      if (p1.getHP() <= 0){
        System.out.println("YOU WON!");
        break;
      }


      // COMPUTER MOVES
      int botMove = (int) (Math.random() * 3);

      if (botMove == 0){
        System.out.println(p1.attack(p2));
      }
      else if (botMove == 1){
        System.out.println(p1.specialAttack(p2));
      }
      else{
        System.out.println(p1.support());
      }
      // COMPUTER MOVES
     
      // display stats
      System.out.println("Current Stats: \n========================");
      System.out.println(p2.getName() + " (YOU)\n     HP: " + p2.getHP() + "/" + p2.getmaxHP() + "\n     " + p2.getSpecialName() + ": " + p2.getSpecial() + "/" + p2.getSpecialMax() + "\n");
      System.out.println(p1.getName() + "\n     HP: " + p1.getHP() + "/" + p1.getmaxHP() + "\n     " + p1.getSpecialName() + ": " + p1.getSpecial() + "/" + p1.getSpecialMax());
      System.out.println("========================");

      // check for winner
      if (p2.getHP() <= 0){
        System.out.println("YOU LOST!");
        break;
      }
      else{
        System.out.println("Would you like to continue? y/n");
        runGame = userInput.nextLine();
      }

    }
  }
}
