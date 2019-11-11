public class Package
{
    int PackageID;
    String Start_Date;
    String Itenary;
    String Highlights;
    int Total_Days;
    String Place;
    Float Price;
    String End_Date;
    String Contact;
    Package pack;

  public Package get(int pID)
  {
    Package pack = new Package();
    if(pID == 1)
    {
      pack.Start_Date = "12/1/2019";
      pack.Highlights = "NIce Place";
      return pack;

    }
  }
}
