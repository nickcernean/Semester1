public class MaritalStatus
{
  private Person name;
  private String maritalStatus;
  private int numberOfChildren;

  public MaritalStatus(Person name, String maritalStatus, int numberOfChildren)
  {
    this.name = name;
    this.maritalStatus = maritalStatus;
    this.numberOfChildren = numberOfChildren;
  }

  public void setMaritalStatus(String status)
  {
    String s = "";

    switch (status)
    {
      case "Single":
        s = "Single";
        break;
      case "Married":
        s = "Married";
        break;
      case "Divorced":
        s = "Divorced";
        break;
      case "Widowed":
        s = "Widowed";
        break;
    }
  }

  public void addChild()
  {
    for (int i = 0; i < numberOfChildren; i++)
    {
      numberOfChildren++;
    }
  }

  public void isSingle()
  {
    if (maritalStatus.equals("Single"))
      System.out.println("True");
    else
      System.out.println("False");

  }

  public String toString()
  { String s="";
    if (numberOfChildren==0 || numberOfChildren>1)
    {  s="Children";
    }
    else {s="Child";}
    return name + "," + maritalStatus + "," + numberOfChildren+" "+s;

  }

}
