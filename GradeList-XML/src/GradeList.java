import java.util.ArrayList;
import java.io.Serializable;
public class GradeList implements Serializable
{
  private ArrayList<Grade> grades;
  private int actualNumberOfGrades;

  public GradeList()
  {
    this.grades = new ArrayList<>();
    this.actualNumberOfGrades = 0;

  }

  public void addGrade(Grade grade)
  {
    this.grades.add(grade);
    actualNumberOfGrades++;
  }

  public void removeGrade(int index)
  {
    grades.remove(index);
  }

  public void addGrade(int index, Grade grade)
  {
    grades.add(index, grade);
  }

  public int size()
  {
    return grades.size();
  }

  public Grade getGrade(int index)
  {
    return grades.get(index);
  }

  public Grade getMaxGrade()
  {
    int maxgrade = -3;
    for (int i = 0; i < size(); i++)
    {
      if (maxgrade < grades.get(i).getGrade())
        maxgrade = grades.get(i).getGrade();
    }
    return new Grade(maxgrade, "");
  }

  public Grade getMinGrade()
  {
    int mingrade = 12;
    for (int i = 0; i < size(); i++)
    {
      if (mingrade > grades.get(i).getGrade())
        mingrade = grades.get(i).getGrade();

    }
    return new Grade(mingrade, "");
  }

  public double getAverage()
  {
    double avg = 0;
    double sum = 0;
    for (int i = 1; i < size(); i++)
    {
      sum += grades.get(i).getGrade();
    }
    avg = sum / (double) actualNumberOfGrades;
    return avg;

  }

  public int getGradeCount(int grade)
  {
    int count = 0;
    for (int i = 0; i < grades.size(); i++)
    {
      if (grades.get(i).getGrade() == grade)
        count++;

    }
    return count;
  }

  public String getGradeDistribution()
  {
    String bet = "";
    for (int i = 0; i < Grade.LEGAL_GRADES.length; i++)
    {
      bet += Grade.LEGAL_GRADES[i] + "(" + getGradeCount(Grade.LEGAL_GRADES[i])
          + "),";
    }
    return bet;
  }

  @Override public String toString()
  {
    String all = null;
    for (int i = 0; i < grades.size(); i++)
    {
      if (i == 0)
        all = "{" + grades.get(i);
      else
        all += ", " + grades.get(i);
    }
    return all + "}";
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof GradeList))
    {
      return false;
    }
    GradeList other = (GradeList) obj;
    if (actualNumberOfGrades != other.actualNumberOfGrades)
    {
      return false;
    }
    for (int i = 0; i < actualNumberOfGrades; i++)
    {
      if (!grades.get(i).equals(other.grades.get(i)))
      {
        return false;
      }
    }
    return true;
  }

}
