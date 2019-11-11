import java.io.*;
import java.util.*;
public class SearchController
{
    //ArrayList<String> packs = new ArrayList<String>();
    String place;
    void getPlace(String pl)
    {
        place= pl;
    }

    public boolean checkValidity()
    {
        String[] arr = place.split("[~#@*+%{}<>\\[\\]|\"\\_^]", 2);
        if(arr.length > 1) return false;
        else return true;
    }

    ArrayList<String> getPackages()
    {
        EntityPackages entity = new EntityPackages();
        return entity.searchPackages(place);
    }
}
