package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.DateModel;

public class SetDateController
{
  @FXML private TextField dayField;
  @FXML private TextField monthField;
  @FXML private TextField yearField;
  @FXML private Label errorLabel;

  private Region root;
  private DateModel model;
  private ViewHandler viewHandler;

  public SetDateController()
  {
  }

  public void init(ViewHandler view, DateModel model, Region root)
  {
    this.viewHandler = view;
    this.model = model;
    this.root = root;
    dayField.setText(String.valueOf(model.getDay()));
    monthField.setText(String.valueOf(model.getMonth()));
    yearField.setText(String.valueOf(model.getYear()));
    errorLabel.setText(model.getDate());

  }

  public void reset()
  {
    model.reset();
    dayField.setText(String.valueOf(model.getDay()));
    monthField.setText(String.valueOf(model.getMonth()));
    yearField.setText(String.valueOf(model.getYear()));
    errorLabel.setText(model.getDate());
  }

  public Region getRoot()
  {
    return root;
  }

  @FXML private void showButton()
  {
    try
    {
      model.set(Integer.parseInt(dayField.getText()),
          Integer.parseInt(monthField.getText()),
          Integer.parseInt(yearField.getText()));
      dayField.setText(dayField.getText());
      monthField.setText(monthField.getText());
      yearField.setText(yearField.getText());
      errorLabel.setText(model.getDate());

    }
    catch (Exception e)
    {
      errorLabel.setText(e.getMessage());
    }
  }

  @FXML private void stepForwardButton()
  {
    model.stepForwardOneDay();
    dayField.setText(String.valueOf(model.getDay()));
    monthField.setText(String.valueOf(model.getMonth()));
    yearField.setText(String.valueOf(model.getYear()));
    errorLabel.setText(model.getDate());
  }

  @FXML private void setDateButton()
  {
    viewHandler.openView("date");
    DateWindowViewController dateWindowViewController = new DateWindowViewController();

    Label label = dateWindowViewController.label();
    if (label.getId().equals("dateLabel"))
    {
      label.setText(String.valueOf(model.getDate()));
    }
  }

}
