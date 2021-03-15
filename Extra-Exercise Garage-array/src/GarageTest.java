public class GarageTest
{
  public static void main(String[] args)
  {
    Engine engine = new Engine("6 cyl", 400, 3000, false);
    Car car = new Car("Ford", "Focus", "Red", false, engine);
    Car car1 = new Car("VW", "Golf", "Black", true, engine);
    Garage garage = new Garage(4);

    garage.park(car, 0);
    garage.park(car, 1);
    garage.park(car, 2);
    garage.park(car, 3);

    System.out.println("Taken or not:" + garage.isParkingAreaTaken(0));
    garage.takeACarRide(0);
    System.out.println("Taken or not:" + garage.isParkingAreaTaken(0));

  }
}
