public class Person
{private String name;
  private int  age;
  private char gender;
  public Person(String name,int age,char gender)
  { setName(name);
    setAge(age);
    setGender(gender);
  }
  public Person(String name, char gender)
  { this(name,0,gender);
  }
  public Person(char gender)
  { this(null,0,gender);
  }
  public String getName()
  { return name;
  }
  public int getAge()
  { return age;
  }
  public char getGender()
  { return gender;
  }
  public void setName(String Name)
  { this.name=Name;
  }
  public void setAge(int Age)
  { this.age=Age;
  }
  public void setGender(char Gender)
  { this.gender=Gender;
  }
  public String toString()
  { return "Name:"+name+"\n Age:"+age+"\n Gender:"+gender;
  }
}
