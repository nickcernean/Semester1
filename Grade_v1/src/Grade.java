public class Grade
{
  private int grade;

  public Grade(int grade)
  {
    this.grade = grade;
    if (getEctsGrade().equals("Illegal grade"))
    {
      this.grade = -3;
    }

  }

  public Grade(String ectsGrade)
  {
    if (!getEctsGrade().equals(ectsGrade))
    {
      this.grade = -3;
    }
    switch (ectsGrade)
    {
      case "A":
        this.grade = 12;
        break;
      case "B":
        this.grade = 10;
        break;
      case "C":
        this.grade = 7;
        break;
      case "D":
        this.grade = 4;
        break;
      case "E":
        this.grade = 2;
        break;
      case "F":
        this.grade = 0;
        break;
      case "Fx":
        this.grade = -3;
        break;

    }
  }

  public int getGrade()
  {
    return grade;
  }

  public String getEctsGrade()
  {
    String ects = "Illegal grade";
    switch (grade)
    {
      case -3:
        ects = "F";
        break;
      case 0:
        ects = "Fx";
        break;
      case 2:
        ects = "E";
        break;
      case 4:
        ects = "D";
        break;
      case 7:
        ects = "C";
        break;
      case 10:
        ects = "B";
        break;
      case 12:
        ects = "A";
        break;
    }
    return ects;
  }

  @Override public String toString()
  {
    return grade + "{" + getEctsGrade() + "}";
  }
}
