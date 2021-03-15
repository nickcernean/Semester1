import java.util.Arrays;
import java.util.stream.IntStream;
public class grade
{
  private int gradeinD;

  int Dnum [] = {-3, 0, 2, 4, 7, 10 ,12};
  String ects [] = {"A", "B", "C", "D", "E", "Fx", "F"};

  public grade (int gradeinD){
    if (IntStream.of(Dnum).anyMatch(x -> x == gradeinD)){
      this.gradeinD = gradeinD;
    }else {
      this.gradeinD = -3;
    }

  }

  public grade (String ectsgrade){
    if (Arrays.asList(ects).contains(ectsgrade)){

      switch (ectsgrade){
        case "A":
          this.gradeinD = 12;
          break;
        case "B":
          this.gradeinD = 10;
          break;
        case "C":
          this.gradeinD = 7;
          break;
        case "D":
          this.gradeinD = 4;
          break;
        case "E":
          this.gradeinD = 2;
          break;
        case "Fx":
          this.gradeinD = 0;
          break;
        case "F":
          this.gradeinD = -3;
          break;
      }


    } else {
      this.gradeinD = -3;
    }
  }

  public int getGrade(){
    return gradeinD;
  }

  public String getEctsGrade(){
    switch (gradeinD){
      case 12:
        return "A";
      case 10:
        return "B";
      case 7:
        return "C";
      case 4:
        return "D";
      case 2:
        return "E";
      case 0:
        return "Fx";
      case -3:
        return "F";
    }
    return "Wrong";
  }


  public String toString(){
    String s = Integer.toString(gradeinD);

    return "Your grade is: " + s + ", " + getEctsGrade();


  }


}
/*public class Grade
{ private int grade ;
private String ectsGrade;

public Grade(int grade)
{  this.grade=grade; }

public Grade(String ectsGrade)
{ this.ectsGrade = ectsGrade; }
  public String getEctsGrade()
    { switch (grade)
    {
      case -3:
        return "F";
      case 0:
        return "Fx";
      case 2:
        return "E";
      case 4:
        return "D";
      case 7:
        return "C";
      case 10:
        return "B";
      case 12:
        return "A";
      default:
        return "-3";
    }
    }
    public  int getGrade()
    {
      if (grade < 0 || grade > 12)
      {
        System.out.println("Out of ");;
      }
      else
      {
        System.out.println("Nice"+ectsGrade);
      }
    return grade;
    }
    public String toString()
{  return  "Convertor:"+getGrade()+"/"+getEctsGrade(); }


}
*/