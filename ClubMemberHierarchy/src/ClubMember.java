public abstract class ClubMember
{
  private String name;
  private int age;
  private char gender;

  public ClubMember(String name, int age, char gender)
  {
    setAge(age);
    this.name = name;
    setGender(gender);
  }

  public char getGender()
  {
    return gender;
  }

  public void setGender(char gender)
  {
    this.gender = gender;
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

  @Override public String toString()
  {
    return "Name='" + name + '\'' + ", Age=" + age + ", Gender=" + gender;
  }

  public abstract double getMembershipFee();
}




