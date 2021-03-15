public class OldBoys extends ClubMember
{
  private int yearsOfMembership;

  public OldBoys(String name, int age, char gender, int yearsOfMembership)
  {
    super(name, age, gender);
    setYearsOfMembership(yearsOfMembership);
  }

  public int getYearsOfMembership()
  {
    return yearsOfMembership;
  }

  public void setYearsOfMembership(int yearsOfMembership)
  {
    this.yearsOfMembership = yearsOfMembership;
  }

  @Override public String toString()
  {
    return "OldBoys{" + super.toString() + ", Years Of Membership="
        + yearsOfMembership + '}';
  }

  public double getMembershipFee()
  {
    double fee = 0;
    if (yearsOfMembership < 5)
    {
      fee = 300;
    }
    if (yearsOfMembership > 5 && yearsOfMembership <= 9)
    {
      fee = 200;
    }
    if (yearsOfMembership > 9)
    {
      return fee = 100;
    }
    return fee;
  }
}
