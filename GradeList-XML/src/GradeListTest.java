import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

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

    String filename = "D:/Desktop/before.xml";
    File file = new File(filename);
    PrintWriter out = null;
    try
    {
      out = new PrintWriter(file);
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }

    String xml = "";
    xml += "<?xml version=\"1.0\" encoding=\"UTF - 8\"" + "standalone=\"no\"?>\n ";
    xml+="<gradelist>";
    for(int i=0;i< list.size();i++)
    {
      xml += "\n<course>" +list.getGrade(i).getCourse()+"</course>";
      xml += "\n<grade>" +list.getGrade(i)+"</grade>";

    }
    xml+="\n</gradelist>";

    out.print(xml);

    System.out.println("End writing data"+file.getAbsolutePath());
  }
}