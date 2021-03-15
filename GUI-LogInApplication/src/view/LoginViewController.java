package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.LoginModel;

public class LoginViewController
{
  @FXML private TextField usernameField;
  @FXML private PasswordField passwordField;
  @FXML private Label errorLabel;
  private Region root;
  private ViewHandler viewHandler;
  private LoginModel model;

  public LoginViewController()
  {
  }

  public void init(ViewHandler viewHandler, LoginModel model, Region root)
  {
    this.viewHandler = viewHandler;
    this.model = model;
    this.root = root;
  }

  public void reset()
  {
    usernameField.setText("");
    passwordField.setText("");
    errorLabel.setText("");
  }

  public Region root()
  {
    return root;
  }

  @FXML private void onEnter(ActionEvent event)
  {
    if (event.getSource() == usernameField)
    {
      passwordField.requestFocus();
    }
    else
    {
      loginButtonPressed();
    }
  }

  @FXML private void keyTyped()
  {
    try
    {
      model.login(usernameField.getText(), passwordField.getText());
      errorLabel.setText("");
    }
    catch (Exception e)
    {
      errorLabel.setText(e.getMessage());
    }

  }

  @FXML private void loginButtonPressed()
  {
    try
    {
      model.login(usernameField.getText(), passwordField.getText());
      errorLabel.setText("Logged In");
    }
    catch (Exception e)
    {
      errorLabel.setText(e.getMessage());
    }

  }

  @FXML private void cancelButtonPressed()
  {
    viewHandler.closeView();
  }
}
