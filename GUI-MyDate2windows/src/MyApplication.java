import javafx.application.Application;
import javafx.stage.Stage;
import model.DateModel;
import model.DateModelManager;
import view.ViewHandler;

public class MyApplication extends Application
{

  @Override public void start(Stage stage)
  {
    DateModel model=new DateModelManager();
    ViewHandler view=new ViewHandler(model);
    view.start(stage);
  }
}
