import java.util.ArrayList;

public class Hotel
{
  private String name;
  private ArrayList<HotelRoom> rooms;

  public Hotel(String name, HotelRoom[] rooms)
  {
    this.name = name;
    this.rooms = new ArrayList<>();
    for (int i = 0; i < rooms.length; i++)
    {
      this.rooms.add(rooms[i]);
    }
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfRooms()
  {
    return rooms.size();
  }

  public int getNumberOfAvailableRooms()
  {
    int count = 0;
    for (int i = 0; i < rooms.size(); i++)
    {
      if (!rooms.get(i).isOccupied())
        count++;
    }
    return count;
  }

  public int getNumberOfAvailableRooms(String roomType)
  {
    int count = 0;
    for (int i = 0; i < getNumberOfRooms(); i++)
    {
      if ((rooms.get(i).getType() == roomType) && (!rooms.get(i).isOccupied()))
        count++;
    }
    return count;
  }

  public HotelRoom getFirstAvailaibleRoom()
  {
    for (int i = 0; i < rooms.size(); i++)
    {
      if (!rooms.get(i).isOccupied())
      {
        return rooms.get(i);
      }

    }
    return null;
  }

  public HotelRoom getFirstAvailaibleRoom(double maxPrice)
  {
    for (int i = 0; i < rooms.size(); i++)
    {
      if (!rooms.get(i).isOccupied() && (rooms.get(i).getPrice() <= maxPrice))
      {
        return rooms.get(i);
      }

    }
    return null;
  }

  public HotelRoom[] getAllAvailaibleRoom(String roomType)
  {
    int c = getNumberOfAvailableRooms();
    HotelRoom[] avalaibleRooms = new HotelRoom[c];
    for (int i = 0; i < rooms.size(); i++)
    {
      if (!rooms.get(i).isOccupied() && (rooms.get(i).getType() == roomType))
      {
        avalaibleRooms[i] = rooms.get(i);
      }

    }
    return avalaibleRooms;
  }

  public boolean hasGuest(Guest guest)
  {
    for (int i = 0; i < rooms.size(); i++)
    {
      if (rooms.get(i).getGuest() == guest)
      {
        return true;
      }
    }

    return false;
  }

  public HotelRoom getRoom(Guest guest)
  {
    for (int i = 0; i < rooms.size(); i++)
    {
      if (rooms.get(i).getGuest() == guest)
        return rooms.get(i);
    }
    return null;
  }

}
