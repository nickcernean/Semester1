import javafx.application.Application;
import javafx.stage.Stage;

public class MyApplication extends Application
{
  @Override public void start(Stage stage)
  {
    ViewHandler view = new ViewHandler();
    view.start(stage);
  }
}
