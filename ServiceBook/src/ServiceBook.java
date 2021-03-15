import java.util.ArrayList;

public class ServiceBook
{
  private ArrayList<Service> services;

  public ServiceBook()
  {
    this.services = new ArrayList<>();
  }

  public void addService(Service service)
  {
    services.add(service);
  }

  public int getNumberOfServices()
  {
    return services.size();
  }

  public Service getService(int index)
  {
    return services.get(index);
  }

  public Service[] getAllServices()
  {
    Service[] listservice = new Service[getNumberOfServices()];
    int index = 0;
    for (int i = 0; i < services.size(); i++)
    {
      listservice[index] = services.get(i);
      index++;
    }
    return listservice;
  }

  public int[] getAllServiceMileages()
  {
    int[] serviceMileages = new int[getNumberOfServices()];
    int index = 0;
    for (int i = 0; i < services.size(); i++)
    {
      serviceMileages[index] = services.get(i).getMileage();
      index++;
    }
    return serviceMileages;
  }

  public boolean hasServiceonDate(Date date)
  {
    for (int i = 0; i < services.size(); i++)
    {
      if (date.equals(services.get(i).getDate()))

        return true;

    }
    return false;
  }

  public Date getDateOfLastService()
  {
    Date date = null;
    for (int i = 0; i < services.size(); i++)
    {
      date = services.get(i).getDate();
    }
    return date;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof ServiceBook))
    {
      return false;
    }
    ServiceBook other = (ServiceBook) obj;
    return services.equals(other.services);
  }

  @Override public String toString()
  {
    String s = "";
    for (int i = 0; i < services.size(); i++)
    {
      s += services.get(i)+"\n";
    }
    return  s;
  }
}