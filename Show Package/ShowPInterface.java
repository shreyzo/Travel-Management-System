import java.io.*;
import java.util.*;
public class ShowPInterface
{
    private int pID;
    public int show()
    {
        System.out.println("Select package");
        System.out.println("1. Manali");
        System.out.println("2. Delhi");
        // System.out.println("Select package");
        // System.out.println("Select package");
        Scanner sc = new Scanner(System.in);
        pID = sc.nextInt();
        return pID;
    }
    void displayPackage(Package pack)
    {
        System.out.println("Start Date: "+ pack.Start_Date);
    }

}
