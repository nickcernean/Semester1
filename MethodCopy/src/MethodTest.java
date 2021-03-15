public class MethodTest
{
  public static void main(String[] args)
  {
    //    MyDate date1 = new MyDate(1, 1, 1999);
    //    date1.set(1, 4, 2000);
    //    MyDate date2 = new MyDate(1, 4, 2009);
    //
    //    if (date1.equals(date2))
    //    {
    //      System.out.println("The dates are the same");
    //    }
    //    else
    //    {
    //      System.out.println("The dates aren't the same:");
    //    }
    //    MyDate date1 = new MyDate(2, 10, 1997);
    //    MyDate date2 = date1.copy();
    //    System.out.println(date2);

    //    Clock clock1 = new Clock(1, 1, 5);
    //    clock1.set(1, 4, 5);
    //    Clock clock2 = new Clock(1, 4, 5);;
    //
    //    if (clock1.equals(clock2))
    //    {
    //      System.out.println("The clocks are the same");
    //    }
    //    else
    //    {
    //      System.out.println("The clocks aren't the same:");
    //    }
    Clock clock1 = new Clock(1, 1, 5);
    Clock clock2 = clock1.copy();
    System.out.println(clock2);

  }
}
