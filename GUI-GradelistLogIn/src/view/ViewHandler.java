package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import model.GradeListModel;
import model.LoginModel;

public class ViewHandler
{
  private Stage primaryStage;
  private Scene currentScene;
  private GradeListModel model;
  private LoginModel loginModel;
  private GradeListViewController gradeListViewController;
  private AddGradeViewController addGradeViewController;
  private DetailsViewController detailsViewController;
  private LoginViewController loginViewController;

  public ViewHandler(GradeListModel model, LoginModel loginModel)
  {
    currentScene = new Scene(new Region());
    this.model = model;
    this.loginModel = loginModel;
  }

  public void start(Stage primaryStage)
  {
    this.primaryStage = primaryStage;
    openView("login");
  }

  public void openView(String id)
  {
    Region root = null;
    switch (id)
    {
      case "list":
        root = loadGradeListView("GradeList.fxml");
        break;
      case "add":
        root = loadAddGradeView("AddGrade.fxml");
        break;
      case "details":
        root = loadDetailsGradeView("DetailsGrade.fxml");
        break;
      case "login":
        root = loadLoginView("LoginView.fxml");
    }
    currentScene.setRoot(root);
    String title = "";
    if (root.getUserData() != null)
    {
      title += root.getUserData();
    }
    primaryStage.setTitle(title);
    primaryStage.setScene(currentScene);
    primaryStage.setWidth(root.getPrefWidth());
    primaryStage.setHeight(root.getPrefHeight());
    primaryStage.show();
  }

  public void closeView()
  {
    primaryStage.close();
  }

  public Region loadGradeListView(String fxml)
  {
    if (gradeListViewController == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxml));
        Region root = loader.load();
        gradeListViewController = loader.getController();
        gradeListViewController.init(this, model, root, loginModel);

      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    else
    {
      gradeListViewController.reset();
    }
    return gradeListViewController.getRoot();

  }

  private Region loadAddGradeView(String fxml)
  {
    if (addGradeViewController == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxml));
        Region root = loader.load();
        addGradeViewController = loader.getController();
        addGradeViewController.init(this, model, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();

      }
    }
    else
    {
      addGradeViewController.reset();
    }
    return addGradeViewController.getRoot();
  }

  private Region loadDetailsGradeView(String fxml)
  {
    if (detailsViewController == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxml));
        Region root = loader.load();
        detailsViewController = loader.getController();
        detailsViewController.init(this, model, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    else
    {
      detailsViewController.reset();
    }
    return detailsViewController.getRoot();
  }

  private Region loadLoginView(String fxmlFile)
  {
    if (loginViewController == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        Region root = loader.load();
        loginViewController = loader.getController();
        loginViewController.init(this, loginModel, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    else
    {
      loginViewController.reset();
    }
    return loginViewController.root();
  }
}
