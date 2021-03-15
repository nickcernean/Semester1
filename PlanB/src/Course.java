import java.util.ArrayList;
import java.util.Arrays;

public class Course
{
  private String name;
  private ArrayList<Lesson> schedule;

  public Course(String name)
  {
    this.name = name;
    this.schedule = new ArrayList<>();
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfLessons()
  {
    return schedule.size();
  }

  public void addLesson(Lesson lesson)
  {
    schedule.add(lesson);
  }

  public void removeLesson(Lesson lesson)
  {
    schedule.remove(lesson);
  }

  public boolean hasLessonOnDate(Date date)
  {
    for (int i = 0; i < schedule.size(); i++)
    {
      if (schedule.get(i).getDate().equals(date))
        return true;
    }
    return false;
  }

  public ArrayList<Lesson> getAllLessons()
  {
    return schedule;
  }

  public ArrayList<String> getAllTopics()
  {
    ArrayList<String> topics = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++)
    {
      topics.add(schedule.get(i).getTopic());
    }
    return topics;
  }

  public ArrayList<OnlineLesson> getOnlineLessons()
  {

    ArrayList<OnlineLesson> onlineLessonsList = new ArrayList<>();
    for (int i = 0; i < getNumberOfLessons(); i++)
    {
      if (schedule.get(i) instanceof OnlineLesson)
      {
        OnlineLesson onlineLesson = (OnlineLesson) schedule.get(i);
        onlineLessonsList.add(onlineLesson);
      }
    }
    return onlineLessonsList;
  }

  public ArrayList<SkypeLesson> getSkypeLessons()
  {
    ArrayList<SkypeLesson> skypeLessonsList = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++)
    {
      if (schedule.get(i) instanceof SkypeLesson)
      {
        SkypeLesson skypeLesson = (SkypeLesson) schedule.get(i);
        skypeLessonsList.add(skypeLesson);
      }
    }
    return skypeLessonsList;
  }

  public ArrayList<DiscordLesson> getDiscordLessons()
  {
    ArrayList<DiscordLesson> discordLessonsList = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++)
    {
      if (schedule.get(i) instanceof DiscordLesson)
        discordLessonsList.add((DiscordLesson) schedule.get(i));
    }
    return discordLessonsList;
  }

  public ArrayList<DiscordLesson> getAllDiscordLessonsWithVoice()
  {
    ArrayList<DiscordLesson> discordLessonsListVoice = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++)
    {
      if (schedule.get(i) instanceof DiscordLesson && ((DiscordLesson) schedule
          .get(i)).usesVoiceChannel())

        discordLessonsListVoice.add((DiscordLesson) schedule.get(i));
    }
    return discordLessonsListVoice;
  }

  public ArrayList<File> getAllResources()
  {
    ArrayList<File> resourceFiles = new ArrayList<>();
    for (int j = 0; j < getNumberOfLessons(); j++)
    {
      for (int i = 0; i < schedule.get(j).getResources().length; i++)
      {
        if (!resourceFiles.contains(schedule.get(j).getResources()[i]))
        {
          resourceFiles.add((schedule.get(j).getResources())[i]);
        }
      }
    }
    return resourceFiles;
  }

  @Override public String toString()
  {
    Lesson[] schedule01 = new Lesson[schedule.size()];
    for (int i = 0; i < schedule.size(); i++)
    {
      schedule01[i] = schedule.get(i);
    }
      return "\nCourse:" + name + "\n Schedule:" + Arrays.toString(schedule01);

  }
}
