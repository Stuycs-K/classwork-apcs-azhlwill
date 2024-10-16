import java.lang.Math;
public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p4 = new Point(p3);
    System.out.println( p3);
    System.out.println(p4);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));

    Point side1 = new Point(0,0);
    Point side2 = new Point(1,0);
    Point side3 = new Point(0.5,Math.sqrt(0.75));
    System.out.println(side1.distanceTo(side2));
    System.out.println(side1.distanceTo(side3));
    System.out.println(side2.distanceTo(side3));
  }
}