public class ClockTest
{
  public static void main(String[] args)
  {
    Clock clock1 = new Clock(2, 5, 7);
    System.out.println(clock1);
    System.out.println(clock1.getTimeInSeconds());
    System.out.println(clock1.toString());
    clock1.tic();
    System.out.println(clock1);

    Clock clock2 = new Clock(23, 47, 6);
    System.out.println(clock2);
    System.out.println(clock2.getTimeInSeconds());
    System.out.println(clock2.toString());
    System.out.println(clock1.isBefore(clock2));
     /* System.out.println(clock1.isBefore(clock2));
      System.out.println(clock2.isBefore(clock1));
      System.out.println(clock1.timeTo(clock2));
      System.out.println(clock2.timeTo(clock1));*/

  }
}
