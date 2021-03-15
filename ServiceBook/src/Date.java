public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year)
  {
    set(day, month, year);
  }

  public Date(Date date)
  {
    this.day = 0;
    this.month = 0;
    this.year = 0;
  }

  public void set(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public Date copy()
  {
    Date other = new Date(day, month, year);
    return other;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Date))
    {
      return false;
    }
    Date other = (Date) obj;
    return day == other.day && month == other.month && year == other.year;
  }

  public String toString()
  {
    String s = " ";
    if (day < 10)
    {
      s += "0";
    }
    s += day + "/";
    if (month < 10)
    {
      s += "0";
    }
    s += month + "/" + year;
    return s;

  }

}
