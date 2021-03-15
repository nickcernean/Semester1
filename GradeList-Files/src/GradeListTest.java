import java.io.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class GradeListTest
{
  //    public static void printMethod(GradeList gradeList)
  //        throws FileNotFoundException
  //    {
  //      PrintWriter out = null;
  //      try
  //      {
  //        String sum = "";
  //        String filename1 = "D:/Desktop/text1.txt";
  //        File file1 = new File(filename1);
  //        out = new PrintWriter(filename1);
  //
  //        for (int i = 0; i < gradeList.size(); i++)
  //        {
  //          Grade var = gradeList.getGrade(i);
  //          sum += var.getCourse() + "; " + var.getGrade() + " \n";
  //        }
  //        out.print(sum);
  //        System.out
  //            .println("End reading data from file:" + file1.getAbsolutePath());
  //
  //      }
  //
  //      finally
  //      {
  //        out.close();
  //      }
  //    }

  public static void main(String[] args)
  {
    GradeList list = new GradeList();
    try
    {
      list.addGrade(new Grade(12, "SdJ"));
      list.addGrade(new Grade(-3, "MSE"));
      list.addGrade(new Grade(7, "SSE"));
      list.addGrade(new Grade(7, "RWD"));
      list.addGrade(new Grade(12, "RWD"));
      list.addGrade(new Grade(2, "SEP"));
      list.addGrade(new Grade(0, "SDJ"));
      list.addGrade(new Grade(0, "SEP"));
      list.addGrade(new Grade(4, "WS"));
      list.addGrade(new Grade(7, "SEP"));

      //          printMethod(list);

    }
    catch (IllegalArgumentException e)
    {
      System.out.println("Exception" + e.getMessage());
      e.printStackTrace();
    }

    //    list.removeGrade(0);
    //    list.removeGrade(list.size() - 1);
    //    list.removeGrade(2);
    //
    //    System.out.println("Grade:" + list);
    //    System.out.println("Average:" + list.getAverage());
    //    System.out.println("Grade 12 count:" + list.getGradeCount(12));
    //    System.out.println("Distribution:" + list.getGradeDistribution());

    //    String filename = "D:/Desktop/text.txt";
    //    File file = new File(filename);
    //    try
    //    {
    //      Scanner in = new Scanner(file);
    //      while (in.hasNext())
    //      {
    //        String line = in.nextLine();
    //        String[] token = line.split("; ");
    //        String course1 = token[0].trim();
    //        int grade = Integer.parseInt(token[1].trim());
    //        System.out.println("Grade:" + grade);
    //        System.out.println("Course:" + course1);
    //        list.addGrade(new Grade(grade, course1));
    //      }
    //      in.close();
    //      System.out.println("End reading data from file:" + file.getAbsolutePath());
    //    }
    //    catch (FileNotFoundException e)
    //    {
    //      e.printStackTrace();
    //    }

    String filename = "test.bin ";

    ObjectOutputStream out = null;
    try
    {
      File file = new File(filename);
      FileOutputStream fos = new FileOutputStream(file);
      out = new ObjectOutputStream(fos);
      out.writeObject(list);

      for (int i = 0; i < list.size(); i++)
      {
        out.writeObject(i);
      }
    }
    catch (IOException e)
    {
      System.out.println("Exception: " + filename);
    }
    finally
    {
      try
      {
        out.close();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
    System.out.println("Done writing");

    System.out.println("Done writing, now reading");
    String filename1 = "test.bin ";

    ObjectInputStream in = null;
    try
    {
      File file1 = new File(filename1);
      FileInputStream fis = new FileInputStream(file1);
      in = new ObjectInputStream(fis);

      GradeList list1 = (GradeList) in.readObject();
      System.out.println(list1);

    }
    catch (IOException | ClassNotFoundException e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        in.close();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }

  }
}




