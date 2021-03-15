package model;

public class DateModelManager implements DateModel
{
  private MyDate date;

  public DateModelManager()
  {
    date = new MyDate();
  }

  @Override public int getDay()
  {
    return date.getDay();
  }

  @Override public int getMonth()
  {
    return date.getMonth();
  }

  @Override public int getYear()
  {
    return date.getYear();
  }

  @Override public String getDate()
  {
    return date.toString();
  }

  @Override public void set(int day, int month, int year)
  {
    date.set(day, month, year);
  }

  @Override public void reset()
  {
    date = new MyDate();
  }

  @Override public void stepForwardOneDay()
  {
    date.stepForwardOneDay();
  }
}
