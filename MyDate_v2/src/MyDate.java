
  public class MyDate
  {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year)
    {
      this.day = day;
      this.month = month;
      this.year = year;
    }

    public void set(int day, int month, int year)
    { if(year<0)
          {year=-year;}
          if(month<1)
            {month=1;}
          else if (month>12)
          {month=12;}
          this.year = year;
          this.month = month;
          if(day<1)
          {  day=1; }
            else if(day>numberOfDaysInMonth())
          {day=numberOfDaysInMonth();}
            this.day=day;
    }

    public int getDay()
    {
      return day;
    }

    public int getMonth()
    {
      return month;
    }

    public int getYear()
    {
      return year;
    }
    public boolean isLeapYear()
    { return (year%4==0)&&((year!=100)||(year%400==0));

    }
     public String getMonthName()
     {  switch (month)
     { case 1:
       return "January";
       case 2:
         return "February";
       case 3:
         return "March";
       case 4:
         return "April";
       case 5:
         return "May";
       case 6:
         return "June";
       case 7:
         return "July";
       case 8:
         return "August";
       case 9:
         return "September";
       case 10:
         return "October";
       case 11:
         return "November";
       case 12:
         return "December";
       default:
         return "Error";
          }
     }
     public  void stepForwardOneDay()
     {
       day++;
       if (day > numberOfDaysInMonth())
          { day=1;
            month++;
            if(month>12)
            { month=1;
              year++;
            }
          }
     }
public int numberOfDaysInMonth()
{ switch(month)
{
  case 2:
    if (isLeapYear())
    {
      return 29;
    }
    return 28;
  case 4:
  case 6:
  case 9:
  case 11:
    return 30;
  default:
    return 31;
}
}
public boolean isBefore(MyDate other)
{ int dummyDayOfThis=year*400+month*31+day;
  int dummyDayOfOther=other.year*400+other.month*31+other.day;
  return dummyDayOfThis<dummyDayOfOther;
}
public int yearsBetween(MyDate other)
{
  int years = 0;
  if (isBefore(other))
  { years=other.year-this.year;
    if (this.month > other.month || (this.month == other.month && this.day > other.day))
    { years--; }
  }
  else
  { years = this.year - other.year;
  if (other.month > this.month ||(other.month == this.month && other.day > this.day))
    { years--; }
  }
  return years;
}
 public String getAstroSign()
 {  switch (month)
 { case 1:
      if(day>=0||day<=19)
        return "Capricorn";
      else return "Aquarius";
   case 2:
     if(day>=0||day<=18)
       return "Aquarius";
     else return "Pisces";
     case 3:
       if(day>=0||day<=20)
         return "Pisces";
       else return "Aries";
       case 4:
         if(day>=0||day<=19)
           return "Aries";
         else return "Taurus";
         case 5:
           if(day>=0||day<=20)
             return "Taurus";
           else return "Gemini";
           case 6:
             if(day>=0||day<=20)
               return "Gemini";
             else return "Cancer";
             case 7:
               if(day>=0||day<=22)
                 return "Cancer";
               else return "Leo";
               case 8:
                 if(day>=0||day<=22)
                   return "Leo";
                 else return "Virgo";
                 case 9:
                   if(day>=0||day<=22)
                     return "Virgo";
                   else return "Libra";
                   case 10:
                     if(day>=0||day<=22)
                     return "Libra";
                   else return "Scorpio";
                   case 11:
                     if(day>=0||day<=21)
                       return "Scorpio";
                     else return "Sagittarius ";
                     case 12:
                       if(day>=0||day<=21)
                         return "Sagittarius";
                       else return "Capricorn";
                       default:
                         return "Error";
 }
 }
 public String getAstroElement()
 {  switch (month)
 { case 1:
   if(day>=0||day<=19)
     return "Earth";
   else return "Air";
   case 2:
     if(day>=0||day<=18)
       return "Air";
     else return "Water";
   case 3:
     if(day>=0||day<=20)
       return "Water";
     else return "Fire ";
   case 4:
     if(day>=0||day<=19)
       return "Fire";
     else return "Earth";
   case 5:
     if(day>=0||day<=20)
       return "Earth";
     else return "air";
   case 6:
     if(day>=0||day<=20)
       return "Air";
     else return "Water";
   case 7:
     if(day>=0||day<=22)
       return "Water";
     else return "Fire";
   case 8:
     if(day>=0||day<=22)
       return "Fire";
     else return "Earth";
   case 9:
     if(day>=0||day<=22)
       return "Earth";
     else return "Air";
   case 10:
     if(day>=0||day<=22)
       return "Air  ";
     else return "Water";
   case 11:
     if(day>=0||day<=21)
       return "Water";
     else return "Fire ";
   case 12:
     if(day>=0||day<=21)
       return "Fire";
     else return "Earth";
   default:
     return "Error";
 }
 }
    public String toString()
    { String s=" ";
        if(day<10)
        { s+="0";
        }
        s+=day+"/";
          if(month<10)
          { s+="0";
          }
      s += month + "/" + year;
      return s;

    }






}
