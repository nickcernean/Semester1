package view;

import javafx.fxml.FXML;
import javafx.scene.layout.Region;
import model.Grade;
import model.GradeListModel;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import java.awt.*;

public class AddGradeViewController
{
  @FXML private TextField courseTextField;
  @FXML private TextField gradeTextField;
  @FXML private Label errorLabel;

  private Region root;
  private GradeListModel model;
  private ViewHandler viewHandler;

  public AddGradeViewController()
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
    this.errorLabel.setText("");
    this.courseTextField.setText("");
    this.gradeTextField.setText("");
  }

  public Region getRoot()
  {
    return root;
  }

  @FXML private void addGradeSubmitButton()
  {
    errorLabel.setText("");
    try
    {
      Grade grade = new Grade(Integer.parseInt(gradeTextField.getText()),
          courseTextField.getText());
      model.addGrade(grade);
      viewHandler.openView("list");

    }
    catch (Exception e)
    {
      errorLabel.setText("Illegal" + e.getMessage());
    }
  }

  @FXML private void addGradeCancelButton()
  {
    viewHandler.openView("list");
  }
}
