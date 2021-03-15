public class Car
{
  private String make;
  private String model;
  private boolean manualGear;
  private Engine engine;

  public Car(String make, String model,boolean manualGear, Engine engine)
  {
    if (make == null)
    {
      make = "NO make";
    }
    if (model == null)
    {
      model = "No model";
    }
    this.make = make;
    this.model = model;
    this.manualGear = manualGear;
    setEngine(engine);
  }

  public String getMake()
  {
    return make;
  }

  public String getModel()
  {
    return model;
  }

  public boolean hasManualGear()
  {
    return manualGear;
  }

  public Engine getEngine()
  {
    return engine;
  }

  public void setEngine(Engine engine)
  {
    this.engine = engine;
  }

  @Override public String toString()
  {
    String s = make + " " + model + ", ";
    if (manualGear)
    {
      s += " manual gear";
    }
else
    {
      s += "automatic gear";
    }
    s += ", " + engine;
    return s;
  }

  @Override public boolean equals(Object obj)
  {
    if (!(obj instanceof Car))
    {
      return false;
    }
    Car other = (Car) obj;
    return make.equals(other.make) && model.equals(other.model) && engine
        .equals(other.engine) && manualGear == other.manualGear;
  }
}