import java.util.Scanner;
public class CarTest
{ public static void main(String[] args)
{ Scanner input=new Scanner(System.in);
System.out.println("Input the car maker:");
String make=input.nextLine();
  System.out.println("Input the car model:");
  String model=input.nextLine();
  System.out.println("Input the car colour:");
  String colour=input.nextLine();
  System.out.println("Input the car gear:");
  boolean manualGear=input.nextBoolean();
  Car car1=new Car(make,model,colour,manualGear);
    System.out.println("The car maker:"+car1.getMake());
  System.out.println("The car model:"+car1.getModel());
  System.out.println("The car colour:"+car1.getColour());
  System.out.println("Has Manual Gear"+car1.hasManualGear());
  System.out.println("Car:"+car1.toString());
  car1.setColour("RED");
  System.out.println("Colour update:"+car1.getColour());



}
}
