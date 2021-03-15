import java.util.Arrays;

class TestClass
{
  public static void main(String[] args)
  {
    File[] files1 = new File[3];
    files1[0] = new File("Use of arrays", "pdf");
    files1[1] = new File("2 dimensional arrays", "pdf");
    files1[2] = new File("3 dimensional arrays", "xml");

    File[] files2 = new File[3];
    files2[0] = new File("MSE Hand-in1", "zip");
    files2[1] = new File("MSE Hand-in2", "pptx");
    files2[2] = new File("MSE Hand-in3", "docx");

    File[] files3 = new File[3];
    files2[0] = new File("CSS website examples", "zip");
    files2[1] = new File("Selectors game", "xml");
    files2[2] = new File("HTML introduction", "docx");

    Lesson lesson1 = new Lesson("Arrays", new Date(18, 1, 2021),
        new Time(20, 30, 0), new Time(21, 0, 0), files1);
    SkypeLesson lesson2 =new SkypeLesson("Inheritance",new Date(20, 1, 2021),new Time(8, 30, 0), new Time(9, 30, 0), files1,true,"Skypelink");
    DiscordLesson lesson3 =new DiscordLesson("GUI",new Date(21, 1, 2021),new Time(8, 30, 0), new Time(9, 30, 0), files1,true,"Class 1Y",false);

    Lesson lesson4 = new Lesson("Boolean algebra", new Date(19, 1, 2021),
        new Time(14, 30, 0), new Time(15, 30, 0), files2);
    SkypeLesson lesson5 =new SkypeLesson("Modular arithmetic",new Date(22, 1, 2021),new Time(8, 30, 0), new Time(9, 30, 0), files1,true,"Skypelink");
    DiscordLesson lesson6 =new DiscordLesson("Divisors",new Date(23, 1, 2021),new Time(8, 30, 0), new Time(9, 30, 0), files1,true,"Class 1Y",false);

    Lesson lesson7 = new Lesson("Forms", new Date(24, 1, 2021),
        new Time(14, 30, 0), new Time(15, 30, 0), files2);
    SkypeLesson lesson8 =new SkypeLesson("react.js",new Date(25, 1, 2021),new Time(8, 30, 0), new Time(9, 30, 0), files3,true,"Skypelink");
    DiscordLesson lesson9 =new DiscordLesson("UI with CSS",new Date(26, 1, 2021),new Time(8, 30, 0), new Time(9, 30, 0), files1,true,"Class 1Y",false);


    Course course1=new Course("SDJ");
    Course course2=new Course("MSE");
    Course course3=new Course("RWD");

    course1.addLesson(lesson1);
    course1.addLesson(lesson2);
    course1.addLesson(lesson3);

    course2.addLesson(lesson4);
    course2.addLesson(lesson5);
    course2.addLesson(lesson6);

    course3.addLesson(lesson7);
    course3.addLesson(lesson8);
    course3.addLesson(lesson9);

//    System.out.println("A lesson is sheduled for this date: "+course1.hasLessonOnDate(new Date(19,1,2021)));
//    System.out.println("All SDJ lessons: "+course1.getAllLessons());
//    System.out.println(course1.getOnlineLessons());
//    System.out.println(course1.getAllDiscordLessonsWithVoice());
//    System.out.println(course1.getSkypeLessons());
//    System.out.println(course1.getAllResources());

    Student student1=new Student(1,"Mark Zuckerberg");
    Student student2=new Student(2,"Cernean Nicolae");
    Student student3=new Student(3,"Jeff Bezos");

    student1.addCourse(course1);
    student1.addCourse(course2);
    student1.addGrade(10,course1);
    student1.addGrade(12,course2);

    student2.addCourse(course2);
    student2.addCourse(course3);
    student2.addGrade(12,course2);
    student2.addGrade(12,course3);

    student3.addCourse(course3);
    student3.addCourse(course1);
    student3.addGrade(10,course3);
    student3.addGrade(4,course1);

//    System.out.println(Arrays.toString(student1.getAllCourses()));
//    System.out.println(Arrays.toString(student1.getAllGrades()));
//    System.out.println(Arrays.toString(student2.getAllGrades()));
//    System.out.println(Arrays.toString(student3.getAllGrades()));
//    System.out.println(student3.getGradeAverage());
//    System.out.println(lesson1.getAllPDFs());

  Time time1=new Time(3,59,44);
//    Time time2=new Time(23,59,59);
//
//    time1.tic(360000);
//    System.out.println(time1);
//    System.out.println(time1.isBefore(time2))
//    System.out.println(lesson1.hasValidTime(new Time(18,16,0),new Time(19,16,0)));
//    lesson1.delayBy(10);

time1.tic(7200);
    System.out.println(time1);









  }
}