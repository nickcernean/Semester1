
public class MyDateTest
{ public static void main(String[] args)
{ MyDate date1=new MyDate(19,4,2000);
  System.out.println("Day:"+date1.getDay());
  System.out.println("Month:"+date1.getMonth());
  System.out.println("Year:"+date1.getYear());
  System.out.println("LeapYear:"+date1.isLeapYear());
  System.out.println("Month name:"+date1.getMonthName());
  System.out.println("Astro sign: "+date1.getAstroSign());
  System.out.println("Astro element: "+date1.getAstroElement());

 date1.stepForwardOneDay();
  System.out.println("Number of days in month:"+date1.numberOfDaysInMonth());
  System.out.println("Date:"+date1.toString());

  MyDate date2=new MyDate(7,12,2013);
  System.out.println("Day:"+date2.getDay());
  System.out.println("Month:"+date2.getMonth());
  System.out.println("Year:"+date2.getYear());
  System.out.println("LeapYear:"+date2.isLeapYear());
  System.out.println("Month name:"+date1.getMonthName());
  System.out.println("Step forward one day:");
  { date2.stepForwardOneDay(); }
  System.out.println("Number of days in month:"+date2.numberOfDaysInMonth());
  System.out.println("Is before: "+date1.isBefore(date2));
  System.out.println("Years between: "+date1.yearsBetween(date2));
  System.out.println("Date:"+date2.toString());
  System.out.println("Astro sign: "+date2.getAstroSign());
  System.out.println("Astro element: "+date2.getAstroElement());



}

}
