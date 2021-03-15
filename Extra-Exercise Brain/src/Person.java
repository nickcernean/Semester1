public class Person
{
  private String name;
  private Brain brain;

  public Person(String name)
  {
    this.name = name;
    this.brain = new Brain();
  }

  public String getName()
  {
    return name;
  }

  public int getIQ()
  {
    return brain.getIQ();
  }

  public boolean doYouRememberThisTopic(String topic)
  {
    if (brain.recall(topic))
    {
      return true;
    }
    return false;
  }

  public void learnATopic(String topic)
  {
    if (doYouRememberThisTopic(topic))
    {
      this.brain.refreshMemory(topic);
    }
    this.brain.remember(topic);
  }

  public String presentTopic(int number)
  {
    switch (number)
    {
      case 1:
        return brain.recall();

      case 2:
        brain.bringPassiveToActive(1);
        return brain.recall();

      case 3:
        brain.bringPassiveToActive(2);
        return brain.recall();

      default:
        return "Illegal number";
    }

  }

  @Override public String toString()
  {
    return "Person{" + "name='" + name + '\'' + ", brain=" + brain.getIQ() + '}';
  }
}

