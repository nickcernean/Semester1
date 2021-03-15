import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeListTest
{ private GradeList gradeList;

  @BeforeEach void setUp()
  { gradeList=new GradeList();
  }

  @AfterEach void tearDown()
  {
  }

  @Test void addZero()
  { gradeList.addGrade(new Grade("Fx"));
  assertEquals("0",gradeList);
  }
  @Test void addOne()
  {  gradeList.addGrade(new Grade(1,"MSE"));
    assertEquals("No such grade",gradeList);

  }
  @Test void addMany()
  { gradeList.addGrade(new Grade("A"));
    assertEquals("12",gradeList);
    gradeList.addGrade(new Grade("B"));
    assertEquals("10",gradeList);
    gradeList.addGrade(new Grade("C"));
    assertEquals("7",gradeList);
    gradeList.addGrade(new Grade("D"));
    assertEquals("4",gradeList);
  }
  @Test void addBoundary()
  {



  }

}