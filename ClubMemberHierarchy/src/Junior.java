public class Junior extends ClubMember
{

  public Junior(String name, int age, char gender)
  {
    super(name, age, gender);


  }



  @Override public String toString()
  {
    return "Junior{" + super.toString() + '}';
  }

  public double getMembershipFee()
  {
    double fee = 0;
    if (getGender() == 'B')
    {
      fee = 400;
    }
    else if (getGender() == 'G')
    {
      fee = 300;
    }
    return fee;
  }
}
