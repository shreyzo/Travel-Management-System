import java.util.Scanner;
import java.io.*;
import java.util.*;
public class AddPInterface
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
        AddPController controller;
        Packages pack;

  public Packages displayContentScreen()
  {
    System.out.print("Enter Place");
    Scanner sc = new Scanner(System.in);
    String Place = sc.nextLine();
    System.out.print("Enter Start Date");
    Scanner sc1 = new Scanner(System.in);
    String Start_Date = sc1.nextLine();
    // System.out.print("Enter Total_Days");
    // Scanner sc = new Scanner(System.in);
    // int Total_Days = sc.nextLine();
    // System.out.print("Enter Place");
    // Scanner sc = new Scanner(System.in);
    // Float Price = sc.nextLine();
    Contact = "1234567890";
    pack = new Packages();
    pack.set(Place, Start_Date, Contact);
    return pack;
  }

  public void displaySuccess()
  {
      System.out.println("Package added successfully");

  }

  // public Packages passToController()
  // {
  //     Packages pack = new Packages();
  //     pack.Start_Date = Start_Date;
  //     pack.Place = Place;
  //     pack.Contact =  "1234567890";
  //     return pack;
  // }
}
