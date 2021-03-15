import java.util.ArrayList;

public class Order
{
  private ArrayList<OrderLine> orderLines;

  public Order()
  {
    this.orderLines = new ArrayList<>();
  }

  public void addProduct(int amount, Product product)
  {
    orderLines.add(new OrderLine(amount, product));
  }

  public int getNumberOfOrderLines()
  {
    return orderLines.size();
  }

  public OrderLine getOrderLine(int index)
  {
    return orderLines.get(index);
  }

  public double getTotalPrice()
  {
    double sum = 0;

    for (int i = 0; i < orderLines.size(); i++)
    {
      sum +=orderLines.get(i).getAmount()*orderLines.get(i).getPrice();
    }

    return sum;
  }
}
