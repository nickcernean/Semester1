package model;

public class GradeListModelManager implements GradeListModel
{
  private GradeList gradeList;
  private boolean loggedIn;

  public GradeListModelManager()
  {
    this.gradeList = new GradeList(10);
    createDummyData();
    this.loggedIn = false;
  }

  public void createDummyData()
  {
    try
    {
      String[] courses = {"SDJ", "RWD", "SEP", "MSE", "DBS"};
      for (int i = 0; i < courses.length; i++)
      {
        int randomIndex = (int) (Math.random() * 7);
        int grade = Grade.LEGAL_GRADES[randomIndex];
        gradeList.addGrade(new Grade(grade, courses[i]));
      }
    }
    catch (Exception e)
    {

    }
  }

  public int gradeListSize()
  {
    return gradeList.size();
  }

  public void addGrade(Grade grade)
  {
    gradeList.addGrade(grade);
  }

  public void removeGrade(int index)
  {
    gradeList.removeGrade(index);
  }

  @Override public void removeGrade(Grade grade)
  {
    gradeList.removeGrade(grade);
  }

  public Grade getGrade(int index)
  {
    return gradeList.getGrade(index);
  }

  public Grade getMaxGrade()
  {
    return gradeList.getMaxGrade();
  }

  public Grade getMinGrade()
  {
    return gradeList.getMinGrade();
  }

  public double getAverageGrade()
  {
    return gradeList.getAverage();
  }

  public boolean isLegalGrade(int grade)
  {
    return Grade.isLegalGrade(grade);
  }

  public int getGradeCount(int grade)
  {
    return gradeList.getGradeCount(grade);
  }

  public void addGrade(int index, Grade grade)
  {
    gradeList.addGrade(index, grade);
  }

  public String getGradeDistribution()
  {
    return gradeList.getGradeDistribution();
  }

  @Override public String validateLogin(String user, String password)
  {
    if (user == null || user.isEmpty())
    {
      return "Username cannot be empty";
    }
    if (password == null || password.isEmpty())
    {
      return "Username cannot be empty";
    }

    return null;
  }

  @Override public boolean isLoggedIn()
  {
    return loggedIn;
  }

  @Override public boolean logIn(String user, String password)
  {
    return this.loggedIn = validateLogin(user, password) == null;
  }
}
