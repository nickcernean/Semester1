
 package model;
public class Cd
{
  private String title;
  private String artist;
  private Song[] song;

  public Cd(String title, String artist, Song[] song)
  {
    this.title = title;
    setArtist(artist);
    this.song = song;
  }

  public Cd(String title, Song[] song)
  {
    this.title = title;
    setArtist(null);
    this.song = song;
  }

  public void setArtist(String artist)
  {
    this.artist = artist;
  }

  public String getTitle()
  {
    return title;
  }

  public String getArtist()
  {
    return artist;
  }

  public Song getSong(int index)
  {
    return  song[index];

  }

  public int getNumberOfSongs()
  {
    return song.length;
  }

  public Time TotalLength()
  {
    int tlength = 0;
    for (int i = 0; i < song.length; i++)
    {
      tlength += song[i].getLength().getTimeInSeconds();

    }
    return new Time(tlength);
  }

  public int getNumberOfSongsByArtist(String artist)
  {
    int count = 0;
    for (int i = 0; i < song.length; i++)
    {
      if (artist == song[i].getArtist())
      {
        count++;
      }

    }
    return count;
  }

  public Song[] getSongsByArtist(String artist)
  { int c=getNumberOfSongsByArtist(artist)+1;
    Song[] songbyartist=new Song[c];

    for (int i = 0; i < song.length; i++)
    {
      if (artist.equals( song[i].getArtist()))
      {
        songbyartist[i] = song[i];
      }
    }
    return songbyartist;
  }

  public int getLengthInSecondsOfLongestSong()
  {
    int sls = song[0].getLength().getTimeInSeconds();
    for (int i = 1; i < song.length; i++)
      if (song[i].getLength().getTimeInSeconds() > sls)
      {
        sls = song[i].getLength().getTimeInSeconds();
      }
    return sls;
  }

  public int getNumberOfSongsLongerThan(int lengthInSeconds)
  {
    int counter= 0;
    for (int i = 0; i < song.length; i++)
      if (song[i].getLength().getTimeInSeconds() > lengthInSeconds)
      {
        counter++;
      }
    return counter;
  }

  public String toString()
  { String s="";
    s="\nTitle"+getTitle()+"\nArtist"+getArtist();
    for(int i=0;i<song.length;i++)
    {
      s += "\n[Title" + i + "]:"+song[i];
    }
    return s;
  }
}
