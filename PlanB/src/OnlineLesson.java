public abstract class OnlineLesson extends Lesson
{
  private boolean screenshare;

  public OnlineLesson(String topic, Date date, Time start, Time end, File[] res,
      boolean screenShare)
  {
    super(topic, date, start, end, res);
    this.screenshare = screenShare;
  }

  private boolean teacherWillShareScreen()
  {
    return screenshare;
  }

  public abstract String nameOfSoftware();

  @Override public String toString()
  {
    return "\nTeacher will share screen: " + screenshare+super.toString() ;
  }
}