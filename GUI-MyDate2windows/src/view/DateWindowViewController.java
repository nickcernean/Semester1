package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import model.DateModel;

public class DateWindowViewController
{
  @FXML private Label dateLabel;

  private Region root;
  private ViewHandler viewHandler;
  private DateModel model;

  public DateWindowViewController()
  {

  }

  public void init(ViewHandler viewHandler, DateModel model, Region root)
  {
    this.viewHandler = viewHandler;
    this.model = model;
    this.root = root;
  }

  public Region getRoot()
  {
    return root;
  }

  public void reset()
  {
    model.reset();
  }

  @FXML private void setButton()
  {
    viewHandler.openView("setDate");
  }

  @FXML private void cancelButton()
  {
    viewHandler.closeView();
  }

  public Label label()
  {
   return dateLabel;
  }
}
