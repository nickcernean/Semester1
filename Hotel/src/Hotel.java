public class Hotel
{
  private String name;
  private HotelRoom[] rooms;

  public Hotel(String name, HotelRoom[] rooms)
  {
    this.name = name;
    this.rooms = rooms;
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfRooms()
  {
    return rooms.length;
  }

  public int getNumberOfAvailableRooms()
  {
    int count = 0;
    for (int i = 0; i < rooms.length; i++)
    {
      if (!rooms[i].isOccupied())
        count++;
    }
    return count;
  }

  public int getNumberOfAvailableRooms(String roomType)
  {
    int count = 0;
    for (int i = 0; i < getNumberOfRooms(); i++)
    {
      if ((rooms[i].getType() == roomType) && (!rooms[i].isOccupied()))
        count++;
    }
    return count;
  }

  public HotelRoom getFirstAvailaibleRoom()
  {
    for (int i = 0; i < rooms.length; i++)
    {
      if (!rooms[i].isOccupied())
      {
        return rooms[i];
      }

    }
    return null;
  }

  public HotelRoom getFirstAvailaibleRoom(double maxPrice)
  {
    for (int i = 0; i < rooms.length; i++)
    {
      if (!rooms[i].isOccupied() && (rooms[i].getPrice() <= maxPrice))
      {
        return rooms[i];
      }

    }
    return null;
  }

  public HotelRoom[] getAllAvailaibleRoom(String roomType)
  {
    int c = getNumberOfAvailableRooms();
    HotelRoom[] avalaibleRooms = new HotelRoom[c];
    for (int i = 0; i < rooms.length; i++)
    {
      if (!rooms[i].isOccupied() && (rooms[i].getType() == roomType))
      {
        avalaibleRooms[i] = rooms[i];
      }

    }
    return avalaibleRooms;
  }

  public boolean hasGuest(Guest guest)
  {
    for (int i = 0; i < rooms.length; i++)
    {
      if (rooms[i].getGuest() == guest)
      {
        return true;
      }
    }

    return false;
  }

  public HotelRoom getRoom(Guest guest)
  {
    for (int i = 0; i < rooms.length; i++)
    {if(rooms[i].getGuest()==guest)
      return rooms[i];
    }
return null;
  }

}
