import javafx.application.Application;
import javafx.stage.Stage;
import model.LoginModel;
import model.LoginModelManager;
import view.ViewHandler;

import java.awt.event.ActionEvent;

public class MyApplication extends Application
{
  @Override public void start(Stage stage) throws Exception
  {
    LoginModel model=new LoginModelManager();
    ViewHandler view=new ViewHandler(model);
    view.start(stage);
  }
}
