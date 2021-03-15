public class Person
{
  private String name;
  private int age;
  private char gender;

  public Person(String name, int age, char gender)
  {
    setName(name);
    setAge(age);
    setGender(gender);
  }

  public Person(String name, char gender)
  {
    this(name, 0, gender);
  }

  public Person(char gender)
  {
    this(null, 0, gender);
  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public char getGender()
  {
    return gender;
  }

  public void setName(String Name)
  {
    this.name = Name;
  }

  public void setAge(int Age)
  {
    this.age = Age;
  }

  public void setGender(char Gender)
  {
    this.gender = Gender;
  }

  public String getAgeStatus()
  {
    String status = "";
    if (age < 0)
    {
      status = "Error";
    }
    else if (age <= 12)
    {
      status = "Child ";
    }
    else if (age <= 19)
    {
      status = "Teenager";
    }
    else if (age <= 65)
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
    if (age < 0)
    {
      return "Error";
    }
    else if ((age <= 18) && (gender == 'M' || gender == 'm'))
    {
      return "Boy";
    }
    else if ((age >= 18) && (gender == 'M' || gender == 'm'))
    {
      return "Man";
    }
    else if ((age <= 18) && (gender == 'F' || gender == 'f'))
    {
      return "Girl";
    }
    else if ((age >= 18) && (gender == 'F' || gender == 'f'))
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
    if (this.name != null)
    {
      return  gender==other.gender&&age==other.age&&this.name.equals(other.name);
    }

    else
      return gender==other.gender&&age==other.age&&other.name == null;
  }

  public String toString()
  {
    return "Name:" + name + "\n Age:" + age + "\n Gender:" + gender;
  }

}