public class Job
{
  private String title;
  private double salary;
  private Person employee;

  public Job(String title, double salary, Person employee)
  {
    this.title = title;
    setSalary(salary);
    this.employee = employee;

  }

  public Job(String title, double salary)
  {
    this.title = title;
    setSalary(salary);
    this.employee = null;
  }

  public void setSalary(double salary)
  {
    this.salary = salary;
  }

  public boolean isAvalaible()
  {
    return employee == null;
  }

  public void hire(Person employee)
  {
    if (isAvalaible())
    {
      this.employee = employee;
    }
    else
      this.employee = null;

  }

  public String getTitle()
  {
    return title;

  }

  public Person getEmployee()

  {
    return employee;
  }

  public double getSalary()
  {
    return salary;

  }

  public void fire()
  {
    this.employee = null;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Job))
    {
      return false;
    }
    Job other = (Job) obj;
    if (employee != null)
    {
      return title.equals(other.title) && salary == other.salary && employee
          .equals(other.employee);
    }
    else
    {
      return other.employee == null && title.equals(other.title)
          && salary == other.salary;
    }
  }

  public String toString()
  {
    String all = title + "," + salary + "," + employee;
    return all;
  }
}
