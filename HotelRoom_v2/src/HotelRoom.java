public class HotelRoom
{

  private int number;
  private String type;
  private double price;;
  private Guest guest;
  private static double SINGLE_PRICE = 59.50;
  private static double DOUBLE_PRICE = 68.50;
  private static double FAMILY_PRICE = 99.25;

  public HotelRoom(int number, String type)
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

  public static double getRoomPrice(String type)
  {
    switch (type)
    {
      case "Single":
        return  SINGLE_PRICE;
      case "Double":
        return DOUBLE_PRICE;
      case "Family":
        return FAMILY_PRICE;
      default:
        return -1;
    }
  }

  public int getFloor()
  {
    int floor = 0;
    floor = number / 100;
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