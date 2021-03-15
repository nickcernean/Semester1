public class PriorityNoteTest
{
  public static void main(String[] args)
  { Notebook mynotes=new Notebook(10);
  mynotes.addNote("Check Facebook");
  mynotes.addNote("Call my mother on the phone");
  mynotes.addHighPriorityNote("Make SDJ exercises");
    System.out.println("Most important:"+mynotes.getMostImportantNote());
    mynotes.removeNote(2);
    System.out.println("Most important:"+mynotes.getMostImportantNote());
  }
}
