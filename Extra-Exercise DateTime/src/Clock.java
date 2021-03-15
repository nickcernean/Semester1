public class Clock<other>
{
  private int hour;
  private int minute;
  private int second;

  public Clock(int hour, int minute, int second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public Clock(int totalSeconds)
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

  public boolean isBefore(Clock time2)
  {
    Clock time1 = new Clock(hour, minute, second);
    if (time1.convertToSeconds() < time2.convertToSeconds())
    {
      return true;
    }
    return false;
  }

  public int convertToSeconds()
  {
    return hour * 3600 + minute * 60 + second;
  }

  public Clock timeTo(Clock time2)
  {
    int timet = 0;
    if (convertToSeconds() < time2.convertToSeconds())
    {
      timet = convertToSeconds() - time2.convertToSeconds();
    }
    else
    {
      timet = convertToSeconds() - time2.convertToSeconds();
    }

    return new Clock(Math.abs(timet));
  }

  public void set(int totalSeconds)
  {
    this.hour = totalSeconds;
    this.minute = totalSeconds;
    this.second = totalSeconds;

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

  public int getTimeInSeconds()
  {
    return hour * 3600 + minute * 60 + second;
  }

  public Clock copy()
  {
    return new Clock(hour, minute, second);
  }

  public String getSimpleTime()
  {
    return hour + ":" + minute;
  }

  public String toString()
  {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }

}

