package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import model.Grade;
import model.GradeListModel;

public class GradeListViewModel
{
  private ObservableList<GradeViewModel> list;
  private GradeListModel model;

  public GradeListViewModel(GradeListModel model)
  {
    this.model = model;
    this.list = FXCollections.observableArrayList();
    update();
  }

  public void update()
  {
    list.clear();
    for (int i = 0; i < model.gradeListSize(); i++)
    {
      list.add(new GradeViewModel(model.getGrade(i)));
    }
  }

  public ObservableList<GradeViewModel> getList()
  {
    return list;
  }

  public void remove(Grade grade)
  {
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).getCourseProperty().get().equals(grade.getCourse())
          && list.get(i).getGradeProperty().get() == grade.getGrade())
      {
        list.remove(i);
        break;
      }
    }
  }

  public void add(Grade grade)
  {
    list.add(new GradeViewModel(grade));
  }

}
