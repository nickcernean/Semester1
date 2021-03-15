import model1.GradeListModel;
import model1.GradeListModelManager;
import view.ConsoleView;

public class TestGradeList
{
  public static void main(String[] args)
  {
    GradeListModel model = new GradeListModelManager();
    ConsoleView view = new ConsoleView(model);
    view.start();
  }
}
