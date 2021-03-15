public class Student
{
  private String name;
  private String nationality;
  private int studyNumber;

  public Student(String name, String nationality,int studyNumber)
  { if (name == null || name.equals(""))
  {
    System.out.println("Unknown");
  }
    setName(name);
    if (nationality == null || nationality.length() != 2)
    {
      nationality = "";
    }
    setNationality(nationality);
    setStudyNumber(studyNumber);


  }

  public Student(String name, int studyNumber)
  {
    setName(name);
    setNationality(null);
    setStudyNumber(studyNumber);
  }

  public void setName(String Name)
  {
    this.name=Name;
  }

  public void setNationality(String Nationality)
  {
   this.nationality=Nationality;
  }

  public void setStudyNumber(int StudyNumber)
  {
    this.studyNumber = StudyNumber;
  }

  public String getName()
  {
    return name;
  }

  public String getNationality()
  {
    return nationality;
  }

  public int getStudyNumber()
  {
    return studyNumber;
  }

  public boolean hasAKnownNationality()
  {
    return nationality != null;
  }

  public boolean hasSameNationalityAs(Student otherStudent)
  {
    String i = "";
    if (otherStudent.hasSameNationalityAs(otherStudent))
    {
      i = "True";
    }
    else
    {
      i = "False";
    }
    return true;
  }

  public String toString()
  {
    return name + "(" + nationality + ")" + studyNumber;

  }


}
