import java.util.ArrayList;

public class TvSeries
{
  private String title;
  private int numberOfEpisodes;
  private ArrayList<Actor> actors;

  public TvSeries(String title)
  {
    this.title = title;
    this.actors = new ArrayList<>();
    this.numberOfEpisodes = 0;
  }

  public void hireActor(Actor actor)
  {
    actors.add(actor);
  }

  public int getNumberOfActors()
  {
    return actors.size();
  }

  public Actor getActor(int index)
  {
    return actors.get(index);
  }

  public void awardEmmy(String name)
  {
    for (int i = 0; i < actors.size(); i++)
    {
      if (actors.get(i).getName().equals(name))
      {
        actors.get(i).awardEmmy();
      }
    }
  }

  public void makeNextEpisode()
  {
    this.numberOfEpisodes++;
    for (int i = 0; i < actors.size(); i++)
    {
      actors.get(i).participateInEpisode();
    }
  }

  public ArrayList<Actor> getEmmyWinners()
  {
    ArrayList<Actor> emmylist = new ArrayList<>();
    for (int i = 0; i < actors.size(); i++)
    {
      if (actors.get(i).getNumberOfEmmys() != 0)
      {
        emmylist.add(actors.get(i));
      }
    }
    return emmylist;
  }

  @Override public String toString()
  {
    String t = "";
    String s = "";
    for (int i = 0; i < actors.size(); i++)
    {
      s += actors.get(i) + "\n";
    }
    t = "Title:\n" + title + "Number of series:\n" + "Cast:\n" + s;
    return t;

  }

}
