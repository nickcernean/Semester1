public class HotelRoomTest
{
  public static void main(String[] args)
  { Guest guest1=new Guest("Nick Cernean",52643789);
    HotelRoom room1=new HotelRoom(805,"Family",null);
   room1.registerGuest(guest1);
   System.out.println(room1.isOccupied());
    System.out.println(room1.getRoomPrice("Family"));



    Guest guest2=new Guest("Nick Cernean",52643789);
    HotelRoom room2=new HotelRoom(605,"Family",null);
    System.out.println(room2.isOccupied());

    room2.registerGuest(guest2);
    System.out.println(room2.isOccupied());



  }
}
