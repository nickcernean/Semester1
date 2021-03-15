public class AlarmTest
{
  public static void main(String[] args)
  {
    Clock clock = new Clock(23, 15, 11);
    clock.set12HourFormat();
    System.out.println(clock);

//    AlarmClock alarmClock = new AlarmClock(15, 13, 15);
//    alarmClock.setAlarm(17, 34, 15);
//    System.out.println(alarmClock.alarmIsOn());
//    alarmClock.setTime(17, 34, 15);

  }

}
