import java.security.spec.RSAOtherPrimeInfo;

public class JobTest
{
  public static void main(String[] args)
  { Name name1=new Name("Nick","Cernean");
   MyDate date1=new MyDate(29,11,2000);
   Person person1=new Person(name1,date1,'M');
   Job job=new Job("Software developer",4000);
    Job job2=new Job("Software developer",4000,person1);
    System.out.println(job.getTitle());
    System.out.println(job.getSalary());

    System.out.println("Avalaibility of job:"+job.isAvalaible());
    System.out.println("Equals:"+job.equals(job2));

    job.hire(person1);

    System.out.println("Avalaibility of job:"+job.isAvalaible());
    System.out.println("Equals:"+job.equals(job2));

    job.fire();
    System.out.println("Avalaibility of job:"+job.isAvalaible());
    System.out.println("Equals:"+job.equals(job2));
   System.out.println();


//    System.out.println("Job offer: "+job.toString());
//    Name name2=new Name("Nick","Cernean");
//    MyDate date2=new MyDate(29,11,2000);
//    Person person2=new Person(name1,date1,'M');
//    Job job2=new Job("Software developer",4000,person1);
//    System.out.println( job.equals(job2));

  }
}
