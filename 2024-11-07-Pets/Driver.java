/*  STEP 8
Overriding the getName() method changed the name to "The Mighty " + getName(). This shows that methods that are overridden use a new version of the method from the superclass.
*/
/* STEP 10
Test 3 doesn't work because the animal is not a bird. Bird is a subclass of animal which is why the 4th test works. Bird is-A Animal, but Animal is not a Bird.
*/
public class Driver{
  public static void main(String[] args) {
    Animal a = new Animal("helloo", 20, "Bob");
    a.speak();
    Bird b = new Bird("helloo", 20, "Bob", 10.0, "blue");
    b.speak();

    Animal a1 = new Animal("hi everyone", 5, "Slim"); 
    Bird b1 = new Bird("hiiiiiiiiii" , 2, "Jim", 4.5, "green");
    //Bird b2 = new Animal("hellooo", 40, "Rick");
    Animal a2 = new Bird("yesssssss", 16, "Will", 100.0, "purple");

    System.out.println("a1: ");
    a1.speak();
    System.out.println("b1: ");   
    b1.speak();
    System.out.println("a2: ");
    a2.speak();
  }
}