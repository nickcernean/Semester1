public class GradeListTest
{
  public static void main(String[] args)
  {
    GradeList list = new GradeList(11);
    list.addGrade(10);
    list.addGrade(-3);
    list.addGrade(7);
    list.addGrade(7);
    list.addGrade(10);
    list.addGrade(10);
    list.addGrade(0);
    list.addGrade(2);
    list.addGrade(4);
    list.addGrade(7);
    list.removeGrade(0);
    list.removeGrade(list.size()-1);
    list.removeGrade(2);
    list.addGrade(0,10);
   list.addGrade(list.size(),2);
    list.addGrade(2,0);
    System.out.println("Grade:" + list);
    System.out.println("MAx:" + list.getMaxGrade());

    System.out.println("Average:" + list.getAverage());
    System.out.println("Grade 12 count:" + list.getGradeCount(12));
    System.out.println("Distribution:" + list.getGradeDistribution());




  }
}

