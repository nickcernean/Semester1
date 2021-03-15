public class MyNumber
{
  private int number;

  public MyNumber(int number)
  {
    this.number = number;
  }

  public int getNumber()
  {
    return number;
  }

  public int getLastDigit()
  {

    number = number % 10;
    return Math.abs(number);
  }

  public int getFirstDigit()
  {
    while (number >= 10)
    {
      number /= 10;
    }
    return number;
  }

  public boolean isDivisibleBy(int anotherInt)
  {
    if (number % anotherInt == 0)
    {
      return true;
    }
    return false;
  }

  public int numberOfProperDivizors()
  {
    int count = 0;
    for (int i = 1; i < number; i++)
    {
      if (isDivisibleBy(i))

        count++;

    }
    return count;
  }

  public boolean isPrime()
  {
    int count = 0;
    for (int i = 1; i < number; i++)
      if (isDivisibleBy(i))
      {
        count++;
        if (count == 2)
        {
          return false;
        }
      }
    return true;

  }

  public String toString()
  {
    String s = "";
    if (isPrime())
    {
      s = number + "(Is a prime number)";
    }
    else
      s += number;
    return s;
  }

  public MyNumber plus(MyNumber anotherNumber)
  {
    if (anotherNumber == null)
    {
      return new MyNumber(number);
    }
    return new MyNumber(number + anotherNumber.number);
  }

  public boolean isPerfectNumber()
  {
    int sum = 0;
    for (int i = 1; i < number; i++)
    {
      if (isDivisibleBy(i))

        sum += i;

    }
    if (sum == number)
    {
      return true;
    }
    return false;
  }

}
