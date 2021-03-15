public class MyDateTimeTest
{
  public static void main(String[] args)
  { MyDateTime dateTime=new MyDateTime(1,11,2020,18,44,32);


    System.out.println(dateTime.toString("Bobs birthday"));
    dateTime.tic();
    System.out.println(dateTime.toString());


  }

}
