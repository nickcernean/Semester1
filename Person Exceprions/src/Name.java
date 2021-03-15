public class Name
{
  private String firstName;
  private String lastName;

  public Name(String firstName, String lastName)
  {
    if ((firstName == null && lastName == null) || (firstName.length() < 3 || lastName.length() < 3))
    {
      throw new IllegalArgumentException("Illegal name");
    }
    this.lastName = lastName;
    this.firstName = firstName;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;

  }

  public String getFullName()
  {
    return firstName + " " + lastName;
  }

  public String getFormalName()
  {
    return lastName + "," + firstName;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Name))
    {
      return false;
    }
    Name other = (Name) obj;
    return firstName.equals(other.firstName) && lastName.equals(other.lastName);
  }

  @Override public String toString()
  {
    return "Name{" + "firstName='" + firstName + '\'' + ", lastName='"
        + lastName + '\'' + '}';
  }
}

