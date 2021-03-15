package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import model.DateModel;

public class ViewHandler
{
  private Scene currentScene;
  private Stage primaryStage;
  private DateModel model;
  private SetDateController dateViewController;
  private DateWindowViewController dateWindowViewController;

  public ViewHandler(DateModel model)
  {
    this.currentScene = new Scene(new Region());
    this.model = model;
  }

  public void start(Stage primaryStage)
  {
    this.primaryStage = primaryStage;
    openView("date");
  }

  public void openView(String id)
  {
    Region root = null;
    switch (id)
    {
      case "setDate":
        root = loadDateView("DateView.fxml");
        break;
      case "date":
        root = loadDateWindowView("DateWindowView.fxml");
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
    primaryStage.setHeight(root.getPrefHeight());
    primaryStage.setWidth(root.getPrefWidth());
    primaryStage.show();
  }

  public void closeView()
  {
    primaryStage.close();
  }

  private Region loadDateView(String fxmlFile)
  {
    if (dateViewController == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        Region root = loader.load();
        dateViewController = loader.getController();
        dateViewController.init(this, model, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    else
    {
      dateViewController.reset();
    }
    return dateViewController.getRoot();
  }

  private Region loadDateWindowView(String fxmlFile)
  {
    if (dateWindowViewController == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        Region root = loader.load();
        dateWindowViewController = loader.getController();
        dateWindowViewController.init(this, model, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    else
    {
      dateWindowViewController.reset();
    }
    return dateWindowViewController.getRoot();
  }



}
