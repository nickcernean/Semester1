public class AddressTest
{ public static void main(String[] args)
{ Address address1=new Address("Horsens","kamjatka",8,'Y',1,"D");
  System.out.println(address1);
  System.out.println("Town:"+address1.getTown());
  System.out.println("Street:"+address1.getStreet());
  System.out.println("Number:"+address1.getNumber());
  System.out.println("Letter:"+address1.getLetter());
  System.out.println("Floor:"+address1.isApartment());
  System.out.println("Door:"+address1.getDoor());
  System.out.println("Address:"+address1.toString());

  Address address2=new Address("Horsens","kamjatka",8,'-',1,"D");
  System.out.println(address1);
  System.out.println("Town:"+address2.getTown());
  System.out.println("Street:"+address2.getStreet());
  System.out.println("Number:"+address2.getNumber());
  System.out.println("Letter:"+address2.getLetter());
  System.out.println("Floor:"+address2.isApartment());
  System.out.println("Door:"+address2.getDoor());
  System.out.println("Address:"+address2.toString());





}
}
