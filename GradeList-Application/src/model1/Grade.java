package model1;

public class Grade
{
  private int grade;
  private String ects;
  public static final int[] LEGAL_GRADES = {12, 10, 7, 4, 2, 0, -3};
  public static final String[] LEGAL_ECTSGRADES = {"A", "B", "C", "D", "E", "F",
      "Fx"};
  private String course;

  public Grade(int grade, String course)
  {
    if (!isLegalGrade(grade))
    {
      throw new IllegalArgumentException("Grade"+grade+"is Illegal");
    }
    this.grade = grade;
    this.course = course;
  }

  public Grade(String ects)
  {
    this.ects = ects;
  }

  public boolean isLegalGrade(int grade)
  {
    for (int i = 0; i < LEGAL_GRADES.length; i++)
    {
      if (grade == LEGAL_GRADES[i])

        return true;
    }
    return false;
  }

  public int getGrade()
  {
    return grade;
  }

  public String getEctsGrade()
  {
    for (int i = 0; i < LEGAL_ECTSGRADES.length; i++)
    {
      this.LEGAL_ECTSGRADES[i] = ects;
    }
    return ects;
  }

  public String getCourse()
  {
    return course;
  }

  public String transformGrade()
  {
    if (isLegalGrade(grade))
    {
      switch (grade)
      {
        case 12:
          this.ects = "A";
          break;
        case 10:
          this.ects = "B";
          break;
        case 7:
          this.ects = "C";
          break;
        case 4:
          this.ects = "D";
          break;
        case 2:
          this.ects = "E";
          break;
        case 0:
          this.ects = "F";
          break;
        case -3:
          this.ects = "Fx";
          break;
        default:
          this.ects = "Illegal grade";
      }
    }
    return ects;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Grade))
    {
      return false;
    }
    Grade other = (Grade) obj;
    return grade == other.grade && ects.equals(other.ects) && course
        .equals(other.course);
  }

  @Override public String toString()
  {
    String s = "";
    s = grade + "(" + transformGrade() + ")";

    return s;
  }

}

