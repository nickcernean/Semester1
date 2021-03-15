public class Garage
{
  private Car carposition0;
  private Car carposition1;

  public Garage()
  {
    this.carposition0 = null;
    this.carposition1 = null;
  }

  public boolean isParkingAreaTaken(int position)
  {
    if (position == 0)
      return carposition0 != null;
    else if (position == 1)
      return carposition1 != null;
    return true;
  }

  public void park(Car car, int position)
  {
    if (!isParkingAreaTaken(position))
      if (position == 0)
      {
        carposition0 = car;
      }
      else if (position == 1)
      {
        carposition1 = car;
      }
  }

  public Car takeACarRide(int position)
  {  Car c=carposition0;
    Car c2=carposition1;
    if (isParkingAreaTaken(position))
      if (position == 0)
      {
        carposition0 = null;
        return c;
      }
      else if (position == 1)
      { carposition1 = null;
        return c2;}

    return null;
  }

  public String toString()
  {
    return carposition1+","+carposition0;

  }
}


