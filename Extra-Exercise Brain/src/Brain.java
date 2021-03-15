public class Brain
{
  private String activeMemoryItem;
  private String passiveMemoryItemOne;
  private String passiveMemoryItemTwo;

  public Brain()
  {
    this.activeMemoryItem = "";
    this.passiveMemoryItemOne = "";
    this.passiveMemoryItemTwo = "";
  }

  public int getIQ()
  {
    if ((activeMemoryItem.length() > 20 || passiveMemoryItemOne.length() > 20
        || passiveMemoryItemTwo.length() > 20) && (
        activeMemoryItem.length() > 10 && passiveMemoryItemOne.length() > 10
            && passiveMemoryItemTwo.length() > 10))
    {
      return 130;
    }
    if ((activeMemoryItem.length() > 10 && passiveMemoryItemOne.length() > 10
        && passiveMemoryItemTwo.length() > 10) || (
        activeMemoryItem.length() > 10 || passiveMemoryItemOne.length() > 10
            || passiveMemoryItemTwo.length() > 10))
    {
      return 100;
    }
    return 70;
  }

  public void remember(String info)
  {
    if (info.equals(passiveMemoryItemOne) || info.equals(passiveMemoryItemTwo))
    {
      this.activeMemoryItem = info;
    }
    else
    {
      passiveMemoryItemTwo = passiveMemoryItemOne;
      passiveMemoryItemOne = activeMemoryItem;
      activeMemoryItem = info;
    }
  }

  public void refreshMemory(String info)
  {
    String localvar = "";
    if (info.equals(passiveMemoryItemTwo))
    {
      localvar = activeMemoryItem;
      this.activeMemoryItem = passiveMemoryItemTwo;
      this.passiveMemoryItemTwo = localvar;
    }
    else if (info.equals(passiveMemoryItemOne))
    {
      localvar = activeMemoryItem;
      this.activeMemoryItem = passiveMemoryItemOne;
      this.passiveMemoryItemOne = localvar;
    }
  }

  public boolean recall(String info)
  {
    if (info.equals(activeMemoryItem) || info.equals(passiveMemoryItemOne)
        || info.equals(passiveMemoryItemTwo))
    {
      return true;
    }
    return false;
  }

  public String recall()
  {
    return activeMemoryItem;
  }

  public void bringPassiveToActive(int number1)
  {
    String localvar = "";
    switch (number1)
    {
      case 1:
      {
        localvar = activeMemoryItem;
        this.activeMemoryItem = passiveMemoryItemOne;
        this.passiveMemoryItemOne = localvar;
        break;
      }
      case 2:
        localvar = activeMemoryItem;
        this.activeMemoryItem = passiveMemoryItemTwo;
        this.passiveMemoryItemTwo = localvar;
        break;
    }

  }

}