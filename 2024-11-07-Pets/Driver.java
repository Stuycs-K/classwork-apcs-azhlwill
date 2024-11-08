// Overriding the getName() method changed the name to "The Mighty " + getName().
// This shows that methods that are overridden use a new version of the method from the superclass.

public class Driver{
  public static void main(String[] args) {
    Animal a = new Animal("helloo", 20, "Bob");
    a.speak();
    Bird b = new Bird("helloo", 20, "Bob", 10.0, "blue");
    b.speak();
  }
}