public class Person
{
  private Name name;
  private final MyDate birthday;
  private char gender;

  public Person(Name name, MyDate birthday, char gender)
  {
    setName(name);
    this.birthday = birthday.copy();
    setGender(gender);
  }

  public Person(Name name, char gender)
  {
    this(name, new MyDate(), gender);
  }

  public Person(char gender)
  {
    this(null, new MyDate(), gender);
  }

  public Name getName()
  {
    return name;
  }

  public void setName(Name name)
  {
    this.name = name;
  }

  public MyDate getBirthday()
  {
    return birthday;
  }

  public char getGender()
  {
    return gender;
  }

  public void setGender(char gender)
  {
    this.gender = gender;
  }

  public int getAge()
  {
    MyDate today = new MyDate();
    return today.yearsBetween(birthday);
  }

  public String getAgeStatus()
  {
    String status = "";
    if (getAge() < 0)
    {
      status = "Error";
    }
    else if (getAge() <= 12)
    {
      status = "Child ";
    }
    else if (getAge() <= 19)
    {
      status = "Teenager";
    }
    else if (getAge() <= 65)
    {
      status = "Adult";
    }
    else
    {
      status = "Senior citizen";
    }
    return status;
  }

  public String getStatus()
  {
    if (getAge() < 0)
    {
      return "Error";
    }
    else if ((getAge() <= 18) && (gender == 'M' || gender == 'm'))
    {
      return "Boy";
    }
    else if ((getAge() >= 18) && (gender == 'M' || gender == 'm'))
    {
      return "Man";
    }
    else if ((getAge() <= 18) && (gender == 'F' || gender == 'f'))
    {
      return "Girl";
    }
    else if ((getAge() >= 18) && (gender == 'F' || gender == 'f'))
    {
      return "Woman";
    }
    return "Error";
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person))
    {
      return false;
    }
    Person other = (Person) obj;
    if (name == null)
    {
      return name == other.name && birthday.equals(other.birthday)
          && gender == other.gender;
    }
    return name.getFullName().equals(other.name.getFullName()) && birthday
        .equals(other.birthday) && gender == other.gender;

  }

  public String toString()
  {
    return "Name:" + name.getFullName() + "birthday:" + birthday + "\n Age:"
        + getAge() + "\n Gender:" + gender;
  }

}
