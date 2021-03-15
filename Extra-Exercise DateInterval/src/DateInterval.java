public class DateInterval
{
  private int days;
  private MyDate startDate;
  private MyDate endDate;

  public DateInterval(MyDate startDate, int days)
  {
    this.days = days;
    this.startDate = startDate.copy();
    MyDate endDate1 = startDate;
    endDate1.stepForward(days);
    this.endDate=endDate1;
  }

  public DateInterval(int day, int month, int year, int days)
  {
    this.days = days;
    this.startDate = new MyDate(day, month, year).copy();
    MyDate endDate = startDate.copy();
    endDate.stepForward(days);
    this.endDate = endDate;
  }

  public DateInterval(MyDate startDate, MyDate endDate)
  {
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public MyDate getEndDate()
  {
    return endDate;
  }

  public MyDate getStartDate()
  {
    return startDate;
  }

  public int getDays()
  {
    return days;
  }

  public boolean overlap(DateInterval otherDateInterval)
  {

    if (otherDateInterval.endDate.isBefore(startDate))
    {
      return true;
    }
    else if (otherDateInterval.startDate.isBefore(endDate))
    {
      return true;
    }
    return false;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof DateInterval))
    {
      return false;
    }
    DateInterval other = (DateInterval) obj;
    return days == other.days && startDate.equals(other.startDate) && endDate
        .equals(other.endDate);
  }

  public String toString()
  {
    String s = "";

    s = "Start Date:" + startDate + "\nEnd Date:" + endDate + "\nDays between:"
        + startDate.daysBetween(endDate);
    return s;
  }
}
