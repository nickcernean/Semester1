import java.util.Scanner;
public class MyDateTest
{ public static void main(String[] args)
{ Scanner input=new Scanner(System.in);
   System.out.println("Input the day:");
   int day=input.nextInt();
  System.out.println("Input the month:");
  int month=input.nextInt();
  System.out.println("Input the year:");
  int year=input.nextInt();

  MyDate date1=new MyDate(day,month,year);
  System.out.println("Day:"+date1.getDay());
  System.out.println("Month:"+date1.getMonth());
  System.out.println("Year:"+date1.getYear());
  System.out.println("Date:"+date1.toString());

  date1.set(13,12,1994);
  System.out.println("New day:"+date1.getDay());
  System.out.println("New month:"+date1.getMonth());
  System.out.println("New year:"+date1.getYear());
  System.out.println("New date:"+date1.toString());



}

}
