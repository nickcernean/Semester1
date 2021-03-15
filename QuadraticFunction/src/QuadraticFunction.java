public class QuadraticFunction
{ private double a;
private double b;
private double c;
public QuadraticFunction(double a,double b,double c)
{ this.a=a;
this.b=b;
this.c=c;
}
public double getA()
{ return a;
}
public double getB()
{ return b;
}
public double getC()
{ return c;
}
public double getValue(double x)
{ return x;
}
public String getRoots()
{  double D=Math.pow(b, 2)-(4*a*c);
double s=getValue(25);
      if(D<0)
          { System.out.println("NoRoots");}
      else { if(D==0)
            { System.out.println("One root: ");
              System.out.println(s=-(b/(2*a)));}
            else
      {
        if (D > 0)
        {
          System.out.print("Two roots: ");
          System.out.print(s= -1 * ((b + Math.sqrt(D)) / 2 * a));
          System.out.println(s = -1 * ((b - Math.sqrt(D)) / 2 * a));
        }
        }
          }
  return "";
            }






}
