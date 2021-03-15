import java.time.LocalDate;
import java.util.Scanner;

public class MyDateTest
{
  public static void main(String[] args)
  {  Scanner input = new Scanner(System.in);
    System.out.println("Enter day/month/year(Enter after every entry)");
    int day = input.nextInt();
    int month = input.nextInt();
    int year = input.nextInt();
    MyDate someday = new MyDate(day,month,year);
    System.out.println("The day: " + someday.getDay());
    System.out.println("The month: " + someday.getMonth());
    System.out.println("The Year:" + someday.getYear());
    System.out.println(someday.toString());
    System.out.println("isLeapYear: " + someday.isLeapYear());
    System.out.println("getMonthName: " + someday.getMonthName());
    someday.stepForwardOneDay();
    System.out.println("stepForwardOneDay: " + someday);
    System.out.println("numberOfDaysInMonth: " + someday.numberOfDaysInMonth());
    MyDate date2 = new MyDate(28,2,2004);
    System.out.println("date2: " + date2);
    System.out.println("isBefore(date2): " + someday.isBefore(date2));
    System.out.println("isBefore(someday): " + date2.isBefore(someday));
    System.out.println("yearBetween: " + someday.yearsBetween(date2));
    System.out.println("yearsBetween: " + date2.yearsBetween(someday));
    System.out.println("AstroSign: " + someday.getAstroSign());
    System.out.println("AstroElement: " + someday.getAstroElement());
    System.out.println("Day of the Week: " + someday.dayOfWeek());
    MyDate today = new MyDate();
    System.out.println("Today: " + today);
    today.stepForward(9999);
    System.out.println("10000 days to the future: " + today);
        someday.set(8,9,2020);
        System.out.println("The day: " + someday.getDay());
        System.out.println("The month: " + someday.getMonth());
        System.out.println("The Year:" + someday.getYear());
        System.out.println(someday.toString());


  }

}
