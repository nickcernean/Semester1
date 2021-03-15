public class Time
{
  private int hour;
  private int minute;
  private int second;

  public Time(int h, int m, int s)
  {
    if (h > 23 || m > 59 || s > 59)
    {
      throw new IllegalArgumentException("Illegal time input,try one more time!");
    }
    this.hour = h;
    this.minute = m;
    this.second = s;
  }

  public Time(int totalTimeInSeconds)
  {
    if (totalTimeInSeconds < 0)
    {
      totalTimeInSeconds = 0;
    }
    this.hour = totalTimeInSeconds / 3600;
    this.minute = (totalTimeInSeconds % 3600) / 60;
    this.second = (totalTimeInSeconds % 3600) % 60;
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

  public void tic(int seconds)
  {
    Time time1 = new Time(hour, minute, second);
    hour = (time1.convertToSeconds() + seconds) / 3600;
    if (hour == 24)
    {
      hour = 0;
    }
    else if (hour > 24)
    {
      hour = hour % 24;
    }
    minute = ((time1.convertToSeconds() + seconds) % 3600) / 60;
    second = ((time1.convertToSeconds() + seconds) % 3600) % 60;
  }

  public int convertToSeconds()
  {
    return hour * 3600 + minute * 60 + second;
  }

  public boolean isBefore(Time time2)
  {
    return convertToSeconds() < time2.convertToSeconds();
  }

  public Time timeTo(Time time2)
  {
    return new Time(Math.abs(convertToSeconds() - time2.convertToSeconds()));
  }

  public Time copy()
  {
    return new Time(hour, minute, second);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Time))
    {
      return false;
    }
    Time other = (Time) obj;
    return hour == other.hour && minute == other.minute
        && second == other.second;
  }

  public String toString()
  {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }

}