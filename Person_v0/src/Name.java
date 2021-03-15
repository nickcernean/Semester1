public class Name
{ private String firstName;
private String lastName;
public Name( String firstName,String lastName)
{ this.lastName=lastName;
this.firstName=firstName;
}
public Name(String fullname)
{
}
public String getFirstName()
{
   return firstName;
}
public String getLastName()
{  return lastName;

}
public String getFullName()
{ return firstName+lastName;
}
public String getFormalName()
{ return lastName+","+firstName;
}
  public String toString()
  {  return getFullName();
  }
}
