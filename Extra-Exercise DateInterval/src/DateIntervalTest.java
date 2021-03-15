public class DateIntervalTest
{
  public static void main(String[] args)
  {
    DateInterval date1 = new DateInterval(5,11,2000, 15);
    DateInterval date2 = new DateInterval(new MyDate(8, 11, 2000), 13);
    System.out.println(date1);
    System.out.println(date2);
    System.out.println("Overlap:"+date1.overlap(date2));
  }
}
