import javafx.application.Application;
import javafx.stage.Stage;
import model.GradeListModel;
import model.GradeListModelManager;
import view.ViewHandler;

public class MyApplication extends Application
{

  @Override public void start(Stage stage)
  {
    GradeListModel model=new GradeListModelManager();
    ViewHandler view=new ViewHandler(model);
    view.start(stage);
  }
}
