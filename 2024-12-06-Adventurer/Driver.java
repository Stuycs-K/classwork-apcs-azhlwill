public class Driver{
    public static void main(String[] args){
        Adventurer p1 = new Spearman("Bobby", 12);
        Adventurer p2 = new Spearman("Bob", 10);

        System.out.println("Match: ");
        System.out.println(p1.getName() + "'s HP: " + p1.getHP());
        System.out.println(p2.getName() + "'s HP: " + p2.getHP());

        System.out.println("\nDefault attack:");
        System.out.println(p1.attack(p2));
        System.out.println(p2.attack(p1));

        System.out.println("\nSupport:");
        System.out.println(p2.support());
        System.out.println(p2.getName() + " now has " + p2.getHP() + " HP.");
        System.out.println("For some reason, " + p1.support(p2));
        System.out.println("\n" + p2.getName() + " now has " + p2.getHP() + " HP.");
        System.out.println(p1.getName() + " now has " + p1.getHP() + " HP.");

        System.out.println("\nSpecial attack:");
        p1.setSpecial(0);
        System.out.println(p1.specialAttack(p2));
        System.out.println(p1.getName() + " now has " + p1.getSpecial() + " energy left.");
        System.out.println(p2.specialAttack(p1));
        System.out.println(p2.getName() + " has " + p2.getSpecial() + " energy left.");
        System.out.println(p1.getName() + " now has " + p1.getHP() + " HP.");
        System.out.println(p1.getName() + " is DEAD!");

        System.out.println("\nRESULT:");
        if (p2.getHP() > 0){
            System.out.println(p2.getName() + " IS THE WINNER!");
        }
        else{
            System.out.println(p1.getName() + " IS THE WINNER!");
        }

        

    }
}