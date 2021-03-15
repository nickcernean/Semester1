import java.util.ArrayList;

public class ApartmentComplexTest
{
  public static void main(String[] args)
  {
    ApartmentComplex apartmentComplex = new ApartmentComplex("Lev Tolstoi ");
   apartmentComplex.add(new Apartment(1));
   apartmentComplex.add(new Apartment(2));
   apartmentComplex.add(new Apartment(3));
   apartmentComplex.add(new Apartment(4));
   apartmentComplex.add(new Apartment(5));
    System.out.println(apartmentComplex.getApartment(2));
    System.out.println(apartmentComplex.getFirstAvailaibleApartment());
    System.out.println(apartmentComplex.getNumberOfApartments());
    System.out.println(apartmentComplex.toString());
  }
}
