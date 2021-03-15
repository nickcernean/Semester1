import java.util.Scanner;
public class ClockTest
{ public static void main(String[] args)
    { Scanner input=new Scanner(System.in);
      System.out.println("Input the hour:");
      int hour=input.nextInt();
      System.out.println("Input the minutes:");
      int minute=input.nextInt();
      System.out.println("Input the seconds:");
      int second=input.nextInt();
    Clock time1=new Clock(hour,minute,second);
    System.out.println("Hour:"+time1.getHour());
      System.out.println("Minute:"+time1.getMinute());
      System.out.println("Seconds:"+time1.getSecond());
      System.out.println("Time in seconds:"+time1.getTimeInSeconds());
      System.out.println("Hour and minute:"+time1.toString());
      System.out.println("Simple time:"+time1.getSimpleTime());
        time1.set(6,50,5);
      System.out.println("Hour:"+time1.getHour());
      System.out.println("Minute:"+time1.getMinute());
      System.out.println("Seconds:"+time1.getSecond());
      System.out.println("Time in seconds:"+time1.getTimeInSeconds());
      System.out.println("Hour and minute:"+time1.toString());
      System.out.println("Simple time:"+time1.getSimpleTime());





    }

}
