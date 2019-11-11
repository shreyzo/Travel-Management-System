import java.io.*;
import java.util.*;
public class AddPController
{
    EntityPackages entity;
    AddPInterface interface_;
    Packages pack;
    public Packages getPackageInfo(Packages p)
    {
        //pack = interface_.passToController();
        return p;
    }
    public boolean checkValidity(Packages pa)
    {
        if(pa.Contact.length() == 10)
          return true;
        return false;
    }
}
