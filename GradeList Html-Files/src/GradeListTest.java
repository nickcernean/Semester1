import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GradeListTest
{

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

    }
    catch (IllegalArgumentException e)
    {
      System.out.println("Exception" + e.getMessage());
      e.printStackTrace();
    }
    //Reading from txt file
    String filename = "D:/Desktop/before.txt";
    File file = new File(filename);
    PrintWriter out = null;
    String line="";
    try
    {
      Scanner in = new Scanner(file);
      while (in.hasNext())
      {
         line += "\n"+in.nextLine();

      }
      in.close();
      System.out
          .println("End reading data from file:" + file.getAbsolutePath());


      String filename2 = "D:/Desktop/after1.html";
      File fileout = new File(filename2);
      out = new PrintWriter(fileout);

        line=line.replace("$title","GradeListEx");
        line=line.replace("$header","Grade List");
        line=line.replace("$paragraph1","This is a GradeList example");
        line=line.replace("$tableHeader1","Course");
        line=line.replace("$tableHeader2","Grade");


        for (int i = 0; i < list.size(); i++)
        {
          String grade = String.valueOf(list.getGrade(i));
          line = line.replaceFirst("tableData1", list.getGrade(i).getCourse());
          line = line.replaceFirst("tableData2", grade);
        }

      System.out.println(line);
     out.print(line);
      System.out.println("End writing data from file:" + fileout.getAbsolutePath());
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
    finally
    {
      out.close();
    }


  }
}





