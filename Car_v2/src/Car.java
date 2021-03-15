public class Car
{
  private String make;
  private String model;
  private String colour;
  private boolean manualGear;
  private Engine engine;

  public Car(String make, String model, String colour, boolean manualGear, Engine engine)
  {
    this.make = make;
    this.model = model;
    this.colour = colour;
    this.manualGear = manualGear;
    this.engine = engine;
  }

  public String getMake()
  {
    return make;
  }

  public Engine getEngine()
  {
    return engine;
  }

  public int getHorsePower()
  {
    return engine.getHorsePower();
  }

  public String getModel()
  {
    return model;
  }

  public String getColour()
  {
    return colour;
  }

  public boolean hasManualGear()
  {
    return manualGear;
  }

  public void setEngine(Engine engine)
  {
    this.engine = engine;

  }

  public String toString()
  {
    return make + " " + model + " " + colour + " " + manualGear + "\n Engine"
        + engine.toString();
  }

  public void setColour(String Colour)
  {
    this.colour = Colour;
  }

}

