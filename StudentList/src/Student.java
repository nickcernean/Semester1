public class Student
{
  private String name;
  private int studyNumber;
  private String nationality;
  private int groupNumber;
  private MyDate birthday;

  public Student(String name, String nationality, int studyNumber,
      int groupNumber, MyDate birthday)
  {
    this.name = name;
    this.nationality = nationality;
    this.studyNumber = studyNumber;
    this.groupNumber = groupNumber;
    this.birthday = birthday.copy();

  }

  public String getName()
  {
    return name;
  }

  public int getStudyNumber()
  {
    return studyNumber;
  }

  public String getNationality()
  {
    return nationality;
  }

  public int getGroupNumber()
  {
    return groupNumber;
  }

  public MyDate getBirthday()
  {
    return birthday;
  }

  public int getAge()
  {
    return birthday.yearsBetween(getBirthday());
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof MyDate))
    {
      return false;
    }
    Student other = (Student) obj;
    return studyNumber == other.studyNumber && groupNumber == other.groupNumber
        && birthday.equals(other.birthday) && name.equals(other.name)
        && nationality.equals(other.nationality);
  }

 @Override public String toString()
  {
    return name + "(" + nationality + ")" + studyNumber;

  }
}
