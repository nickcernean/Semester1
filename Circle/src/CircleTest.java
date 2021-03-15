public class CircleTest
{
  public static void main(String[] args)
  { Point point=new Point(3,4);
  Circle circle=new Circle(6,point);
    Point point2=new Point(5,7);
    Circle circle2=new Circle(6,point2);
    point.move(9,15);
    System.out.println(point);

    System.out.println(circle.equals(circle2));

    System.out.println(circle.getArea());
    point.move(8,10);
    System.out.println(circle.getArea());

  }

}
