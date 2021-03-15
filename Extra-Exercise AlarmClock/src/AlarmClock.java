public class AlarmClock
{
  private Clock time;
  private Clock alarm;

  public AlarmClock(int hour, int minute, int second)
  {
    setAlarm(0, 0, 0);
    setTime(hour, minute, second);
  }

  public void setAlarm(int hour, int minute, int second)
  {
    this.alarm = new Clock(hour, minute, second);
  }

  public void setTime(int hour, int minute, int second)
  {
    this.time = new Clock(hour, minute, second);
  }

  public void tic()
  {
    alarm.copy().tic();
  }

  public boolean alarmIsRinging()
  {
    if (alarm.equals(time))
    {
      return true;
    }
    return false;
  }

  public boolean alarmIsOn()
  {
    Clock clock = new Clock(0, 0, 0);
    if (alarm.equals(clock))
    {
      return false;
    }
    return true;
  }

  public void turnOfAlarm()
  {
    setAlarm(0, 0, 0);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof AlarmClock))
    {
      return false;
    }
    AlarmClock other = (AlarmClock) obj;
    return alarm.equals(other.alarm) && time.equals(other.time);
  }

  public String toString()
  {
    String s = "";
    s = "Time is:" + time + "Alarm is set for:" + alarm;
    return s;
  }

}
