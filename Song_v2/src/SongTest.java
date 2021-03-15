public class SongTest
{
  public static void main(String[] args)
  { Time time=new Time(2000);
    Song song=new Song("How deep is your love","Calvin Harris",time);
    System.out.println("Song:"+song.toString());
    time.set(6,5,3);
    Song song2=new Song("OneDance","Drake",time);
    System.out.println("Song:"+song2.toString());


  }
}
