public class ShowPSystem
{
  public static void main(String[] args)
{
    ShowPInterface interface_ = new ShowPInterface();
    ShowPController controller = new ShowPController();
    EntityPackage entity = new EntityPackage();
    interface_.displayPackage(controller.getPackageDetails(interface_.show()));



  }

}
