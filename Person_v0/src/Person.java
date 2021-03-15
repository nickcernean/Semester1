public class Person
{
  private char gender;
  private Name name;
  private MyDate birthday;

  public Person(Name name, MyDate birthday, char gender)
  {
    setName(name);
    setBirthday(birthday);
    setGender(gender);
  }

  public Person(Name name, int i, char gender)
  {
    this(name, 0, gender);
  }
  public Name getName()
  {
    return name;
  }

  public MyDate getBirthday()
  {
    return birthday;
  }

  public char getGender()
  {
    return gender;
  }

  public void setName(Name name)
  {
    this.name = name;
  }

  public void setBirthday(MyDate birthday)
  {
    this.birthday = birthday;
  }

  public void setGender(char Gender)
  {
    this.gender = Gender;
  }

  public String getAgeStatus( int birthday)
  {
    String status = "";
    if (birthday < 0)
    {
      status = "Error";
    }
    else if (birthday <= 12)
    {
      status = "Child ";
    }
    else if (birthday <= 19)
    {
      status = "Teenager";
    }
    else if (birthday <= 65)
    {
      status = "Adult";
    }
    else
    {
      status = "Senior citizen";
    }
    return status;
  }

  public String toString()
  {
    return "Name:" + name + "\n Age:" + birthday + "\n Gender:" + gender;
  }

}
