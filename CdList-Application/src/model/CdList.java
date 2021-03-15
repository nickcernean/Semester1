package model;

import java.util.ArrayList;

public class CdList
{
  ArrayList<Cd> cds;

  public CdList()
  {
    this.cds = new ArrayList<>();
  }

  public Cd getCd(int index)
  {
    return cds.get(index);
  }

  public CdList getCdsByTitle(String title)
  {
    CdList cdList = new CdList();
    for (int i = 0; i < cds.size(); i++)
    {
      if (cds.get(i).getTitle().equals(title))
        cdList.addCd(cds.get(i));
    }
    return cdList;
  }

  public int getNumberOfCds()
  {
    return cds.size();
  }

  public void addCd(Cd cd)
  {
    cds.add(cd);
  }

  public void removeCdByIndex(int index)
  {
    cds.remove(index);
  }

  public Cd removeFirsCdByTitle(String title)
  {
    Cd cd = null;
    for (int i = 0; i < cds.size(); i++)
    {
      if (cds.get(i).getTitle().equals(title))
      {
        cd = cds.get(i);
        cds.remove(cd);
      }
    }
    return cd;
  }

  @Override public String toString()
  {
    String s = "";
    for (int i = 0; i < cds.size(); i++)
    {
      s += cds.get(i);
    }
    return s;
  }
}
