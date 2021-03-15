import java.text.SimpleDateFormat;

public class Clock
{
  private int hour;
  private int minute;
  private int second;
  private boolean is12HourFormat;

  public Clock(int hour, int minute, int second)
  {
    set(hour, minute, second);
    this.is12HourFormat = true;
  }

  public Clock(int totalSeconds)
  {
    set(totalSeconds);
    this.is12HourFormat = true;
  }

  public void set(int hour, int minute, int second)
  {
    if ((hour < 0 || hour > 23) || (minute < 0 || minute > 59) || (second < 0
        || second > 59))
    {
      throw new IllegalArgumentException(
          "Wrong formatted time:hour=" + hour + ",minute=" + minute + ",second="
              + second);
    }
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public void set(int totalSeconds)
  {
    while (totalSeconds < 0)
    {
      totalSeconds += 86400;
    }
    while (totalSeconds >= 86400)
    {
      totalSeconds -= 86400;
    }
    this.hour = totalSeconds / 3600;
    this.minute = (totalSeconds % 3600) / 60;
    this.second = (totalSeconds % 3600) % 60;
  }

  public void set24HourFormat()
  {
    is12HourFormat = true;
  }

  public void set12HourFormat()
  {
    is12HourFormat = false;
    //    String.format("hh:mm:ss aa", new Clock(hour, minute, second));
    SimpleDateFormat clock = new SimpleDateFormat("hh:mm:ss aa");

  }

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }

  public boolean is24HourFormat()
  {
    if (hour > 12 && hour <= 24)
    {
      return true;
    }
    return false;
  }

  public int getTimeInSeconds()
  {
    return hour * 3600 + minute * 60 + second;
  }

  public void tic()
  {
    second++;
    if (second > 59)
    {
      second = 0;
      minute++;
    }
    if (minute > 59)
    {
      minute = 0;
      hour++;
    }
    if (hour > 23)
    {
      hour = 0;
    }
  }

  public Clock copy()
  {
    Clock other = new Clock(hour, minute, second);
    return other;
  }

  public boolean isBefore(Clock time)
  {
    if (hour < time.getHour() || minute < time.minute || second < time
        .getMinute())
    {
      return true;
    }
    return false;
  }

  public Clock timeTo(Clock time)
  {
    int timet = 0;
    if (getTimeInSeconds() < time.getTimeInSeconds())
    {
      timet = time.getTimeInSeconds() - getTimeInSeconds();
    }
    else
    {
      timet = getTimeInSeconds() - time.getTimeInSeconds();
    }

    return new Clock(Math.abs(timet));
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Clock))
    {
      return false;
    }
    Clock other = (Clock) obj;
    return hour == other.hour && minute == other.minute
        && second == other.second;
  }

  @Override public String toString()
  {
    if (is12HourFormat)
    {
     return String.format("hh:mm:ss aa", hour, minute, hour);
    }

    return String.format("%02d:%02d:%02d", hour, minute, hour);
  }

}

