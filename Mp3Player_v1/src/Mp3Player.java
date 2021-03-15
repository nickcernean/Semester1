import java.util.ArrayList;

public class Mp3Player
{
  private ArrayList<Song> songs;
  private Time maxLength;

  public Mp3Player(Time maxLength)
  {
    this.songs = new ArrayList<>();
    this.maxLength = maxLength;
  }

  public Time TotalLength()
  {
    int tlength = 0;
    for (int i = 0; i < songs.size(); i++)
    {
      tlength += songs.get(i).getLength().getTimeInSeconds();

    }
    return new Time(tlength);
  }

  public Song getSong(int index)
  {
    return songs.get(index);

  }

  public void addSong(Song song)
  {
    int getSum =
        TotalLength().getTimeInSeconds() + song.getLength().getTimeInSeconds();
    if (getSum <= maxLength.getTimeInSeconds())
    {
      songs.add(song);
    }

  }

  public int getNumberOfSongs()
  {
    return songs.size();
  }

  public String toString()
  {
    String s = "";
    for (int i = 0; i < songs.size(); i++)
    {
      s += "Song(" + i + "):" + songs.get(i);
    }
    return s;
  }

  public int getNumberOfSongsLongerThan(Time length)
  {
    int counter = 0;
    for (int i = 0; i < songs.size(); i++)
      if (songs.get(i).getLength().getTimeInSeconds() > length
          .getTimeInSeconds())
      {
        counter++;
      }
    return counter;
  }

  public int getSongsLongerThan(Time length)
  {
    int slt = 0;
    for (int i = 0; i < songs.size(); i++)
      if (length.getTimeInSeconds() > songs.get(i).getLength()
          .getTimeInSeconds())
      {
        slt = songs.get(i).getLength().getTimeInSeconds();
      }
    return slt;
  }

}