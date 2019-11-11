import java.io.*;
import java.util.*;
public class AddPSystem
{
  public static void main(String[] args)
  {
      AddPInterface interface_ = new AddPInterface();
      AddPController controller = new AddPController();
      EntityPackages entity = new EntityPackages();
      boolean result = false;
      Packages pack = interface_.displayContentScreen();
      if (controller.checkValidity(controller.getPackageInfo(pack)))
      {
        result = entity.storePackage(controller.getPackageInfo(pack));
      }
      else
      {
          System.out.println("Some Error!!!");
      }

      if(result)
      {
          interface_.displaySuccess();
      }
      else
      {
        System.out.println("Not added!!!");
      }
    }
}
