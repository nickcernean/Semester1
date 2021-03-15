import java.util.ArrayList;

public class Kindergarten
{
  private int countTeachers;
  private ArrayList<Child> childs;

  public Kindergarten()
  {
    this.childs = new ArrayList<>();
  }

  public void addChild(Child child)
  {
    childs.add(child);
  }

  public void removeChild(Child child)
  {
    childs.remove(child);
  }

  public void hireTeachers(int count)
  {
    countTeachers = countTeachers + count;
  }

  public void fireteacher()
  {
    countTeachers--;
  }

  public int countChildren()
  {
    return childs.size();
  }

  public int countTeachers()
  {
    return countTeachers;
  }

  public double getAverageChildAge()
  {
    double sum = 0;
    for (int i = 0; i < childs.size(); i++)
    {
      sum += childs.get(i).getAge();
    }
    return sum / (double) countChildren();

  }

  public double getNorm()
  {
    return (double) countChildren() / (double) countTeachers();
  }

  public void celebrateBirthday(String name)
  {
    for (int i = 0; i < childs.size(); i++)
    {
      if (childs.get(i).getName().equals(name))
      {
        int bday = childs.get(i).getAge();
        childs.get(i).setAge(bday++);
      }
    }
  }

 @Override public String toString()
  {
    String s = null;
    for (int i = 0; i < childs.size(); i++)
    {
      s += childs.get(i);
    }
    return s;
  }
}
