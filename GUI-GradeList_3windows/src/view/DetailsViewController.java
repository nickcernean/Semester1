package view;

import javafx.fxml.FXML;
import javafx.scene.layout.Region;
import model.GradeListModel;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import java.awt.*;

public class DetailsViewController
{
  @FXML private TextField countField;
  @FXML private TextField maxField;
  @FXML private TextField minField;
  @FXML private TextField averageField;
  @FXML private Label errorLabel;

  private Region root;
  private GradeListModel model;
  private ViewHandler viewHandler;

  public DetailsViewController()
  {

  }

  public void init(ViewHandler viewHandler, GradeListModel model, Region root)
  {
    this.viewHandler = viewHandler;
    this.model = model;
    this.root = root;
    reset();
  }

  public void reset()
  {
    this.countField.setText("");
    this.maxField.setText("");
    this.minField.setText("");
    this.averageField.setText("");
    try
    {
      this.countField.setText(model.gradeListSize() + "");
      this.maxField.setText(model.getMaxGrade() + "");
      this.minField.setText(model.getMinGrade() + "");
      this.averageField.setText(model.getAverageGrade() + "");
      this.errorLabel.setText("");
    }
    catch (Exception e)
    {
      this.errorLabel.setText(e.getMessage());
    }
  }

  public Region getRoot()
  {
    return root;
  }

  @FXML private void backButtonPressed()
  {
    viewHandler.openView("list");
  }

}
