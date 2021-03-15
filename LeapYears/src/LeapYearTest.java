import java.time.LocalDate;

public class LeapYearTest
{
  public static void main(String[] args)
  {
    LocalDate today= LocalDate.now();
    MyDate date = new MyDate(1, 1, 1582);
    int count = 0;
    while (date.getYear() <=today.getYear())
    {
      if (date.isLeapYear())
      {
        count++;
      }
    date.set(1,1,date.getYear()+1);
    }
    System.out.println(count);


  }

}
