import java.util.Arrays;

public class TvSeriesTest
{
  public static void main(String[] args)
  {
    Actor[] actors = new Actor[4];
    actors[0] = (new Actor("Stan Felix"));
    actors[1] = (new Actor("NicuCernean"));
    actors[2] = (new Actor("Leonardo DiCaprio"));
    actors[3] = (new Actor("Hoakin Phoenix"));

    Actor actor1 = new Actor("Cernean");

    TvSeries tvSeries1 = new TvSeries("Friends");

    tvSeries1.hireActor(actors[0]);
    tvSeries1.hireActor(actors[1]);
    tvSeries1.hireActor(actors[3]);
    tvSeries1.hireActor(actors[2]);
    tvSeries1.hireActor(actor1);

    System.out.println("Number of actors:" + tvSeries1.getNumberOfActors());
    System.out.println("Actor by index:" + tvSeries1.getActor(4));
    tvSeries1.awardEmmy("NicuCernean");



    tvSeries1.makeNextEpisode();
    tvSeries1.makeNextEpisode();
    tvSeries1.makeNextEpisode();
    tvSeries1.getActor(2).participateInEpisode();
    System.out.println("ToString:" + tvSeries1.toString());

    Actor[] array = new Actor[tvSeries1.getNumberOfActors()];
    Actor[] arr2 = tvSeries1.getEmmyWinners().toArray(array);
    for (int i = 0; i < arr2.length; i++)
    {
      System.out.println("Emmy:"+arr2[i]);
    }

  }
}
