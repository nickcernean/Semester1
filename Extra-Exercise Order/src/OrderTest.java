public class OrderTest
{
  public static void main(String[] args)
  {
    Product[] products = new Product[5];
    products[0] = new Product("Bread", 15);
    products[1] = new Product("Butter", 25);
    products[2] = new Product("Potatoes", 12);
    products[3] = new Product("Tomatoes", 9);
    products[4] = new Product("Pineaplle", 30);

    Product product1=new Product("Rice",13);
    Order order = new Order();
    order.addProduct(5, products[0]);
    order.addProduct(2, products[1]);
    order.addProduct(15, products[2]);
    order.addProduct(8, products[3]);
    order.addProduct(1, products[4]);
    order.addProduct(3,product1);

    System.out.println("No of orderlines:" + order.getNumberOfOrderLines());
    System.out.println("Get orderline by index:" + order.getOrderLine(5));
    System.out.println("Total price:" + order.getTotalPrice());

  }
}
