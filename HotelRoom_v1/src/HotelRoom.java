public class HotelRoom
{
  private int number;
  private String type;
  private double price;
  private Guest guest;

  public HotelRoom(int number, String type,Guest guest)
  {
    this.number = number;
    this.type = type;
    this.guest = null;
    this.price = price;
  }

  public int getNumber()
  {
    return number;
  }

  public String getType()
  {
    return type;
  }

  public double getPrice()
  {
    return price;
  }

  public Guest getGuest()
  {
    return guest;
  }

  public double getRoomPrice(String type)
  {
    switch (type)
    {
      case "Single":
        return price = 59.50;
      case "Double":
        return price = 68.50;
      case "Family":
        return price = 99.25;
      default:
        return -1;
    }
  }

  public int getFloor()
  { int floor=0;
  floor=number/100;
  return floor;

  }

  public boolean isOccupied()
  {
    if (guest != null)
    {
      return true;
    }
    else
      return false;

  }

  public void registerGuest(Guest guest)
  {
    this.guest = guest;
  }

  public void vacate()
  {
    this.guest = null;
  }

  public String toString()
  {
    if (isOccupied())
      return guest + "Room type:" + type + "Number:" + number;
    else
      return "Avalaible";

  }

}
