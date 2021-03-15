public class TestCarRental
{
  public static void main(String[] args)
  {
    CarRental carRental = new CarRental("NicksCompany", "Kamjatka 13");

    carRental.addCar(new SportsCar("DC 31242", 130.43));
    carRental.addCar(new Van("DC 54333", 180.50, 12));
    carRental.addCar(new FamilyCar("FC 43242", 180.21, 6));

    System.out.println(carRental.getCar(1));
    Customer customer1=new Customer("Nicolae Cernean","Sondersgade 5");
    carRental.getCar(0).setRentedTo(customer1);
    System.out.println("Avalab sportcart:"+ carRental.getAvalaibleSportsCar());
    carRental.getCar(1).setRentedTo(customer1);
    System.out.println("Avalab van"+carRental.getAvailaibleVan(10));



  }

}
