import java.util.ArrayList;
import java.util.Arrays;

public class Lesson
{

  private String topic;
  private Date date;
  private File[] resources;
  private Time start;
  private Time end;

  public Lesson(String topic, Date date, Time start, Time end, File[] res)
  {
    this.topic = topic;
    if (date == null)
    {
      throw new IllegalArgumentException("The date is null!");
    }
    this.date = date.copy();
    if (hasValidTime(start, end))
    {
      this.start = start;
      this.end = end;
    }
    else
      throw new IllegalArgumentException(
          "Illegal start/end time, try one more time!");
    this.resources = res;
  }

  public String getTopic()
  {
    return topic;
  }

  public Date getDate()
  {
    return date;
  }

  public File[] getResources()
  {
    return resources;
  }

  public ArrayList<File> getAllPDFs()
  {
    ArrayList<File> pdfFiles = new ArrayList<>();
    for (int i = 0; i < resources.length; i++)
    {
      if (resources[i].isPDF())
      {
        pdfFiles.add(resources[i]);
      }
    }
    return pdfFiles;
  }

  public Time getDuration()
  {
    return start.timeTo(end);
  }

  public static boolean hasValidTime(Time startTime, Time endTime)
  {
    Time startOne = new Time(8, 20, 0);
    Time endOne = new Time(21, 15, 0);
    if (startTime.isBefore(startOne) || endOne.isBefore(endTime) || endTime
        .isBefore(startTime))
    {
      return false;
    }
    return true;
  }

  public void delayBy(int minutes)
  {
    if (minutes < 120 && hasValidTime(
        new Time(start.convertToSeconds() + minutes * 60), end))
    {
      start.tic(minutes * 60);
    }
    else
      System.out.println("Delay more than 120 minutes or Invalid time ");
  }

  public String getDateTimeString()
  {
    return date + " " + start + "-" + end;
  }

  @Override public String toString()
  {
    return "\nLesson: " + topic + "\nTime: " + getDateTimeString()
        + "\nResources:" + Arrays.toString(resources) + "\n";
  }
}