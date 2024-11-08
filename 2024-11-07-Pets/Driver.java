// Overriding the getName() method changed the name to "The Mighty " + getName().
// This shows that methods that are overridden use a new version of the method from the superclass.

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
  }
}