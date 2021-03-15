public class GarageTest
{
  public static void main(String[] args)
  { Engine engine=new Engine("6 cyl",400,3000,false);
  Car car=new Car("Ford","Focus","Red",false,engine);
  Garage garage=new Garage();
    System.out.println("Taken or not:"+garage.isParkingAreaTaken(0));
    garage.park(car,0);
    System.out.println("Taken or not:"+garage.isParkingAreaTaken(0));
    System.out.println(garage.takeACarRide(0));
    System.out.println("Taken or not:"+garage.isParkingAreaTaken(0));



  }
}
