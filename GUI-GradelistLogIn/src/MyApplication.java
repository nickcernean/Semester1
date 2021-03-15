import javafx.application.Application;
import javafx.stage.Stage;
import model.GradeListModel;
import model.GradeListModelManager;
import model.LoginModel;
import model.LoginModelManager;
import view.ViewHandler;

public class MyApplication extends Application
{

  @Override public void start(Stage stage)
  {
    GradeListModel model = new GradeListModelManager();
    LoginModel loginModel = new LoginModelManager();
    ViewHandler view = new ViewHandler(model, loginModel);
    view.start(stage);
  }
}
