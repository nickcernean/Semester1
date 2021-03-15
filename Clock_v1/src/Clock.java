public class  Clock
{ private int hour;
private int minute;
private int second;
public Clock(int hour,int minute,int second)
{ this.hour=hour;
this.minute=minute;
this.second=second;
}
public void set(int hour,int minute,int second)
{ this.hour=hour;
this.minute=minute;
this.second=second;
}
public int getHour()
{ return hour;
 }
 public int getMinute()
  { return minute;
  }
public int getSecond()
{ return second;
}
public int getTimeInSeconds()
{ return hour*3600+minute*60+second;
}
public String getSimpleTime()
{
  return hour + ":" + minute;
}
  public String toString()
  { return hour+":"+minute;
  }


}
