import java.util.Scanner;
import java.io.*;
import java.util.*;
public class SearchInterface
{
  String place;

  public String displayInputScreen()
  {
    System.out.print("Enter Place");
    Scanner sc = new Scanner(System.in);
    // String input
    String place = sc.nextLine();
    return place;
  }

  public void displayPackages()
  {
      ArrayList<String> fPacks = new ArrayList<String>();
      SearchController controller = new SearchController();
      fPacks = controller.getPackages();
      for (int i=0; i<fPacks.size(); i++)
           System.out.print(fPacks.get(i)+" ");
  }

}
