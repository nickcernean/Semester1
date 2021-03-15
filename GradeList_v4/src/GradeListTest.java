public class GradeListTest
{
  public static void main(String[] args)
  {
    GradeList list = new GradeList();
    list.addGrade(new Grade(12));
    list.addGrade(new Grade(-3));
    list.addGrade(new Grade(7));
    list.addGrade(new Grade(7));
    list.addGrade(new Grade(13));
    list.addGrade(new Grade(2));
    list.addGrade(new Grade(0));
    list.addGrade(new Grade(0));
    list.addGrade(new Grade(4));
    list.addGrade(new Grade(7));

    list.removeGrade(0);
    list.removeGrade(list.size()-1);
    list.removeGrade(2);
    list.addGrade(0,new Grade(10));
    list.addGrade(list.size(),new Grade(2));
    list.addGrade(2,new Grade(0));

    System.out.println("Grade:" + list);
    System.out.println("Average:" + list.getAverage());
    System.out.println("Grade 12 count:" + list.getGradeCount(12));
    System.out.println("Distribution:" + list.getGradeDistribution());





  }
}


