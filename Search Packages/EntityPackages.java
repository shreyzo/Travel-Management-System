import java.io.*;
import java.util.*;
public class EntityPackages
{
    //String place;
    public class Packages
    {
        int PackageID;
        Stirng Start_Date;
        String Itenary;
        String Highlights;
        int Total_Days;
        String Place;
        Float Price;
        String End_Date;
    }
    public ArrayList<String> packs = new ArrayList<String>();
    public void createList()
    {
      packs.add(new String("Himachal"));
      packs.add(new String("Delhi"));
      packs.add(new String("Mumbai"));
      packs.add(new String("Dubai"));
    }

    public ArrayList<String> searchPackages(String place)
    {
      createList();
      ArrayList<String> fPacks = new ArrayList<String>();
      for (int i=0; i<packs.size(); i++)
      {
        if(place== packs.get(i))
        {
          fPacks.add(packs.get(i));
        }
      }
      return fPacks;
    }
}
