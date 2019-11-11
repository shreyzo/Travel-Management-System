public class ShowPController
{
    ShowPInterface interface_;
    EntityPackage entity;
    Package pack;
    getPackageDetails(int pID)
    {
        pack = entity.packageDetails(pID);
        return pack;
    }

}
