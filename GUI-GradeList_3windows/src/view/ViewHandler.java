package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import model.GradeListModel;

public class ViewHandler
{
  private Stage primaryStage;
  private Scene currentScene;
  private GradeListModel model;
  private GradeListViewController gradeListViewController;
  private AddGradeViewController addGradeViewController;
  private DetailsViewController detailsViewController;

  public ViewHandler(GradeListModel model)
  {
    currentScene = new Scene(new Region());
    this.model = model;
  }

  public void start(Stage primaryStage)
  {
    this.primaryStage = primaryStage;
    openView("list");
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
        gradeListViewController.init(this, model, root);

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

}
