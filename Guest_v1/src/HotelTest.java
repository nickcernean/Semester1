public class HotelTest
{
   public static void main(String[] args)
   {
     HotelRoom room1 = new HotelRoom(881, HotelRoom.DOUBLE);
     System.out.println("Room:"+room1);
    Guest guest1=new Guest("bob",34543);
        room1.registerGuest(guest1);

     System.out.println("Room:"+room1);
     System.out.println("Floor:"+room1.getFloor());




   }
}
