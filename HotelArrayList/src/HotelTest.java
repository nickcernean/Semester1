import java.util.Arrays;

public class HotelTest
{
  public static void main(String[] args)
  {
    Guest guest1 = new Guest("Nick", 31223423);
    Guest guest2 = new Guest("Felix", 33454313);
    Guest guest3 = new Guest("Joseph", 76575675);
    Guest guest4 = new Guest("Rokas", 38338243);
    Guest guest5 = new Guest("Nik", 99272727);
    HotelRoom[] rooms1=new HotelRoom[5];

    rooms1[0]=new HotelRoom(001, "Single");
    rooms1[1]= new HotelRoom(002, "Double ");
    rooms1[2]=new HotelRoom(003, "Single");
    rooms1[3] = new HotelRoom(004, "Family");
    rooms1[4] = new HotelRoom(005, "Single");

    Hotel hotel=new Hotel("holiday Resort",rooms1);
    System.out.println("Name:"+hotel.getName());
    System.out.println("Number of Rooms:"+hotel.getNumberOfRooms());
    System.out.println("Number of availaible rooms:"+hotel.getNumberOfAvailableRooms());
    System.out.println("Number of single availaible rooms:"+hotel.getNumberOfAvailableRooms("Family"));
    System.out.println(Arrays.toString(hotel.getAllAvailaibleRoom("Family")));

    rooms1[0].registerGuest(guest1);
    System.out.println("Room:"+rooms1[0]);
    System.out.println(hotel.hasGuest(guest1));


  }
}
