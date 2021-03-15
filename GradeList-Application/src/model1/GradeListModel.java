package model1;

public interface GradeListModel
{
  int numberOfGrades();
  void addGrade(Grade grade);
  void removeGrade(int index);
  Grade getGrade(int index);
  Grade getMaxGrade();
  Grade getMinGrade();
  double getAverage();
  String getAll();



}
