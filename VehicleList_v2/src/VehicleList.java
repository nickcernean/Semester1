import java.util.ArrayList;

public class VehicleList
{
  private ArrayList<Car> list;

  public VehicleList()
  {
    this.list = new ArrayList<>();
    for (int i = 0; i < list.size(); i++)
    {
      this.list.add(list.get(i));
    }

  }

  public int size()
  {
    return list.size();
  }

  public boolean isFull()
  {
    return false;
  }

  public void add(Car vehicle)
  {
    list.add(vehicle);
  }

  public void remove(Car vehicle)
  {
    for (int i = 0; i < list.size(); i++)
    {
      if (vehicle.equals(list.get(i)))
      {
        list.remove(vehicle);
      }

    }
  }

  public Car get(int index)
  {
    return list.get(index);
  }

  public int getNumberOfCarsByMake(String make)
  {
    int count = 0;
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).getMake().equals(make))
      {
        count++;
      }
    }
    return count;
  }

  public int getNumberOfWithManualGear()
  {
    int count = 0;
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).hasManualGear())
      {
        count++;
      }
    }
    return count;
  }

  public int getNumberOfDieselCars()
  {
    int count = 0;
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).getEngine().isDiesel())
      {
        count++;
      }
    }
    return count;
  }

  public Car[] getCarsByMake(String make)
  {
    Car[] car = new Car[getNumberOfCarsByMake(make)];
    int counter = 0;
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).getMake().equals(make))
      {
        car[counter] = list.get(i);
        counter++;
      }

    }
    return car;
  }

  public Car[] getCarsByGearType(boolean manualGear)
  {
    Car[] manual = new Car[getNumberOfWithManualGear()+1];
    Car[] auto = new Car[list.size()-getNumberOfWithManualGear()];
    int counter1 = 0;
    int counter2 = 0;

    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).hasManualGear())
      {
        manual[counter1] = list.get(i);
        counter1++;
      }
      else
      {
        auto[counter2] = list.get(i);
        counter2++;
      }

    }
    if(manualGear)
      {return manual;}
    return auto;
  }

  public Car getFirstCarByHorsepower(int minHorsePower)
  {
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).getEngine().getHorsePower() >= minHorsePower)
      {
        return list.get(i);
      }

    }
    return null;
  }
}
