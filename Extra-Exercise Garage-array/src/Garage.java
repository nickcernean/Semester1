public class Garage
{
  private Car[] carpositions;

  public Garage(int capacity)
  {
    this.carpositions = new Car[capacity];
  }

  public boolean isParkingAreaTaken(int position)
  {

    if (carpositions[position]==null)
    {
      return false;
    }

    return true;
  }

  public void park(Car car, int position)
  {

      if (!isParkingAreaTaken(position))
      {
        this.carpositions[position] = car;
      }
  }

  public Car takeACarRide(int position)
  {
    for (int i = 0; i < carpositions.length; i++)
    {
      if (isParkingAreaTaken(position))
      {
        carpositions[position] = null;
        return carpositions[position];
      }
    }
    return null;
  }

  public String toString()
  {
    String s = "";
    for (int i = 0; i < carpositions.length; i++)
    {
      s += carpositions[i];
    }
    return s;
  }
}




































