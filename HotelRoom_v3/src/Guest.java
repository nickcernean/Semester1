public class Guest
{
  private String name;
  private long phone;

  public Guest(String name,long phone)
  {
    this.name = name;
    this.phone = phone;
  }

  public String getName()
  {
    return name;
  }

  public long getPhone()
  {
    return phone;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Guest))
    {return false;}
    Guest other=(Guest)obj;
    return name.equals(other.name)&&phone== other.phone;
  }
  public String toString()
  { String all=name+","+phone;
    return all;

  }
}

