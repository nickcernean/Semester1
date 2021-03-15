public class Address
{
  private String town;
  private String street;
  private int number;
  private char letter;
  private int floor;
  private String door;

  public Address(String town, String street, int number, char letter, int floor,
      String door)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.letter = letter;
    this.floor = floor;
    this.door = door;
  }

  public Address(String town, String street, int number, char letter, int floor)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.letter = letter;
    this.floor = floor;
    this.door = null;
  }

  public Address(String town, String street, int number, int floor, String door)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.letter = '-';
    this.floor = floor;
    this.door = door;
  }

  public Address(String town, String street, int number, int floor)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.letter = '-';
    this.floor = floor;
    this.door = null;
  }

  public Address(String town, String street, int number)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.letter = '-';
    this.floor = Integer.MIN_VALUE;
    this.door = null;
  }

  public Address(String town, String street, int number, char letter)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.letter = letter;
    this.floor = Integer.MIN_VALUE;
    this.door = null;
  }

  public Address(String town, String street, int number, char letter,
      String door)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.letter = letter;
    this.floor = Integer.MIN_VALUE;
    this.door = door;
  }

  public Address(String town, String street, int number, String door)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.letter = '-';
    this.floor = Integer.MIN_VALUE;
    this.door = door;
  }

  public String getTown()
  {
    return town;
  }

  public String getStreet()
  {
    return street;
  }

  public int getNumber()
  {
    return number;
  }

  public char getLetter()
  {
    return letter;

  }

  public int getFloor()
  {
    return floor;
  }

  public String getDoor()
  {
    return door;
  }

  public boolean isApartment()
  {
    if (floor != Integer.MIN_VALUE)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public String getFullNumber()
  {
    if (letter == '-')
    {
      return "" + floor;
    }
    else
    {
      if (floor != Integer.MIN_VALUE)
      {
        return letter + floor + door;
      }
      else
      {
        return letter + floor + door;
      }
    }
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Address))
    {
      return false;
    }
    Address other=(Address)obj;
    return town.equals(other.town)&&street.equals(other.street)&&number==other.number
        &&letter==other.letter&&floor==other.floor&&door.equals(other.door);
  }

  public String toString()
  {
    return town + ", " + street + ", " + number + ", " + getFullNumber();

  }
}
