public class Product
{
  private String name;
  private double price;

  public Product(String name, double price)
  {
    this.name = name;
    setPrice(price);
  }

  public String getName()
  {
    return name;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public Product copy()
  {

    Product other = new Product(name, price);
    return other;
  }

  public String toString()
  {
    String s = "";
    s = "Name of the product:" + name + "\nPrice of the product:" + price;
    return s;
  }
}
