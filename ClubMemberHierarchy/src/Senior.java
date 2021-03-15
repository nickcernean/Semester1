public  class Senior extends ClubMember
{
  public Senior(String name, int age, char gender)
  {
    super(name, age,gender);
  }

  @Override public String toString()
  {
    return "Senior{"+super.toString() +'}';
  }

  @Override public double getMembershipFee()
  {
    double fee = 10 * (100 - getAge());

    return fee;
  }
}
