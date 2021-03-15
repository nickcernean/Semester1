public class GradeList
{
  private int[] grades;
  private int actualNumberOfGrades;
  public static final int[] LEGAL_GRADES = {12, 10, 7, 4, 2, 0, -3};

  public GradeList(int maxNumberOfGrades)
  {
    this.grades = new int[maxNumberOfGrades];
    this.actualNumberOfGrades = 0;
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

  public void addGrade(int grade)
  {
    if (isLegalGrade(grade))
    {
      grades[actualNumberOfGrades] = grade;
      actualNumberOfGrades++;
    }

  }

  public int size()
  {
    return actualNumberOfGrades;
  }

  public int getGrade(int index)
  {
    return grades[index];
  }

  public int getMaxGrade()
  {
    int maxgrade = 0;
    for (int i = 0; i < grades.length; i++)
    {
      if (maxgrade < grades[i])
        maxgrade = grades[i];

    }
    return maxgrade;
  }

  public int getMinGrade()
  {
    int mingrade = 0;
    for (int grade : grades)
    {
      if (mingrade > grade)
        mingrade = grade;

    }
    return mingrade;
  }

  public double getAverage()
  {
    double sum = 0;
    for (int grade : grades)
    {
      sum += grade;
    }

    return sum / actualNumberOfGrades;

  }

  public int getGradeCount(int grade)
  {
    int count = 0;
    for (int j : grades)
    {
      if (j == grade)
        count++;

    }
    return count;
  }

  public String getGradeDistribution()
  {
    String but = "";
    int bet = getMaxGrade() - 1;
    for (int i = 0; i < actualNumberOfGrades; i++)
    {
      for (int j = 0; j < actualNumberOfGrades; j++)
      {
        if (bet == grades[j])
        {  bet=grades[j];
          but += bet + "(" + getGradeCount(bet) + "),";
          bet--;

        }
        else
        { if (bet <0)
            break;
        }
      }
     bet--;
    }
    but = "{" + getMaxGrade() + "(" + getGradeCount(getMaxGrade()) + ")," + but
        + getMinGrade() + "(" + getGradeCount(getMinGrade()) + ")" + "}";
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