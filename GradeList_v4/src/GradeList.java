import java.util.ArrayList;

public class GradeList
{
  private ArrayList<Grade> grades;
  private int actualNumberOfGrades;

  public GradeList()
  {
    this.grades = new ArrayList<>();

  }

  public void addGrade(Grade grade)
  {
    this.grades.add(grade);
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
    return new Grade(maxgrade);
  }

  public Grade getMinGrade()
  {
    int mingrade = 12;
    for (int i = 0; i < size(); i++)
    {
      if (mingrade > grades.get(i).getGrade())
        mingrade = grades.get(i).getGrade();

    }
    return new Grade(mingrade);
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
    for (int i = 0; i < actualNumberOfGrades; i++)
    {
      if (grades.get(i).getGrade() == grade)
        count++;

    }
    return count;
  }

  public String getGradeDistribution()
  {
    String but = "";
    for (int i = 0; i < Grade.LEGAL_GRADES.length; i++)
    {
      but += Grade.LEGAL_GRADES[i] + "(" + getGradeCount(Grade.LEGAL_GRADES[i])
          + "),";
    }
    return but;
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

}
