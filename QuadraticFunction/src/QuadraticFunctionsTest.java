public class QuadraticFunctionsTest
{ public static void main(String[] args)
{ QuadraticFunction qdr1=new QuadraticFunction(1,2,2);
  System.out.println("a="+qdr1.getA());
  System.out.println("b="+qdr1.getB());
  System.out.println("c="+qdr1.getC());
  System.out.println("One root"+qdr1.getRoots());

  QuadraticFunction qdr2=new QuadraticFunction(2,-4,2);
  System.out.println("a="+qdr2.getA());
  System.out.println("b="+qdr2.getB());
  System.out.println("c="+qdr2.getC());
  System.out.println("One root"+qdr2.getRoots());

  QuadraticFunction qdr3=new QuadraticFunction(2,5,2);
  System.out.println("a="+qdr3.getA());
  System.out.println("b="+qdr3.getB());
  System.out.println("c="+qdr3.getC());
  System.out.println("One root"+qdr3.getRoots());





}
}
