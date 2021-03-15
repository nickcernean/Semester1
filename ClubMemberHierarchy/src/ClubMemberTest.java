public class ClubMemberTest
{
  public static void main(String[] args)
  {
    ClubMember[] clubMembers = new ClubMember[3];
    clubMembers[0] = new Junior("Nick", 19, 'B');
    clubMembers[1] = new Senior("Angelo", 50, 'B');
    clubMembers[2] = new OldBoys("Joseph", 26, 'B', 11);
    for (int i = 0; i < clubMembers.length; i++)
    {
      System.out.println(clubMembers[i].getMembershipFee());

    }
  }
}
