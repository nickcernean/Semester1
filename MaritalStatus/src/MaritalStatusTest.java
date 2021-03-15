public class MaritalStatusTest
{
  public static void main(String[] args)
  { Person obj=new Person("NIck",19,'M');
    MaritalStatus stats = new MaritalStatus(obj, "Maried", 0);
    System.out.println("OK:"+stats.toString());
  }
}
