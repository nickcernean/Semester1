public class LineTest
{
  public static void main(String[] args)
  {
    Line line = new Line(new Point(3, -4), new Point(11, 21),"Blue");
    Line line1 = new Line(new Point(3, -4), new Point(11, 21),"Blue");

    System.out.println("Length:"+line.getLength());
    System.out.println("ToSTRING:"+line.toString());
    System.out.println("Sloper Intercept:"+line.getSloperIntercept());
    System.out.println("Equals:"+line.equalSloperIntercept(line1));
  }
}
