public class GradeListTest
{
  public static void main(String[] args)
  {
    GradeList list = new GradeList();
    try
    {
      list.addGrade(new Grade(12, "SdJ"));
      list.addGrade(new Grade(-3,"MSE"));
      list.addGrade(new Grade(7,"SSE"));
      list.addGrade(new Grade(7,"RWD"));
      list.addGrade(new Grade(12,"RWD"));
      list.addGrade(new Grade(2,"SEP"));
      list.addGrade(new Grade(0,"SDJ"));
      list.addGrade(new Grade(0,"SEP"));
      list.addGrade(new Grade(4,"WS"));
      list.addGrade(new Grade(7,"SEP"));
    }
    catch (IllegalArgumentException e)
    {
      System.out.println("Exception"+e.getMessage());
      e.printStackTrace();
    }



    list.removeGrade(0);
    list.removeGrade(list.size() - 1);
    list.removeGrade(2);

    System.out.println("Grade:" + list);
    System.out.println("Average:" + list.getAverage());
    System.out.println("Grade 12 count:" + list.getGradeCount(12));
    System.out.println("Distribution:" + list.getGradeDistribution());

  }
}


