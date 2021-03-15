public class MyDateTime
{
  private MyDate date;
  private Clock time;
  private MyDateTime time1;

  public MyDateTime(int day, int month, int year, int hour, int minute,
      int second)
  {
    set(day, month, year, hour, minute, second);
  }

  public MyDateTime(int day, int month, int year, int hour, int minute)
  {
    set(day, month, year, hour, minute);
  }

  public MyDateTime(int day, int month, int year)
  {
    this.date = new MyDate(day, month, year);
  }

  public void set(int day, int month, int year, int hour, int minute,
      int second)
  {
    this.date = new MyDate(day, month, year);
    this.time = new Clock(hour, minute, second);
  }

  public void set(int day, int month, int year, int hour, int minute)
  {
    this.date = new MyDate(day, month, year);
    this.time = new Clock(12, 0, 0);
  }

  public MyDate getDate()
  {
    return date;
  }

  public Clock getTime()
  {
    return time;
  }

  public void tic()
  {
    getTime().tic();
  }

  public void goToNextDay()
  {
    date.stepForwardOneDay();
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof MyDateTime)
    {
      return false;
    }
    MyDateTime other = (MyDateTime) obj;
    return date.equals(other.date) && time.equals(other.time);
  }

  @Override public String toString()
  {
    String s = "";
    s = "Date:" + date + ", Time:" + time;
    return s;
  }

  public String toString(String format)
  {
    if (format.equals("Bobs birthday"))
    {
      format = String
          .format("%02d/%02d/%d", getDate().getDay(), getDate().getMonth(),
              getDate().getYear());
    }
    else
    {
      format = String.format("%02d/%02d/%d %02d:%02d:%02d", getDate().getDay(),
          getDate().getMonth(), getDate().getYear(), getTime().getHour(),
          getTime().getMinute(), getTime().getSecond());
    }
    return format;
  }

}
