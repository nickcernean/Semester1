public class Child
{
  private String name;
  private int age;

  public Child(String name, int age)
  {
    this.name = name;
    setAge(age);
  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Child))
    {
      return false;
    }
    Child other = (Child) obj;
    return name.equals(other.name) && age == other.age;
  }

 @Override public String toString()
  {
    String s = "\nName:" + name + "\n Age" + age;
    return s;
  }

}
