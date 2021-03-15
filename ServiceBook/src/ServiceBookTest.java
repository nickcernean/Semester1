import java.util.Arrays;

public class ServiceBookTest
{
  public static void main(String[] args)
  {
    Car car = new Car("NKA-12321", 60000);

    ServiceBook serviceBook = new ServiceBook();
    Service[] services = new Service[4];

    services[0] = new Service(20000, new Date(11, 12, 2015));
    services[1] = new Service(30000, new Date(15, 9, 2016));
    services[2] = new Service(40000, new Date(1, 2, 2017));
    services[3] = new Service(60000, new Date(19, 11, 2017));

    serviceBook.addService(services[0]);
    serviceBook.addService(services[1]);
    serviceBook.addService(services[2]);

    car.drive(70000);
    car.service(services[3]);
//    System.out.println(Arrays.toString(serviceBook.getAllServices()));
    System.out.println("Service book: "+car.getServiceBook());

  }
}
