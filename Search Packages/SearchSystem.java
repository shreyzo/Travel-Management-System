public class SearchSystem
{
    public static void main(String[] args)
    {
        SearchInterface interface_ = new SearchInterface();
        SearchController controller = new SearchController();
        EntityPackages entity = new EntityPackages();

        controller.getPlace(interface_.displayInputScreen());
        if(controller.checkValidity()!=true)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            interface_.displayPackages();              
        }

    }
}
