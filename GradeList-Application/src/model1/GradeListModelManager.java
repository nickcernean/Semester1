package model1;

public class GradeListModelManager implements GradeListModel
{
  private GradeList gradeList;

  public GradeListModelManager()
  {
    this.gradeList = new GradeList();
  }

  @Override public int numberOfGrades()
  {
    return gradeList.numberOfGrades();
  }

  @Override public void addGrade(Grade grade)
  {
    gradeList.addGrade(grade);
  }

  @Override public void removeGrade(int index)
  {
    gradeList.removeGrade(index);
  }

  @Override public Grade getGrade(int index)
  {
    return gradeList.getGrade(index);
  }

  @Override public Grade getMaxGrade()
  {
    return gradeList.getMaxGrade();
  }

  @Override public Grade getMinGrade()
  {
    return gradeList.getMinGrade();
  }

  @Override public double getAverage()
  {
    return gradeList.getAverage();
  }

  @Override public String getAll()
  {
    return gradeList.toString();
  }

}
