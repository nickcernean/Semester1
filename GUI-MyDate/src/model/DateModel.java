package model;

public interface DateModel
{
  int getDay();
  int getMonth();
  int getYear();
  String getDate();
  void set(int day, int month, int year);
  void reset();
  void stepForwardOneDay();
}
