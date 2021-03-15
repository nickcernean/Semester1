public class HotelTest
{
  public static void main(String[] args)
  {
    HotelRoom[] rooms1 = new HotelRoom[1];

    Guest guests[] = new Guest[6];
    try
    { Hotel hotel = new Hotel("Holiday Resort", rooms1);
      guests[0] = new Guest("Nick", 31223423);
      guests[1] = new Guest("Andrei", 33454313);
      guests[2] = new Guest("Joseph", 76575675);
      guests[3] = new Guest("Rokas", 38338243);
      guests[4] = new Guest("Nik", 99272727);

      rooms1[0] = new HotelRoom(001, "Single");
      rooms1[1] = new HotelRoom(002, "Double");
      rooms1[2] = new HotelRoom(003, "Single");
      rooms1[3] = new HotelRoom(004, "Family");
      rooms1[4] = new HotelRoom(005, "Single");

    }
    catch (IllegalArgumentException e)
    {
      System.out.println("Exception:" + e.getMessage());
      e.printStackTrace();
    }
    //    System.out.println("Name:" + hotel.getName());
    //    System.out.println("Number of Rooms:" + hotel.getNumberOfRooms());
    //    System.out.println(
    //        "Number of availaible rooms:" + hotel.getNumberOfAvailableRooms());
    //    System.out.println("Number of single availaible rooms:" + hotel
    //        .getNumberOfAvailableRooms("Family"));
    //    System.out.println(Arrays.toString(hotel.getAllAvailaibleRoom("Family")));

//    System.out.println(guests[0].getName());
//    System.out.println(rooms1[0].getType());



    //    rooms1[0].registerGuest(guests[0]);
    //    System.out.println("Room:" + rooms1[0]);
    //    System.out.println(hotel.hasGuest(guests[0]));

  }
}

