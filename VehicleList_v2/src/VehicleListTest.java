public class VehicleListTest
{
  public static void main(String[] args)
  {
    Engine engine1 = new Engine("6 cyl", 400, 3000, true);
    Engine engine2 = new Engine("8 cyl", 600, 4000, false);

    Car car1 = new Car("Ford", "Mustang", false, engine1);
    Car car2 = new Car("Ford", "Focus", true, engine2);
    Car car3 = new Car("VW", "Bora", false, engine1);
    Car car4 = new Car("Ford", "Ranger", true, engine2);

    VehicleList list = new VehicleList();
    list.add(car1);
    list.add(car2);
    list.add(car3);
    list.add(car4);
    System.out.println("Get by index:" + list.get(2));

    Car[] list2 = list.getCarsByGearType(true);
    for (int i = 0; i < list2.length; i++)
      if (list2[i] != null)
      {
        System.out.println(list2[i]);
      }

  }
}
