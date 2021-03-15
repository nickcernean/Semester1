public class GradeList
{
  private Grade[] grades;
  private int actualNumberOfGrades;

  public GradeList(int maxNumberOfGrades)
  {
    this.grades = new Grade[maxNumberOfGrades];
    this.actualNumberOfGrades = 0;
  }

  public void addGrade(Grade grade)
  {
    grades[actualNumberOfGrades] = grade;
    actualNumberOfGrades++;
  }

  public void removeGrade(int index)
  {
    for (int i = grades.length - 1; i > index; i--)
      grades[i] = grades[i - 1];

  }

  public void addGrade(int index, Grade grade)
  {
    grades[index] = grade;

  }

  public int size()
  {
    return actualNumberOfGrades;
  }

  public Grade getGrade(int index)
  {
    return grades[index];
  }

  public Grade getMaxGrade()
  {
    int maxgrade = -3;
    for (int i = 0; i < size(); i++)
    {
      if (maxgrade < grades[i].getGrade())
        maxgrade = grades[i].getGrade();
    }
    return new Grade(maxgrade);
  }

  public Grade getMinGrade()
  {
    int mingrade = 12;
    for (int i = 0; i < size(); i++)
    {
      if (mingrade > grades[i].getGrade())
        mingrade = grades[i].getGrade();

    }
    return new Grade(mingrade);
  }

  public double getAverage()
  {
    double avg = 0;
    double sum = 0;
    for (int i = 1; i <size(); i++)
    {
      sum += grades[i].getGrade();
    }
    avg = sum / (double) actualNumberOfGrades;
    return avg;

  }

  public int getGradeCount(int grade)
  {
    int count = 0;
    for (int i = 0; i < actualNumberOfGrades; i++)
    {
      if (grades[i].getGrade() == grade)
        count++;

    }
    return count;
  }

  public String getGradeDistribution()
  {
    String but = "";
    for (int i = 0; i < Grade.LEGAL_GRADES.length; i++)
    {
          but += Grade.LEGAL_GRADES[i] + "(" + getGradeCount(Grade.LEGAL_GRADES[i]) + "),";
    }
    return but;
  }

  @Override public String toString()
  {
    String all = null;
    for (int i = 0; i < grades.length; i++)
    {
      if (i == 0)
        all = "{" + grades[i];
      else
        all += ", " + grades[i];
    }
    return all + "}";
  }

}
