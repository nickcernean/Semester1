 public class SkypeLesson extends OnlineLesson
{
  private String inviteLink;

  public SkypeLesson(String topic, Date date, Time start, Time end, File[] res,
      boolean screenShare, String link)
  {
    super(topic, date, start, end, res, screenShare);
    this.inviteLink = link;
  }

  public String getInviteLink()
  {
    return inviteLink;
  }

  public String nameOfSoftware()
  {
    return "SkypeLesson";
  }

  @Override public String toString()
  {
    return "\nOnline lesson on Skype/Invitation link: " + inviteLink+super.toString();
  }
}